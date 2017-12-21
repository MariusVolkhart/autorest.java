/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OperationResultError model.
 */
public class OperationResultError {
    /**
     * The error code for an operation failure.
     */
    @JsonProperty(value = "code")
    private Integer code;

    /**
     * The detailed arror message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public Integer code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the OperationResultError object itself.
     */
    public OperationResultError withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the OperationResultError object itself.
     */
    public OperationResultError withMessage(String message) {
        this.message = message;
        return this;
    }
}
