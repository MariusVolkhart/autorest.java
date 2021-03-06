// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using AutoRest.Core;
using AutoRest.Core.Model;
using AutoRest.Core.Utilities;
using AutoRest.Extensions.Azure;
using AutoRest.Java.azure.Templates;
using AutoRest.Java.Azure.Fluent.Model;
using AutoRest.Java.azurefluent.Templates;
using AutoRest.Java.azurefluent.Templates.FluentCommon;
using AutoRest.Java.azurefluent.Templates.GroupableResource;
using AutoRest.Java.azurefluent.Templates.NestedResource;
using AutoRest.Java.azurefluent.Templates.NonGroupableTopLevelResource;
using AutoRest.Java.azurefluent.Templates.ReadOnlyResource;
using AutoRest.Java.Model;
using AutoRest.Java.vanilla.Templates;
using System;
using System.Linq;
using System.Threading.Tasks;

namespace AutoRest.Java.Azure.Fluent
{
    public class CodeGeneratorJvaf : CodeGeneratorJva
    {
        private const string ClientRuntimePackage = "com.microsoft.azure:azure-client-runtime:1.3.0";
        private const string _packageInfoFileName = "package-info.java";

        public override bool IsSingleFileGenerationSupported => true;

        public override string UsageInstructions => $"The {ClientRuntimePackage} maven dependency is required to execute the generated code.";

