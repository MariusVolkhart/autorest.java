/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.microsoft.rest.v3.BodyResponse;
import com.microsoft.rest.v3.ServiceCallback;
import com.microsoft.rest.v3.ServiceFuture;
import com.microsoft.rest.v3.VoidResponse;
import fixtures.bodyboolean.models.ErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Bools.
 */
public interface Bools {
    /**
     * Get true Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getTrue();

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Boolean> getTrueAsync(ServiceCallback<Boolean> serviceCallback);

    /**
     * Get true Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Boolean>> getTrueWithRestResponseAsync();

    /**
     * Get true Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Boolean> getTrueAsync();

    /**
     * Set Boolean value true.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putTrue();

    /**
     * Set Boolean value true.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putTrueAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value true.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> putTrueWithRestResponseAsync();

    /**
     * Set Boolean value true.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> putTrueAsync();

    /**
     * Get false Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getFalse();

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Boolean> getFalseAsync(ServiceCallback<Boolean> serviceCallback);

    /**
     * Get false Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Boolean>> getFalseWithRestResponseAsync();

    /**
     * Get false Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Boolean> getFalseAsync();

    /**
     * Set Boolean value false.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putFalse();

    /**
     * Set Boolean value false.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putFalseAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Set Boolean value false.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> putFalseWithRestResponseAsync();

    /**
     * Set Boolean value false.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> putFalseAsync();

    /**
     * Get null Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getNull();

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Boolean> getNullAsync(ServiceCallback<Boolean> serviceCallback);

    /**
     * Get null Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Boolean>> getNullWithRestResponseAsync();

    /**
     * Get null Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Boolean> getNullAsync();

    /**
     * Get invalid Boolean value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getInvalid();

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Boolean> getInvalidAsync(ServiceCallback<Boolean> serviceCallback);

    /**
     * Get invalid Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Boolean>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid Boolean value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Boolean> getInvalidAsync();
}
