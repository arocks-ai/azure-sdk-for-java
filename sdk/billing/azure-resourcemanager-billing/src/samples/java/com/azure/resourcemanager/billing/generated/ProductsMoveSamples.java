// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.models.TransferProductRequestProperties;

/** Samples for Products Move. */
public final class ProductsMoveSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/MoveProduct.json
     */
    /**
     * Sample code: MoveProduct.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void moveProduct(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .moveWithResponse(
                "{billingAccountName}",
                "{productName}",
                new TransferProductRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                Context.NONE);
    }
}