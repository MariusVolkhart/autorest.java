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

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;
import fixtures.lro.implementation.LRORetrysPost202Retry200HeadersInner;
import java.util.Map;

/**
 * Contains all response data for the beginPost202Retry200 operation.
 */
public final class LRORetrysBeginPost202Retry200Response extends RestResponse<LRORetrysPost202Retry200HeadersInner, Void> {
    /**
     * Creates an instance of LRORetrysBeginPost202Retry200Response.
     *
     * @param request the request which resulted in this {response.Name}.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LRORetrysBeginPost202Retry200Response(HttpRequest request, int statusCode, LRORetrysPost202Retry200HeadersInner headers, Map<String, String> rawHeaders, Void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LRORetrysPost202Retry200HeadersInner headers() {
        return super.headers();
    }
}