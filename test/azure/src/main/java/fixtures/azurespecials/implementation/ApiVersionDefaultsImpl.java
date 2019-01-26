/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.microsoft.azure.v3.AzureProxy;
import com.microsoft.rest.v3.ServiceCallback;
import com.microsoft.rest.v3.ServiceFuture;
import com.microsoft.rest.v3.VoidResponse;
import com.microsoft.rest.v3.annotations.ExpectedResponses;
import com.microsoft.rest.v3.annotations.GET;
import com.microsoft.rest.v3.annotations.HeaderParam;
import com.microsoft.rest.v3.annotations.Host;
import com.microsoft.rest.v3.annotations.QueryParam;
import com.microsoft.rest.v3.annotations.UnexpectedResponseExceptionType;
import fixtures.azurespecials.ApiVersionDefaults;
import fixtures.azurespecials.models.ErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ApiVersionDefaults.
 */
public final class ApiVersionDefaultsImpl implements ApiVersionDefaults {
    /**
     * The proxy service used to perform REST calls.
     */
    private ApiVersionDefaultsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionDefaultsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionDefaultsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(ApiVersionDefaultsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionDefaults to be
     * used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface ApiVersionDefaultsService {
        @GET("azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> getMethodGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> getMethodGlobalNotProvidedValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> getPathGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> getSwaggerGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodGlobalValid() {
        getMethodGlobalValidAsync().block();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> getMethodGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> getMethodGlobalValidAsync() {
        return getMethodGlobalValidWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getMethodGlobalNotProvidedValid() {
        getMethodGlobalNotProvidedValidAsync().block();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getMethodGlobalNotProvidedValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalNotProvidedValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> getMethodGlobalNotProvidedValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalNotProvidedValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> getMethodGlobalNotProvidedValidAsync() {
        return getMethodGlobalNotProvidedValidWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getPathGlobalValid() {
        getPathGlobalValidAsync().block();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getPathGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> getPathGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getPathGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> getPathGlobalValidAsync() {
        return getPathGlobalValidWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getSwaggerGlobalValid() {
        getSwaggerGlobalValidAsync().block();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getSwaggerGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> getSwaggerGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSwaggerGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> getSwaggerGlobalValidAsync() {
        return getSwaggerGlobalValidWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }
}
