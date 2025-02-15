// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.model;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import tsptest.model.implementation.ModelOpsImpl;
import tsptest.model.models.NestedModel;
import tsptest.model.models.Resource1;
import tsptest.model.models.Resource2;
import tsptest.model.models.Resource3;

/**
 * Initializes a new instance of the synchronous ModelClient type.
 */
@ServiceClient(builder = ModelClientBuilder.class)
public final class ModelClient {
    @Generated
    private final ModelOpsImpl serviceClient;

    /**
     * Initializes an instance of ModelClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ModelClient(ModelOpsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The put1 operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     name: String (Required)
     *     outputData (Required): {
     *         data: String (Required)
     *     }
     *     outputData2 (Required): {
     *         data: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     name: String (Required)
     *     outputData (Required): {
     *         data: String (Required)
     *     }
     *     outputData2 (Required): {
     *         data: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> put1WithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.put1WithResponse(body, requestOptions);
    }

    /**
     * The put2 operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     name: String (Required)
     *     data2 (Required): {
     *         data: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     name: String (Required)
     *     data2 (Required): {
     *         data: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> put2WithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.put2WithResponse(body, requestOptions);
    }

    /**
     * The get3 operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     name: String (Required)
     *     outputData3 (Required): {
     *         data: String (Required)
     *     }
     * }
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> get3WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get3WithResponse(requestOptions);
    }

    /**
     * The putNested operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     nested1 (Required): {
     *         nested2 (Required): {
     *             data: String (Required)
     *         }
     *     }
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     nested1 (Required): {
     *         nested2 (Required): {
     *             data: String (Required)
     *         }
     *     }
     * }
     * }
     * </pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putNestedWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putNestedWithResponse(body, requestOptions);
    }

    /**
     * The put1 operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Resource1 put1(Resource1 body) {
        // Generated convenience method for put1WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return put1WithResponse(BinaryData.fromObject(body), requestOptions).getValue().toObject(Resource1.class);
    }

    /**
     * The put2 operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Resource2 put2(Resource2 body) {
        // Generated convenience method for put2WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return put2WithResponse(BinaryData.fromObject(body), requestOptions).getValue().toObject(Resource2.class);
    }

    /**
     * The get3 operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Resource3 get3() {
        // Generated convenience method for get3WithResponse
        RequestOptions requestOptions = new RequestOptions();
        return get3WithResponse(requestOptions).getValue().toObject(Resource3.class);
    }

    /**
     * The putNested operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NestedModel putNested(NestedModel body) {
        // Generated convenience method for putNestedWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putNestedWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(NestedModel.class);
    }
}
