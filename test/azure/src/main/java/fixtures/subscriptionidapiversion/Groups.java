/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.subscriptionidapiversion.models.ErrorException;
import fixtures.subscriptionidapiversion.models.SampleResourceGroup;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Groups.
 */
public interface Groups {
    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SampleResourceGroup object if successful.
     */
    SampleResourceGroup getSampleResourceGroup(String resourceGroupName);

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;SampleResourceGroup&gt;} object
     */
    ServiceFuture<SampleResourceGroup> getSampleResourceGroupAsync(String resourceGroupName, final ServiceCallback<SampleResourceGroup> serviceCallback);

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;SampleResourceGroup&gt;} object if successful.
     */
    Maybe<SampleResourceGroup> getSampleResourceGroupAsync(String resourceGroupName);

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, SampleResourceGroup&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, SampleResourceGroup>> getSampleResourceGroupWithRestResponseAsync(String resourceGroupName);
}
