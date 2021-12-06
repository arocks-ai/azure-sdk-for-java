// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayFirewallRuleSetPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A web application firewall rule set. */
@Fluent
public final class ApplicationGatewayFirewallRuleSet extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayFirewallRuleSet.class);

    /*
     * Properties of the web application firewall rule set.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayFirewallRuleSetPropertiesFormat innerProperties;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the web application firewall rule set.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayFirewallRuleSetPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayFirewallRuleSet withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayFirewallRuleSet withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall rule set.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the web application firewall rule set.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFirewallRuleSetPropertiesFormat();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     *
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetType();
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     *
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetType(String ruleSetType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFirewallRuleSetPropertiesFormat();
        }
        this.innerProperties().withRuleSetType(ruleSetType);
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     *
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetVersion();
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     *
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetVersion(String ruleSetVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFirewallRuleSetPropertiesFormat();
        }
        this.innerProperties().withRuleSetVersion(ruleSetVersion);
        return this;
    }

    /**
     * Get the ruleGroups property: The rule groups of the web application firewall rule set.
     *
     * @return the ruleGroups value.
     */
    public List<ApplicationGatewayFirewallRuleGroup> ruleGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleGroups();
    }

    /**
     * Set the ruleGroups property: The rule groups of the web application firewall rule set.
     *
     * @param ruleGroups the ruleGroups value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleGroups(List<ApplicationGatewayFirewallRuleGroup> ruleGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFirewallRuleSetPropertiesFormat();
        }
        this.innerProperties().withRuleGroups(ruleGroups);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}