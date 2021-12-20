// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.models.LookBackPeriod;
import com.azure.resourcemanager.consumption.models.Term;

/** Samples for ReservationRecommendationDetails Get. */
public final class ReservationRecommendationDetailsGetSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/ReservationRecommendationDetailsBySubscription.json
     */
    /**
     * Sample code: ReservationRecommendationsBySubscription-Legacy.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationRecommendationsBySubscriptionLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .reservationRecommendationDetails()
            .getWithResponse("Single", "westus", Term.P3Y, LookBackPeriod.LAST30DAYS, "Standard_DS13_v2", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/ReservationRecommendationDetailsByBillingProfile.json
     */
    /**
     * Sample code: ReservationRecommendationsByBillingProfile-Modern.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationRecommendationsByBillingProfileModern(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .reservationRecommendationDetails()
            .getWithResponse(
                "Shared", "australiaeast", Term.P1Y, LookBackPeriod.LAST7DAYS, "Standard_B2s", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/ReservationRecommendationDetailsByResourceGroup.json
     */
    /**
     * Sample code: ReservationRecommendationsByResourceGroup-Legacy.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationRecommendationsByResourceGroupLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .reservationRecommendationDetails()
            .getWithResponse("Single", "westus", Term.P3Y, LookBackPeriod.LAST30DAYS, "Standard_DS13_v2", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/ReservationRecommendationDetailsByBillingAccount.json
     */
    /**
     * Sample code: ReservationRecommendationsByBillingAccount-Legacy.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationRecommendationsByBillingAccountLegacy(
        com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .reservationRecommendationDetails()
            .getWithResponse("Shared", "eastus", Term.P1Y, LookBackPeriod.LAST60DAYS, "Standard_DS14_v2", Context.NONE);
    }
}