/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report;

import com.microsoft.rest.v3.BodyResponse;
import com.microsoft.rest.v3.ServiceCallback;
import com.microsoft.rest.v3.ServiceFuture;
import fixtures.report.models.ErrorException;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * The interface for AutoRestReportService class.
 */
public interface AutoRestReportService {
    /**
     * Get test coverage report.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    Map<String, Integer> getReport();

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Map<String, Integer>> getReportAsync(ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     * Get test coverage report.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Map<String, Integer>>> getReportWithRestResponseAsync();

    /**
     * Get test coverage report.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Map<String, Integer>> getReportAsync();

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    Map<String, Integer> getReport(String qualifier);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Map<String, Integer>> getReportAsync(String qualifier, ServiceCallback<Map<String, Integer>> serviceCallback);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<BodyResponse<Map<String, Integer>>> getReportWithRestResponseAsync(String qualifier);

    /**
     * Get test coverage report.
     *
     * @param qualifier If specified, qualifies the generated report further (e.g. '2.7' vs '3.5' in for Python). The only effect is, that generators that run all tests several times, can distinguish the generated reports.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Map<String, Integer>> getReportAsync(String qualifier);
}
