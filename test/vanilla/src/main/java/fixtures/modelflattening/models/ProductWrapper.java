/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.v3.serializer.JsonFlatten;

/**
 * The wrapped produc.
 */
@JsonFlatten
public class ProductWrapper {
    /**
     * the product value.
     */
    @JsonProperty(value = "property.value")
    private String value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the ProductWrapper object itself.
     */
    public ProductWrapper withValue(String value) {
        this.value = value;
        return this;
    }
}
