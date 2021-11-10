// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolPatchProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** HostPool properties that can be patched. */
@Fluent
public final class HostPoolPatch extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostPoolPatch.class);

    /*
     * tags to be updated
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * HostPool properties that can be patched.
     */
    @JsonProperty(value = "properties")
    private HostPoolPatchProperties innerProperties;

    /**
     * Get the tags property: tags to be updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: tags to be updated.
     *
     * @param tags the tags value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: HostPool properties that can be patched.
     *
     * @return the innerProperties value.
     */
    private HostPoolPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the friendlyName property: Friendly name of HostPool.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of HostPool.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the description property: Description of HostPool.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of HostPool.
     *
     * @param description the description value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @return the customRdpProperty value.
     */
    public String customRdpProperty() {
        return this.innerProperties() == null ? null : this.innerProperties().customRdpProperty();
    }

    /**
     * Set the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @param customRdpProperty the customRdpProperty value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withCustomRdpProperty(String customRdpProperty) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withCustomRdpProperty(customRdpProperty);
        return this;
    }

    /**
     * Get the maxSessionLimit property: The max session limit of HostPool.
     *
     * @return the maxSessionLimit value.
     */
    public Integer maxSessionLimit() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSessionLimit();
    }

    /**
     * Set the maxSessionLimit property: The max session limit of HostPool.
     *
     * @param maxSessionLimit the maxSessionLimit value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withMaxSessionLimit(Integer maxSessionLimit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withMaxSessionLimit(maxSessionLimit);
        return this;
    }

    /**
     * Get the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @return the personalDesktopAssignmentType value.
     */
    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.innerProperties() == null ? null : this.innerProperties().personalDesktopAssignmentType();
    }

    /**
     * Set the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @param personalDesktopAssignmentType the personalDesktopAssignmentType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPersonalDesktopAssignmentType(
        PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withPersonalDesktopAssignmentType(personalDesktopAssignmentType);
        return this;
    }

    /**
     * Get the loadBalancerType property: The type of the load balancer.
     *
     * @return the loadBalancerType value.
     */
    public LoadBalancerType loadBalancerType() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerType();
    }

    /**
     * Set the loadBalancerType property: The type of the load balancer.
     *
     * @param loadBalancerType the loadBalancerType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withLoadBalancerType(LoadBalancerType loadBalancerType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withLoadBalancerType(loadBalancerType);
        return this;
    }

    /**
     * Get the ring property: The ring number of HostPool.
     *
     * @return the ring value.
     */
    public Integer ring() {
        return this.innerProperties() == null ? null : this.innerProperties().ring();
    }

    /**
     * Set the ring property: The ring number of HostPool.
     *
     * @param ring the ring value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRing(Integer ring) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withRing(ring);
        return this;
    }

    /**
     * Get the validationEnvironment property: Is validation environment.
     *
     * @return the validationEnvironment value.
     */
    public Boolean validationEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().validationEnvironment();
    }

    /**
     * Set the validationEnvironment property: Is validation environment.
     *
     * @param validationEnvironment the validationEnvironment value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withValidationEnvironment(Boolean validationEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withValidationEnvironment(validationEnvironment);
        return this;
    }

    /**
     * Get the registrationInfo property: The registration info of HostPool.
     *
     * @return the registrationInfo value.
     */
    public RegistrationInfoPatch registrationInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationInfo();
    }

    /**
     * Set the registrationInfo property: The registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRegistrationInfo(RegistrationInfoPatch registrationInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withRegistrationInfo(registrationInfo);
        return this;
    }

    /**
     * Get the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @return the vmTemplate value.
     */
    public String vmTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().vmTemplate();
    }

    /**
     * Set the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @param vmTemplate the vmTemplate value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withVmTemplate(String vmTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withVmTemplate(vmTemplate);
        return this;
    }

    /**
     * Get the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @return the ssoadfsAuthority value.
     */
    public String ssoadfsAuthority() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoadfsAuthority();
    }

    /**
     * Set the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @param ssoadfsAuthority the ssoadfsAuthority value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoadfsAuthority(String ssoadfsAuthority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withSsoadfsAuthority(ssoadfsAuthority);
        return this;
    }

    /**
     * Get the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @return the ssoClientId value.
     */
    public String ssoClientId() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoClientId();
    }

    /**
     * Set the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @param ssoClientId the ssoClientId value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoClientId(String ssoClientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withSsoClientId(ssoClientId);
        return this;
    }

    /**
     * Get the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @return the ssoClientSecretKeyVaultPath value.
     */
    public String ssoClientSecretKeyVaultPath() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoClientSecretKeyVaultPath();
    }

    /**
     * Set the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @param ssoClientSecretKeyVaultPath the ssoClientSecretKeyVaultPath value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoClientSecretKeyVaultPath(String ssoClientSecretKeyVaultPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withSsoClientSecretKeyVaultPath(ssoClientSecretKeyVaultPath);
        return this;
    }

    /**
     * Get the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @return the ssoSecretType value.
     */
    public SsoSecretType ssoSecretType() {
        return this.innerProperties() == null ? null : this.innerProperties().ssoSecretType();
    }

    /**
     * Set the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @param ssoSecretType the ssoSecretType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoSecretType(SsoSecretType ssoSecretType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withSsoSecretType(ssoSecretType);
        return this;
    }

    /**
     * Get the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @return the preferredAppGroupType value.
     */
    public PreferredAppGroupType preferredAppGroupType() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredAppGroupType();
    }

    /**
     * Set the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @param preferredAppGroupType the preferredAppGroupType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPreferredAppGroupType(PreferredAppGroupType preferredAppGroupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withPreferredAppGroupType(preferredAppGroupType);
        return this;
    }

    /**
     * Get the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @return the startVMOnConnect value.
     */
    public Boolean startVMOnConnect() {
        return this.innerProperties() == null ? null : this.innerProperties().startVMOnConnect();
    }

    /**
     * Set the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @param startVMOnConnect the startVMOnConnect value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withStartVMOnConnect(Boolean startVMOnConnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withStartVMOnConnect(startVMOnConnect);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HostPoolPatchProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
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