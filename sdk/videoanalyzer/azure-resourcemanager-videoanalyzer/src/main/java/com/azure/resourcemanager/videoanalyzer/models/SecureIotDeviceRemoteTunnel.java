// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A remote tunnel securely established using IoT Hub device information. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel")
@Fluent
public final class SecureIotDeviceRemoteTunnel extends TunnelBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecureIotDeviceRemoteTunnel.class);

    /*
     * Name of the IoT Hub.
     */
    @JsonProperty(value = "iotHubName", required = true)
    private String iotHubName;

    /*
     * The IoT device id to use when establishing the remote tunnel. This
     * string is case-sensitive.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /**
     * Get the iotHubName property: Name of the IoT Hub.
     *
     * @return the iotHubName value.
     */
    public String iotHubName() {
        return this.iotHubName;
    }

    /**
     * Set the iotHubName property: Name of the IoT Hub.
     *
     * @param iotHubName the iotHubName value to set.
     * @return the SecureIotDeviceRemoteTunnel object itself.
     */
    public SecureIotDeviceRemoteTunnel withIotHubName(String iotHubName) {
        this.iotHubName = iotHubName;
        return this;
    }

    /**
     * Get the deviceId property: The IoT device id to use when establishing the remote tunnel. This string is
     * case-sensitive.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The IoT device id to use when establishing the remote tunnel. This string is
     * case-sensitive.
     *
     * @param deviceId the deviceId value to set.
     * @return the SecureIotDeviceRemoteTunnel object itself.
     */
    public SecureIotDeviceRemoteTunnel withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (iotHubName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property iotHubName in model SecureIotDeviceRemoteTunnel"));
        }
        if (deviceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deviceId in model SecureIotDeviceRemoteTunnel"));
        }
    }
}