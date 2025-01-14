// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.models.Disk;
import org.junit.jupiter.api.Assertions;

public final class DiskTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Disk model =
            BinaryData
                .fromString("{\"name\":\"fdatsc\",\"diskSizeGB\":311951623,\"lun\":902734826}")
                .toObject(Disk.class);
        Assertions.assertEquals("fdatsc", model.name());
        Assertions.assertEquals(311951623, model.diskSizeGB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Disk model = new Disk().withName("fdatsc").withDiskSizeGB(311951623);
        model = BinaryData.fromObject(model).toObject(Disk.class);
        Assertions.assertEquals("fdatsc", model.name());
        Assertions.assertEquals(311951623, model.diskSizeGB());
    }
}
