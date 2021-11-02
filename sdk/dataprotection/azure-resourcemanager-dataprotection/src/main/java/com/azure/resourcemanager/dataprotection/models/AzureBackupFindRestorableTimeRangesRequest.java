// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List Restore Ranges Request. */
@Fluent
public final class AzureBackupFindRestorableTimeRangesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureBackupFindRestorableTimeRangesRequest.class);

    /*
     * Gets or sets the type of the source data store.
     */
    @JsonProperty(value = "sourceDataStoreType", required = true)
    private RestoreSourceDataStoreType sourceDataStoreType;

    /*
     * Start time for the List Restore Ranges request. ISO 8601 format.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * End time for the List Restore Ranges request. ISO 8601 format.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /**
     * Get the sourceDataStoreType property: Gets or sets the type of the source data store.
     *
     * @return the sourceDataStoreType value.
     */
    public RestoreSourceDataStoreType sourceDataStoreType() {
        return this.sourceDataStoreType;
    }

    /**
     * Set the sourceDataStoreType property: Gets or sets the type of the source data store.
     *
     * @param sourceDataStoreType the sourceDataStoreType value to set.
     * @return the AzureBackupFindRestorableTimeRangesRequest object itself.
     */
    public AzureBackupFindRestorableTimeRangesRequest withSourceDataStoreType(
        RestoreSourceDataStoreType sourceDataStoreType) {
        this.sourceDataStoreType = sourceDataStoreType;
        return this;
    }

    /**
     * Get the startTime property: Start time for the List Restore Ranges request. ISO 8601 format.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time for the List Restore Ranges request. ISO 8601 format.
     *
     * @param startTime the startTime value to set.
     * @return the AzureBackupFindRestorableTimeRangesRequest object itself.
     */
    public AzureBackupFindRestorableTimeRangesRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time for the List Restore Ranges request. ISO 8601 format.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time for the List Restore Ranges request. ISO 8601 format.
     *
     * @param endTime the endTime value to set.
     * @return the AzureBackupFindRestorableTimeRangesRequest object itself.
     */
    public AzureBackupFindRestorableTimeRangesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceDataStoreType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceDataStoreType in model"
                            + " AzureBackupFindRestorableTimeRangesRequest"));
        }
    }
}