/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Error model.
 */
public class Error {
    /**
     * The status property.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /**
     * The constantId property.
     */
    @JsonProperty(value = "constantId", required = true)
    private int constantId;

    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Creates an instance of Error class.
     */
    public Error() {
        constantId = 1;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the Error object itself.
     */
    public Error withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the constantId value.
     *
     * @return the constantId value
     */
    public int constantId() {
        return this.constantId;
    }

    /**
     * Set the constantId value.
     *
     * @param constantId the constantId value to set
     * @return the Error object itself.
     */
    public Error withConstantId(int constantId) {
        this.constantId = constantId;
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
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }
}
