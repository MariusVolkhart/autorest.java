/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.microsoft.rest.v3.RestResponse;
import com.microsoft.rest.v3.http.HttpRequest;
import java.util.Map;

/**
 * Contains all response data for the get307 operation.
 */
public final class HttpRedirectsGet307Response extends RestResponse<HttpRedirectsGet307Headers, Void> {
    /**
     * Creates an instance of HttpRedirectsGet307Response.
     *
     * @param request the request which resulted in this HttpRedirectsGet307Response.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public HttpRedirectsGet307Response(HttpRequest request, int statusCode, HttpRedirectsGet307Headers headers, Map<String, String> rawHeaders, Void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public HttpRedirectsGet307Headers headers() {
        return super.headers();
    }
}
