// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.core.util.Context;

/** Samples for EventHubs ListAuthorizationRules. */
public final class EventHubsListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/stable/2021-11-01/examples/EventHubs/EHEventHubAuthorizationRuleListAll.json
     */
    /**
     * Sample code: EventHubAuthorizationRuleListAll.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void eventHubAuthorizationRuleListAll(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .eventHubs()
            .manager()
            .serviceClient()
            .getEventHubs()
            .listAuthorizationRules("ArunMonocle", "sdk-Namespace-960", "sdk-EventHub-532", Context.NONE);
    }
}