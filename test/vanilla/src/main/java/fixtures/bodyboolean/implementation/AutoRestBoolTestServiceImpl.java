/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean.implementation;

import com.microsoft.rest.v3.RestProxy;
import com.microsoft.rest.v3.ServiceClient;
import com.microsoft.rest.v3.http.HttpPipeline;
import fixtures.bodyboolean.AutoRestBoolTestService;
import fixtures.bodyboolean.Bools;
import reactor.util.annotation.NonNull;

/**
 * Initializes a new instance of the AutoRestBoolTestService type.
 */
public final class AutoRestBoolTestServiceImpl extends ServiceClient implements AutoRestBoolTestService {
    /**
     * The Bools object to access its operations.
     */
    private Bools bools;

    /**
     * Gets the Bools object to access its operations.
     *
     * @return the Bools object.
     */
    public Bools bools() {
        return this.bools;
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     */
    public AutoRestBoolTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestBoolTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestBoolTestServiceImpl(@NonNull HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.bools = new BoolsImpl(this);
    }
}
