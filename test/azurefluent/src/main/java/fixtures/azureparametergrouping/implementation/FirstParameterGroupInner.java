/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for a set of operations, such as:
 * ParameterGrouping_postMultiParamGroups,
 * ParameterGrouping_postSharedParameterGroupObject.
 */
public class FirstParameterGroupInner {
    /**
     * The headerOne property.
     */
    @JsonProperty(value = "")
    private String headerOne;

    /**
     * Query parameter with default.
     */
    @JsonProperty(value = "")
    private Integer queryOne;

    /**
     * Get the headerOne value.
     *
     * @return the headerOne value
     */
    public String headerOne() {
        return this.headerOne;
    }

    /**
     * Set the headerOne value.
     *
     * @param headerOne the headerOne value to set
     * @return the FirstParameterGroupInner object itself.
     */
    public FirstParameterGroupInner withHeaderOne(String headerOne) {
        this.headerOne = headerOne;
        return this;
    }

    /**
     * Get the queryOne value.
     *
     * @return the queryOne value
     */
    public Integer queryOne() {
        return this.queryOne;
    }

    /**
     * Set the queryOne value.
     *
     * @param queryOne the queryOne value to set
     * @return the FirstParameterGroupInner object itself.
     */
    public FirstParameterGroupInner withQueryOne(Integer queryOne) {
        this.queryOne = queryOne;
        return this;
    }
}