        /// <summary>
        /// Generates C# code for service client.
        /// </summary>
        /// <param name="serviceClient"></param>
        /// <returns></returns>
        public override async Task Generate(CodeModel cm)
        {
            var packagePath = $"src/main/java/{Settings.Instance.Namespace.ToLower().Replace('.', '/')}";

            // get Azure Java specific codeModel
            var codeModel = cm as CodeModelJvaf;
            if (codeModel == null)
            {
                throw new InvalidCastException("CodeModel is not a Azure Java Fluent CodeModel");
            }

            SegmentFluentMethodGroups innerMGroupToFluentMGroup = null;
            if (true == AutoRest.Core.Settings.Instance.Host?.GetValue<bool?>("generate-interface").Result)
            {
                var idParsingUtilsTemplate = new IdParsingUtilsTemplate { Model = codeModel };
                await Write(idParsingUtilsTemplate, $"{packagePath}/implementation/IdParsingUtils{ImplementationFileExtension}");

                innerMGroupToFluentMGroup = SegmentFluentMethodGroups.InnerMethodGroupToSegmentFluentMethodGroups(codeModel);


                #region  Produce all method group interfaces
                // 
                foreach (IFluentMethodGroup group in innerMGroupToFluentMGroup.Select(m => m.Value.PrunedMethodGroup))
                {
                    var methodGroupInterfaceTemplate = new FluentMethodGroupInterfaceTemplate { Model = new ClientFluentMethodGroupInterface(group) };
                    await Write(methodGroupInterfaceTemplate, $"{packagePath}/{group.JavaInterfaceName.ToPascalCase()}{ImplementationFileExtension}");
                }
                //
                #endregion

                #region Produce all method group implementation
                //
                innerMGroupToFluentMGroup.Select(m => m.Value).ForEach(async list =>
                    {
                        var prunedGroup = list.PrunedMethodGroup;
                        if (prunedGroup.Type == MethodGroupType.GroupableTopLevel)
                        {
                            ClientFluentGroupableMethodGroupImpl groupImplModel = new ClientFluentGroupableMethodGroupImpl(prunedGroup);
                            var groupImplTemplate = new GroupableMethodGroupImplTemplate { Model = groupImplModel };
                            await Write(groupImplTemplate, $"{packagePath}/implementation/{groupImplModel.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                        }
                        else if (prunedGroup.Type == MethodGroupType.NonGroupableTopLevel)
                        {
                            ClientFluentNonGroupableTopLevelMethodGroupImpl groupImplModel = new ClientFluentNonGroupableTopLevelMethodGroupImpl(prunedGroup);
                            var groupImplTemplate = new NonGroupableTopLevelMethodGroupImplTemplate { Model = groupImplModel };
                            await Write(groupImplTemplate, $"{packagePath}/implementation/{groupImplModel.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                        }
                        else if (prunedGroup.Type == MethodGroupType.Nested)
                        {
                            ClientFluentNestedMethodGroupImpl groupImplModel = new ClientFluentNestedMethodGroupImpl(prunedGroup);
                            var groupImplTemplate = new NestedMethodGroupImplTemplate { Model = groupImplModel };
                            await Write(groupImplTemplate, $"{packagePath}/implementation/{groupImplModel.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                        }
                        else if (prunedGroup.Type == MethodGroupType.ActionsOnly)
                        {
                            var groupImplModel = new ClientFluentActionsOnlyMethodGroupImpl(prunedGroup);
                            var groupImplTemplate = new ActionsOnlyMethodGroupImplTemplate { Model = groupImplModel };
                            await Write(groupImplTemplate, $"{packagePath}/implementation/{groupImplModel.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                        }
                    });
                //
                #endregion

                #region  Produce readonly model interface & impl
                //
                foreach (ClientFluentReadOnlyModelInterface fluentModel in innerMGroupToFluentMGroup.ReadonlyFluentModels)
                {
                    var modelInterfaceTemplate = new ReadOnlyModelInterfaceTemplate { Model = fluentModel };
                    await Write(modelInterfaceTemplate, $"{packagePath}/{fluentModel.JavaInterfaceName.ToPascalCase()}{ImplementationFileExtension}");

                    //
                    var modelImplTemplate = new ReadOnlyModelImplTemplate { Model = fluentModel.Impl };
                    await Write(modelImplTemplate, $"{packagePath}/implementation/{fluentModel.Impl.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");

                    // No specific method group for readonly models these models are shared between other type of method groups [Groupable, no-Groupable-top-level and nested]
                }
                #endregion

                #region Produce nested model interface & impl
                //
                foreach (ClientFluentNestedModelInterface fluentModel in innerMGroupToFluentMGroup.NestedFluentModels)
                {
                    var modelInterfaceTemplate = new NestedModelInterfaceTemplate { Model = fluentModel };
                    await Write(modelInterfaceTemplate, $"{packagePath}/{fluentModel.JavaInterfaceName.ToPascalCase()}{ImplementationFileExtension}");

                    //
                    var modelImplTemplate = new NestedModelImplTemplate { Model = fluentModel.Impl };
                    await Write(modelImplTemplate, $"{packagePath}/implementation/{fluentModel.Impl.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                }
                #endregion

                #region Produce groupable model interface & impl
                //
                foreach (ClientFluentGroupableModelInterface fluentModel in innerMGroupToFluentMGroup.GroupableFluentModels)
                {
                    var modelInterfaceTemplate = new GroupableModelInterfaceTemplate { Model = fluentModel };
                    await Write(modelInterfaceTemplate, $"{packagePath}/{fluentModel.JavaInterfaceName.ToPascalCase()}{ImplementationFileExtension}");

                    var modelImplTemplate = new GroupableModelImplTemplate { Model = fluentModel.Impl };
                    await Write(modelImplTemplate, $"{packagePath}/implementation/{fluentModel.Impl.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                }
                #endregion

                #region Produce non-groupable top-level model interface & impl

                foreach (ClientFluentNonGroupableTopLevelModelInterface fluentModel in innerMGroupToFluentMGroup.NonGroupableTopLevelFluentModels)
                {
                    var modelInterfaceTemplate = new NonGroupableTopLevelModelInterfaceTemplate { Model = fluentModel };
                    await Write(modelInterfaceTemplate, $"{packagePath}/{fluentModel.JavaInterfaceName.ToPascalCase()}{ImplementationFileExtension}");

                    var modelImplTemplate = new NonGroupableTopLevelModelImplTemplate { Model = fluentModel.Impl };
                    await Write(modelImplTemplate, $"{packagePath}/implementation/{fluentModel.Impl.JavaClassName.ToPascalCase()}{ImplementationFileExtension}");
                }

                #endregion

                if (true == AutoRest.Core.Settings.Instance.Host?.GetValue<bool?>("generate-test").Result)
                {
                    var packageTestPath = $"src/test/java/{Settings.Instance.Namespace.ToLower().Replace('.', '/')}";
                    var testModel = new TestModel(codeModel);
                    await Write(new TestTemplate { Model = testModel }, $"{packageTestPath}/{testModel.ClassName}Test{ImplementationFileExtension}");
                }
            }

            // Service client
            var serviceClientTemplate = new AzureServiceClientTemplate { Model = codeModel };
            await Write(serviceClientTemplate, $"{packagePath}/implementation/{codeModel.Name.ToPascalCase()}Impl{ImplementationFileExtension}");

            // operations
            foreach (MethodGroupJvaf methodGroup in codeModel.AllOperations)
            {
                // Operation
                var operationsTemplate = new AzureMethodGroupTemplate { Model = methodGroup };
                await Write(operationsTemplate, $"{packagePath}/implementation/{methodGroup.TypeName.ToPascalCase()}Inner{ImplementationFileExtension}");
            }

            //Models
            foreach (CompositeTypeJvaf modelType in cm.ModelTypes.Concat(codeModel.HeaderTypes))
            {
                if (modelType.Extensions.ContainsKey(AzureExtensions.ExternalExtension) &&
                    (bool)modelType.Extensions[AzureExtensions.ExternalExtension])
                {
                    continue;
                }
                if (modelType.IsResource)
                {
                    continue;
                }

                var modelTemplate = new ModelTemplate { Model = modelType };
                await Write(modelTemplate, $"{packagePath}/{modelType.ModelsPackage.Trim('.')}/{modelType.Name.ToPascalCase()}{ImplementationFileExtension}");
            }

            //Enums
            foreach (EnumTypeJvaf enumType in cm.EnumTypes)
            {
                var enumTemplate = new EnumTemplate { Model = enumType };
                await Write(enumTemplate, $"{packagePath}/{enumType.ModelsPackage.Trim('.')}/{enumTemplate.Model.Name.ToPascalCase()}{ImplementationFileExtension}");
            }

            // Page class
            foreach (var pageClass in codeModel.pageClasses)
            {
                var pageTemplate = new PageTemplate
                {
                    Model = new PageJvaf(pageClass.Value, pageClass.Key.Key, pageClass.Key.Value),
                };
                await Write(pageTemplate, $"{packagePath}/implementation/{pageTemplate.Model.TypeDefinitionName.ToPascalCase()}{ImplementationFileExtension}");
            }

            // Exceptions
            foreach (CompositeTypeJv exceptionType in codeModel.ErrorTypes)
            {
                if (exceptionType.Name == "CloudError")
                {
                    continue;
                }

                var exceptionTemplate = new ExceptionTemplate { Model = exceptionType };
                await Write(exceptionTemplate, $"{packagePath}/{exceptionType.ModelsPackage.Trim('.')}/{exceptionTemplate.Model.ExceptionTypeDefinitionName}{ImplementationFileExtension}");
            }

            // package-info.java
            await Write(new PackageInfoTemplate
            {
                Model = new PackageInfoTemplateModel(cm)
            }, $"{packagePath}/{_packageInfoFileName}");
            await Write(new PackageInfoTemplate
            {
                Model = new PackageInfoTemplateModel(cm, "implementation")
            }, $"{packagePath}/implementation/{_packageInfoFileName}");

            if (true == AutoRest.Core.Settings.Instance.Host?.GetValue<bool?>("regenerate-manager").Result)
            {
                ServiceManagerModel serviceManagerModel = new ServiceManagerModel(codeModel, innerMGroupToFluentMGroup);
                // Manager
                await Write(
                    new AzureFluentServiceManagerTemplate { Model = serviceManagerModel },
                    $"{packagePath}/implementation/{serviceManagerModel.ManagerName}{ImplementationFileExtension}");

                // POM
                await Write(new AzureFluentPomTemplate { Model = codeModel }, "pom.xml");
            }
        }
    }
}
