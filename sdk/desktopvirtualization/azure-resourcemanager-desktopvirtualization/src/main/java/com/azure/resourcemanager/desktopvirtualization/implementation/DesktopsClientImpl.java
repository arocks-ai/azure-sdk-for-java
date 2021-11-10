// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.DesktopsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import com.azure.resourcemanager.desktopvirtualization.models.DesktopList;
import com.azure.resourcemanager.desktopvirtualization.models.DesktopPatch;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DesktopsClient. */
public final class DesktopsClientImpl implements DesktopsClient {
    private final ClientLogger logger = new ClientLogger(DesktopsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DesktopsService service;

    /** The service client containing this operation class. */
    private final DesktopVirtualizationApiClientImpl client;

    /**
     * Initializes an instance of DesktopsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DesktopsClientImpl(DesktopVirtualizationApiClientImpl client) {
        this.service = RestProxy.create(DesktopsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DesktopVirtualizationApiClientDesktops to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DesktopVirtualizatio")
    private interface DesktopsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops/{desktopName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DesktopInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("applicationGroupName") String applicationGroupName,
            @PathParam("desktopName") String desktopName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops/{desktopName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DesktopInner>> update(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("applicationGroupName") String applicationGroupName,
            @PathParam("desktopName") String desktopName,
            @BodyParam("application/json") DesktopPatch desktop,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DesktopList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("applicationGroupName") String applicationGroupName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DesktopList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a desktop.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DesktopInner>> getWithResponseAsync(
        String resourceGroupName, String applicationGroupName, String desktopName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        if (desktopName == null) {
            return Mono.error(new IllegalArgumentException("Parameter desktopName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            applicationGroupName,
                            desktopName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a desktop.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DesktopInner>> getWithResponseAsync(
        String resourceGroupName, String applicationGroupName, String desktopName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        if (desktopName == null) {
            return Mono.error(new IllegalArgumentException("Parameter desktopName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                applicationGroupName,
                desktopName,
                accept,
                context);
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a desktop.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DesktopInner> getAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        return getWithResponseAsync(resourceGroupName, applicationGroupName, desktopName)
            .flatMap(
                (Response<DesktopInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a desktop.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DesktopInner get(String resourceGroupName, String applicationGroupName, String desktopName) {
        return getAsync(resourceGroupName, applicationGroupName, desktopName).block();
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a desktop.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DesktopInner> getWithResponse(
        String resourceGroupName, String applicationGroupName, String desktopName, Context context) {
        return getWithResponseAsync(resourceGroupName, applicationGroupName, desktopName, context).block();
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param desktop Object containing Desktop definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DesktopInner>> updateWithResponseAsync(
        String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        if (desktopName == null) {
            return Mono.error(new IllegalArgumentException("Parameter desktopName is required and cannot be null."));
        }
        if (desktop != null) {
            desktop.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            applicationGroupName,
                            desktopName,
                            desktop,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param desktop Object containing Desktop definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DesktopInner>> updateWithResponseAsync(
        String resourceGroupName,
        String applicationGroupName,
        String desktopName,
        DesktopPatch desktop,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        if (desktopName == null) {
            return Mono.error(new IllegalArgumentException("Parameter desktopName is required and cannot be null."));
        }
        if (desktop != null) {
            desktop.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                applicationGroupName,
                desktopName,
                desktop,
                accept,
                context);
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param desktop Object containing Desktop definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DesktopInner> updateAsync(
        String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop) {
        return updateWithResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop)
            .flatMap(
                (Response<DesktopInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DesktopInner> updateAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        final DesktopPatch desktop = null;
        return updateWithResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop)
            .flatMap(
                (Response<DesktopInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DesktopInner update(String resourceGroupName, String applicationGroupName, String desktopName) {
        final DesktopPatch desktop = null;
        return updateAsync(resourceGroupName, applicationGroupName, desktopName, desktop).block();
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param desktopName The name of the desktop within the specified desktop group.
     * @param desktop Object containing Desktop definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schema for Desktop properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DesktopInner> updateWithResponse(
        String resourceGroupName,
        String applicationGroupName,
        String desktopName,
        DesktopPatch desktop,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop, context).block();
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DesktopInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            applicationGroupName,
                            accept,
                            context))
            .<PagedResponse<DesktopInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DesktopInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (applicationGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                applicationGroupName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DesktopInner> listAsync(String resourceGroupName, String applicationGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DesktopInner> listAsync(String resourceGroupName, String applicationGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DesktopInner> list(String resourceGroupName, String applicationGroupName) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGroupName));
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DesktopInner> list(String resourceGroupName, String applicationGroupName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGroupName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DesktopInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DesktopInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return desktopList.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DesktopInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}