// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** channelMembershipType. */
public final class MicrosoftGraphChannelMembershipType
    extends ExpandableStringEnum<MicrosoftGraphChannelMembershipType> {
    /** Static value standard for MicrosoftGraphChannelMembershipType. */
    public static final MicrosoftGraphChannelMembershipType STANDARD = fromString("standard");

    /** Static value private for MicrosoftGraphChannelMembershipType. */
    public static final MicrosoftGraphChannelMembershipType PRIVATE = fromString("private");

    /** Static value unknownFutureValue for MicrosoftGraphChannelMembershipType. */
    public static final MicrosoftGraphChannelMembershipType UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphChannelMembershipType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphChannelMembershipType.
     */
    @JsonCreator
    public static MicrosoftGraphChannelMembershipType fromString(String name) {
        return fromString(name, MicrosoftGraphChannelMembershipType.class);
    }

    /**
     * Gets known MicrosoftGraphChannelMembershipType values.
     *
     * @return known MicrosoftGraphChannelMembershipType values.
     */
    public static Collection<MicrosoftGraphChannelMembershipType> values() {
        return values(MicrosoftGraphChannelMembershipType.class);
    }
}
