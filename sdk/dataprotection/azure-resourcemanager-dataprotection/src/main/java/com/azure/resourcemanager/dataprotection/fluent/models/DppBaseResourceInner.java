// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Base resource under Microsoft.DataProtection provider namespace. */
@Immutable
public final class DppBaseResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DppBaseResourceInner.class);

    /*
     * Resource Id represents the complete path to the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name associated with the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type represents the complete path of the form
     * Namespace/ResourceType/ResourceType/...
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the id property: Resource Id represents the complete path to the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name associated with the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type represents the complete path of the form
     * Namespace/ResourceType/ResourceType/...
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}