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
import com.microsoft.rest.v3.annotations.HeaderParam;
import com.microsoft.rest.v3.annotations.Host;
import com.microsoft.rest.v3.annotations.PathParam;
import com.microsoft.rest.v3.annotations.POST;
import com.microsoft.rest.v3.annotations.UnexpectedResponseExceptionType;
import fixtures.azurespecials.ErrorException;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * SubscriptionInMethods.
 */
public final class SubscriptionInMethodsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SubscriptionInMethodsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SubscriptionInMethodsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionInMethodsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(SubscriptionInMethodsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionInMethods to be
     * used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface SubscriptionInMethodsService {
        @POST("azurespecials/subscriptionId/method/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> postMethodLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/method/string/none/path/local/null/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> postMethodLocalNull(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/path/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> postPathLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @POST("azurespecials/subscriptionId/swagger/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> postSwaggerLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postMethodLocalValid(@NonNull String subscriptionId) {
        postMethodLocalValidAsync(subscriptionId).block();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> postMethodLocalValidAsync(@NonNull String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> postMethodLocalValidWithRestResponseAsync(@NonNull String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postMethodLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> postMethodLocalValidAsync(@NonNull String subscriptionId) {
        return postMethodLocalValidWithRestResponseAsync(subscriptionId)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postMethodLocalNull(@NonNull String subscriptionId) {
        postMethodLocalNullAsync(subscriptionId).block();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> postMethodLocalNullAsync(@NonNull String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodLocalNullAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> postMethodLocalNullWithRestResponseAsync(@NonNull String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postMethodLocalNull(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> postMethodLocalNullAsync(@NonNull String subscriptionId) {
        return postMethodLocalNullWithRestResponseAsync(subscriptionId)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postPathLocalValid(@NonNull String subscriptionId) {
        postPathLocalValidAsync(subscriptionId).block();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> postPathLocalValidAsync(@NonNull String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postPathLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> postPathLocalValidWithRestResponseAsync(@NonNull String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postPathLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> postPathLocalValidAsync(@NonNull String subscriptionId) {
        return postPathLocalValidWithRestResponseAsync(subscriptionId)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void postSwaggerLocalValid(@NonNull String subscriptionId) {
        postSwaggerLocalValidAsync(subscriptionId).block();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> postSwaggerLocalValidAsync(@NonNull String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSwaggerLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> postSwaggerLocalValidWithRestResponseAsync(@NonNull String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postSwaggerLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> postSwaggerLocalValidAsync(@NonNull String subscriptionId) {
        return postSwaggerLocalValidWithRestResponseAsync(subscriptionId)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }
}
