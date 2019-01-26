/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.microsoft.rest.v3.Base64Url;
import com.microsoft.rest.v3.BodyResponse;
import com.microsoft.rest.v3.RestProxy;
import com.microsoft.rest.v3.ServiceCallback;
import com.microsoft.rest.v3.ServiceFuture;
import com.microsoft.rest.v3.VoidResponse;
import com.microsoft.rest.v3.annotations.BodyParam;
import com.microsoft.rest.v3.annotations.ExpectedResponses;
import com.microsoft.rest.v3.annotations.GET;
import com.microsoft.rest.v3.annotations.Host;
import com.microsoft.rest.v3.annotations.PUT;
import com.microsoft.rest.v3.annotations.ReturnValueWireType;
import com.microsoft.rest.v3.annotations.UnexpectedResponseExceptionType;
import fixtures.bodystring.Strings;
import fixtures.bodystring.models.ErrorException;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public final class StringsImpl implements Strings {
    /**
     * The proxy service used to perform REST calls.
     */
    private StringsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of StringsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public StringsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(StringsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Strings to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface StringsService {
        @GET("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<String>> getNull();

        @PUT("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> putNull(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<String>> getEmpty();

        @PUT("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> putEmpty(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<String>> getMbcs();

        @PUT("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> putMbcs(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<String>> getWhitespace();

        @PUT("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> putWhitespace(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/notProvided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<String>> getNotProvided();

        @GET("string/base64Encoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<byte[]>> getBase64Encoded();

        @GET("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<byte[]>> getBase64UrlEncoded();

        @PUT("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<VoidResponse> putBase64UrlEncoded(@BodyParam("application/json; charset=utf-8") Base64Url stringBody);

        @GET("string/nullBase64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<BodyResponse<byte[]>> getNullBase64UrlEncoded();
    }

    /**
     * Get null string value value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNull() {
        return getNullAsync().block();
    }

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getNullAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null string value value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<String>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null string value value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMap((BodyResponse<String> res) -> Mono.just(res.body()));
    }

    /**
     * Set string value null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull() {
        putNullAsync().block();
    }

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putNullWithRestResponseAsync() {
        final String stringBody = null;
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putNullAsync() {
        return putNullWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull(String stringBody) {
        putNullAsync(stringBody).block();
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putNullAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putNullWithRestResponseAsync(String stringBody) {
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putNullAsync(String stringBody) {
        return putNullWithRestResponseAsync(stringBody)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getEmpty() {
        return getEmptyAsync().block();
    }

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getEmptyAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty string value value ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<String>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get empty string value value ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMap((BodyResponse<String> res) -> Mono.just(res.body()));
    }

    /**
     * Set string value empty ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putEmpty() {
        putEmptyAsync().block();
    }

    /**
     * Set string value empty ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putEmptyAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(), serviceCallback);
    }

    /**
     * Set string value empty ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putEmptyWithRestResponseAsync() {
        final String stringBody = "";
        return service.putEmpty(stringBody);
    }

    /**
     * Set string value empty ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putEmptyAsync() {
        return putEmptyWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getMbcs() {
        return getMbcsAsync().block();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getMbcsAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getMbcsAsync(), serviceCallback);
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<String>> getMbcsWithRestResponseAsync() {
        return service.getMbcs();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> getMbcsAsync() {
        return getMbcsWithRestResponseAsync()
            .flatMap((BodyResponse<String> res) -> Mono.just(res.body()));
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMbcs() {
        putMbcsAsync().block();
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMbcsAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMbcsAsync(), serviceCallback);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putMbcsWithRestResponseAsync() {
        final String stringBody = "啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€";
        return service.putMbcs(stringBody);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putMbcsAsync() {
        return putMbcsWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getWhitespace() {
        return getWhitespaceAsync().block();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getWhitespaceAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getWhitespaceAsync(), serviceCallback);
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<String>> getWhitespaceWithRestResponseAsync() {
        return service.getWhitespace();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> getWhitespaceAsync() {
        return getWhitespaceWithRestResponseAsync()
            .flatMap((BodyResponse<String> res) -> Mono.just(res.body()));
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putWhitespace() {
        putWhitespaceAsync().block();
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putWhitespaceAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putWhitespaceAsync(), serviceCallback);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putWhitespaceWithRestResponseAsync() {
        final String stringBody = "    Now is the time for all good men to come to the aid of their country    ";
        return service.putWhitespace(stringBody);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putWhitespaceAsync() {
        return putWhitespaceWithRestResponseAsync()
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNotProvided() {
        return getNotProvidedAsync().block();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getNotProvidedAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<String>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .flatMap((BodyResponse<String> res) -> Mono.just(res.body()));
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64Encoded() {
        return getBase64EncodedAsync().block();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getBase64EncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64EncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<byte[]>> getBase64EncodedWithRestResponseAsync() {
        return service.getBase64Encoded();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<byte[]> getBase64EncodedAsync() {
        return getBase64EncodedWithRestResponseAsync()
            .flatMap((BodyResponse<byte[]> res) -> Mono.just(res.body()));
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64UrlEncoded() {
        return getBase64UrlEncodedAsync().block();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<byte[]>> getBase64UrlEncodedWithRestResponseAsync() {
        return service.getBase64UrlEncoded();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<byte[]> getBase64UrlEncodedAsync() {
        return getBase64UrlEncodedWithRestResponseAsync()
            .flatMap((BodyResponse<byte[]> res) -> Mono.just(res.body()));
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putBase64UrlEncoded(@NonNull byte[] stringBody) {
        putBase64UrlEncodedAsync(stringBody).block();
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putBase64UrlEncodedAsync(@NonNull byte[] stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putBase64UrlEncodedAsync(stringBody), serviceCallback);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<VoidResponse> putBase64UrlEncodedWithRestResponseAsync(@NonNull byte[] stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        return service.putBase64UrlEncoded(stringBodyConverted);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Void> putBase64UrlEncodedAsync(@NonNull byte[] stringBody) {
        return putBase64UrlEncodedWithRestResponseAsync(stringBody)
            .flatMap((VoidResponse res) -> Mono.just(res.body()));
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getNullBase64UrlEncoded() {
        return getNullBase64UrlEncodedAsync().block();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNullBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BodyResponse<byte[]>> getNullBase64UrlEncodedWithRestResponseAsync() {
        return service.getNullBase64UrlEncoded();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<byte[]> getNullBase64UrlEncodedAsync() {
        return getNullBase64UrlEncodedWithRestResponseAsync()
            .flatMap((BodyResponse<byte[]> res) -> Mono.just(res.body()));
    }
}
