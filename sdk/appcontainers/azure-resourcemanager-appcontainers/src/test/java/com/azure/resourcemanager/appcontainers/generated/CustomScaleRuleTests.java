// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.CustomScaleRule;
import com.azure.resourcemanager.appcontainers.models.ScaleRuleAuth;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CustomScaleRuleTests {
    @Test
    public void testDeserialize() {
        CustomScaleRule model =
            BinaryData
                .fromString(
                    "{\"type\":\"gsahmkycgrauw\",\"metadata\":{\"vsmzlxwab\":\"taeburuvdm\",\"efkifr\":\"q\"},\"auth\":[{\"secretRef\":\"qujmqlgkf\",\"triggerParameter\":\"ndo\"},{\"secretRef\":\"n\",\"triggerParameter\":\"jcntuj\"},{\"secretRef\":\"c\",\"triggerParameter\":\"df\"},{\"secretRef\":\"waezkojvd\",\"triggerParameter\":\"zfoqouicybxar\"}]}")
                .toObject(CustomScaleRule.class);
        Assertions.assertEquals("gsahmkycgrauw", model.type());
        Assertions.assertEquals("taeburuvdm", model.metadata().get("vsmzlxwab"));
        Assertions.assertEquals("qujmqlgkf", model.auth().get(0).secretRef());
        Assertions.assertEquals("ndo", model.auth().get(0).triggerParameter());
    }

    @Test
    public void testSerialize() {
        CustomScaleRule model =
            new CustomScaleRule()
                .withType("gsahmkycgrauw")
                .withMetadata(mapOf("vsmzlxwab", "taeburuvdm", "efkifr", "q"))
                .withAuth(
                    Arrays
                        .asList(
                            new ScaleRuleAuth().withSecretRef("qujmqlgkf").withTriggerParameter("ndo"),
                            new ScaleRuleAuth().withSecretRef("n").withTriggerParameter("jcntuj"),
                            new ScaleRuleAuth().withSecretRef("c").withTriggerParameter("df"),
                            new ScaleRuleAuth().withSecretRef("waezkojvd").withTriggerParameter("zfoqouicybxar")));
        model = BinaryData.fromObject(model).toObject(CustomScaleRule.class);
        Assertions.assertEquals("gsahmkycgrauw", model.type());
        Assertions.assertEquals("taeburuvdm", model.metadata().get("vsmzlxwab"));
        Assertions.assertEquals("qujmqlgkf", model.auth().get(0).secretRef());
        Assertions.assertEquals("ndo", model.auth().get(0).triggerParameter());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
