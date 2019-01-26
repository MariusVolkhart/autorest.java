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
import fixtures.lro.implementation.LROSADsPost202RetryInvalidHeaderHeadersInner;
import java.util.Map;

/**
 * Contains all response data for the post202RetryInvalidHeader operation.
 */
public final class LROSADsPost202RetryInvalidHeaderResponse extends RestResponse<LROSADsPost202RetryInvalidHeaderHeadersInner, Void> {
    /**
     * Creates an instance of LROSADsPost202RetryInvalidHeaderResponse.
     *
     * @param request the request which resulted in this LROSADsPost202RetryInvalidHeaderResponse.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROSADsPost202RetryInvalidHeaderResponse(HttpRequest request, int statusCode, LROSADsPost202RetryInvalidHeaderHeadersInner headers, Map<String, String> rawHeaders, Void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROSADsPost202RetryInvalidHeaderHeadersInner headers() {
        return super.headers();
    }
}
