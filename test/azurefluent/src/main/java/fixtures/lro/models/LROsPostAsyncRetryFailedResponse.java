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
import fixtures.lro.implementation.LROsPostAsyncRetryFailedHeadersInner;
import java.util.Map;

/**
 * Contains all response data for the postAsyncRetryFailed operation.
 */
public final class LROsPostAsyncRetryFailedResponse extends RestResponse<LROsPostAsyncRetryFailedHeadersInner, Void> {
    /**
     * Creates an instance of LROsPostAsyncRetryFailedResponse.
     *
     * @param request the request which resulted in this LROsPostAsyncRetryFailedResponse.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROsPostAsyncRetryFailedResponse(HttpRequest request, int statusCode, LROsPostAsyncRetryFailedHeadersInner headers, Map<String, String> rawHeaders, Void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROsPostAsyncRetryFailedHeadersInner headers() {
        return super.headers();
    }
}
