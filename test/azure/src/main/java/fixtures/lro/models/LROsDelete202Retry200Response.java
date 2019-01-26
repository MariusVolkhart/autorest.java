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

import com.microsoft.rest.v3.RestResponse;
import com.microsoft.rest.v3.http.HttpRequest;
import java.util.Map;

/**
 * Contains all response data for the delete202Retry200 operation.
 */
public final class LROsDelete202Retry200Response extends RestResponse<LROsDelete202Retry200Headers, Product> {
    /**
     * Creates an instance of LROsDelete202Retry200Response.
     *
     * @param request the request which resulted in this LROsDelete202Retry200Response.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROsDelete202Retry200Response(HttpRequest request, int statusCode, LROsDelete202Retry200Headers headers, Map<String, String> rawHeaders, Product body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROsDelete202Retry200Headers headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public Product body() {
        return super.body();
    }
}
