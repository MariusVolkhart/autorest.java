/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.fluent.gencode.groupable_resource_inheritance.implementation;

import com.fluent.gencode.groupable_resource_inheritance.AccessUri;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AccessUriImpl extends WrapperImpl<AccessUriInner> implements AccessUri {
    private final PetsManager manager;
    AccessUriImpl(AccessUriInner inner, PetsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PetsManager manager() {
        return this.manager;
    }

    @Override
    public String accessSAS() {
        return this.inner().accessSAS();
    }

}
