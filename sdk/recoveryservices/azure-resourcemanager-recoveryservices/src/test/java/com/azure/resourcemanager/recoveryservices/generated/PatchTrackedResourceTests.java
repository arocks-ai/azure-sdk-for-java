// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.PatchTrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PatchTrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchTrackedResource model =
            BinaryData
                .fromString(
                    "{\"location\":\"nlankxmyskpb\",\"tags\":{\"qidybyx\":\"btkcxywnytnrsyn\",\"aaxdbabphlwrq\":\"zfcl\",\"hsucoc\":\"fkts\",\"ckzywbiexzfeyue\":\"nyyazttbtwwrqpue\"},\"etag\":\"ibx\",\"id\":\"jwbhqwalmuz\",\"name\":\"oxaepd\",\"type\":\"zjancuxr\"}")
                .toObject(PatchTrackedResource.class);
        Assertions.assertEquals("nlankxmyskpb", model.location());
        Assertions.assertEquals("btkcxywnytnrsyn", model.tags().get("qidybyx"));
        Assertions.assertEquals("ibx", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchTrackedResource model =
            new PatchTrackedResource()
                .withLocation("nlankxmyskpb")
                .withTags(
                    mapOf(
                        "qidybyx",
                        "btkcxywnytnrsyn",
                        "aaxdbabphlwrq",
                        "zfcl",
                        "hsucoc",
                        "fkts",
                        "ckzywbiexzfeyue",
                        "nyyazttbtwwrqpue"))
                .withEtag("ibx");
        model = BinaryData.fromObject(model).toObject(PatchTrackedResource.class);
        Assertions.assertEquals("nlankxmyskpb", model.location());
        Assertions.assertEquals("btkcxywnytnrsyn", model.tags().get("qidybyx"));
        Assertions.assertEquals("ibx", model.etag());
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
