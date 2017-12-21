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

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Headers.
 */
public class HeadersInner {
    /**
     * The RestProxy service to perform REST calls.
     */
    private HeadersService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of HeadersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadersInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(HeadersService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Headers to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface HeadersService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestId" })
        @POST("azurespecials/customNamedRequestId")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<HeaderCustomNamedRequestIdHeadersInner, Void>> customNamedRequestId(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestIdParamGrouping" })
        @POST("azurespecials/customNamedRequestIdParamGrouping")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<HeaderCustomNamedRequestIdParamGroupingHeadersInner, Void>> customNamedRequestIdParamGrouping(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("foo-client-request-id") String fooClientRequestId);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestIdHead" })
        @HEAD("azurespecials/customNamedRequestIdHead")
        @ExpectedResponses({200, 404})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean>> customNamedRequestIdHead(@HeaderParam("foo-client-request-id") String fooClientRequestId, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void customNamedRequestId(String fooClientRequestId) {
        customNamedRequestIdAsync(fooClientRequestId).blockingAwait();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> customNamedRequestIdAsync(String fooClientRequestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdHeadersInner, Void> object
     */
    public Single<RestResponse<HeaderCustomNamedRequestIdHeadersInner, Void>> customNamedRequestIdWithRestResponseAsync(String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdHeadersInner, Void> object
     */
    public Completable customNamedRequestIdAsync(String fooClientRequestId) {
        return customNamedRequestIdWithRestResponseAsync(fooClientRequestId)
            .toCompletable();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void customNamedRequestIdParamGrouping(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters).blockingAwait();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdParamGroupingAsync(headerCustomNamedRequestIdParamGroupingParameters), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdParamGroupingHeadersInner, Void> object
     */
    public Single<RestResponse<HeaderCustomNamedRequestIdParamGroupingHeadersInner, Void>> customNamedRequestIdParamGroupingWithRestResponseAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            throw new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null.");
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        return service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdParamGroupingHeadersInner, Void> object
     */
    public Completable customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        return customNamedRequestIdParamGroupingWithRestResponseAsync(headerCustomNamedRequestIdParamGroupingParameters)
            .toCompletable();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean customNamedRequestIdHead(String fooClientRequestId) {
        return customNamedRequestIdHeadAsync(fooClientRequestId).blockingGet();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId, ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(customNamedRequestIdHeadAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean> object
     */
    public Single<RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean>> customNamedRequestIdHeadWithRestResponseAsync(String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestIdHead(fooClientRequestId, this.client.acceptLanguage());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean> object
     */
    public Maybe<Boolean> customNamedRequestIdHeadAsync(String fooClientRequestId) {
        return customNamedRequestIdHeadWithRestResponseAsync(fooClientRequestId)
            .flatMapMaybe(new Function<RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean>, Maybe<Boolean>>() {
                public Maybe<Boolean> apply(RestResponse<HeaderCustomNamedRequestIdHeadHeadersInner, Boolean> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
