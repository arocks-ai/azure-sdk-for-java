// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The policies for a container registry. */
@Fluent
public final class Policies {
    /*
     * The quarantine policy for a container registry.
     */
    @JsonProperty(value = "quarantinePolicy")
    private QuarantinePolicy quarantinePolicy;

    /*
     * The content trust policy for a container registry.
     */
    @JsonProperty(value = "trustPolicy")
    private TrustPolicy trustPolicy;

    /*
     * The retention policy for a container registry.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /*
     * The export policy for a container registry.
     */
    @JsonProperty(value = "exportPolicy")
    private ExportPolicy exportPolicy;

    /** Creates an instance of Policies class. */
    public Policies() {
    }

    /**
     * Get the quarantinePolicy property: The quarantine policy for a container registry.
     *
     * @return the quarantinePolicy value.
     */
    public QuarantinePolicy quarantinePolicy() {
        return this.quarantinePolicy;
    }

    /**
     * Set the quarantinePolicy property: The quarantine policy for a container registry.
     *
     * @param quarantinePolicy the quarantinePolicy value to set.
     * @return the Policies object itself.
     */
    public Policies withQuarantinePolicy(QuarantinePolicy quarantinePolicy) {
        this.quarantinePolicy = quarantinePolicy;
        return this;
    }

    /**
     * Get the trustPolicy property: The content trust policy for a container registry.
     *
     * @return the trustPolicy value.
     */
    public TrustPolicy trustPolicy() {
        return this.trustPolicy;
    }

    /**
     * Set the trustPolicy property: The content trust policy for a container registry.
     *
     * @param trustPolicy the trustPolicy value to set.
     * @return the Policies object itself.
     */
    public Policies withTrustPolicy(TrustPolicy trustPolicy) {
        this.trustPolicy = trustPolicy;
        return this;
    }

    /**
     * Get the retentionPolicy property: The retention policy for a container registry.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: The retention policy for a container registry.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the Policies object itself.
     */
    public Policies withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the exportPolicy property: The export policy for a container registry.
     *
     * @return the exportPolicy value.
     */
    public ExportPolicy exportPolicy() {
        return this.exportPolicy;
    }

    /**
     * Set the exportPolicy property: The export policy for a container registry.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the Policies object itself.
     */
    public Policies withExportPolicy(ExportPolicy exportPolicy) {
        this.exportPolicy = exportPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (quarantinePolicy() != null) {
            quarantinePolicy().validate();
        }
        if (trustPolicy() != null) {
            trustPolicy().validate();
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (exportPolicy() != null) {
            exportPolicy().validate();
        }
    }
}
