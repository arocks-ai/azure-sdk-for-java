// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.mediaservices.models.PrivateEndpoint;
import com.azure.resourcemanager.mediaservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.mediaservices.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"privateEndpoint\":{\"id\":\"dfgiot\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"tqxln\",\"actionsRequired\":\"lefgugnxk\"},\"provisioningState\":\"Creating\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tqxln", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lefgugnxk", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("tqxln")
                        .withActionsRequired("lefgugnxk"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tqxln", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("lefgugnxk", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
