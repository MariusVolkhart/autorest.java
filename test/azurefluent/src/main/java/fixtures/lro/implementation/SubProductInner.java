/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v3.SubResource;
import com.microsoft.rest.v3.serializer.JsonFlatten;

/**
 * The SubProductInner model.
 */
@JsonFlatten
public class SubProductInner extends SubResource {
    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Possible values include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
     * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted',
     * 'OK'.
     */
    @JsonProperty(value = "properties.provisioningStateValues", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningStateValues;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SubProductInner object itself.
     */
    public SubProductInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the provisioningStateValues value.
     *
     * @return the provisioningStateValues value.
     */
    public String provisioningStateValues() {
        return this.provisioningStateValues;
    }
}
