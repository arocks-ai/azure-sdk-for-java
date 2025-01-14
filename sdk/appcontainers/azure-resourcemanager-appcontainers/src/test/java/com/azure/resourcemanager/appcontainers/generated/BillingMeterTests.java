// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.BillingMeter;
import com.azure.resourcemanager.appcontainers.models.BillingMeterProperties;
import com.azure.resourcemanager.appcontainers.models.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BillingMeterTests {
    @Test
    public void testDeserialize() {
        BillingMeter model =
            BinaryData
                .fromString(
                    "{\"location\":\"lm\",\"properties\":{\"category\":\"PremiumSkuComputeOptimized\",\"meterType\":\"cvhd\",\"displayName\":\"v\"},\"id\":\"qxeysko\",\"name\":\"qzinkfkbg\",\"type\":\"z\"}")
                .toObject(BillingMeter.class);
        Assertions.assertEquals("lm", model.location());
        Assertions.assertEquals(Category.PREMIUM_SKU_COMPUTE_OPTIMIZED, model.properties().category());
        Assertions.assertEquals("cvhd", model.properties().meterType());
        Assertions.assertEquals("v", model.properties().displayName());
    }

    @Test
    public void testSerialize() {
        BillingMeter model =
            new BillingMeter()
                .withLocation("lm")
                .withProperties(
                    new BillingMeterProperties()
                        .withCategory(Category.PREMIUM_SKU_COMPUTE_OPTIMIZED)
                        .withMeterType("cvhd")
                        .withDisplayName("v"));
        model = BinaryData.fromObject(model).toObject(BillingMeter.class);
        Assertions.assertEquals("lm", model.location());
        Assertions.assertEquals(Category.PREMIUM_SKU_COMPUTE_OPTIMIZED, model.properties().category());
        Assertions.assertEquals("cvhd", model.properties().meterType());
        Assertions.assertEquals("v", model.properties().displayName());
    }
}
