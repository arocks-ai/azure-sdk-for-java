// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A class that describes the properties of the resource. */
@Fluent
public final class WebPubSubProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebPubSubProperties.class);

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The publicly accessible IP of the resource.
     */
    @JsonProperty(value = "externalIP", access = JsonProperty.Access.WRITE_ONLY)
    private String externalIp;

    /*
     * FQDN of the service instance.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The publicly accessible port of the resource which is designed for
     * browser/client side usage.
     */
    @JsonProperty(value = "publicPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer publicPort;

    /*
     * The publicly accessible port of the resource which is designed for
     * customer server side usage.
     */
    @JsonProperty(value = "serverPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverPort;

    /*
     * Version of the resource. Probably you need the same or higher version of
     * client SDKs.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Private endpoint connections to the resource.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources.
     */
    @JsonProperty(value = "sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /*
     * TLS settings.
     */
    @JsonProperty(value = "tls")
    private WebPubSubTlsSettings tls;

    /*
     * Deprecated.
     */
    @JsonProperty(value = "hostNamePrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String hostnamePrefix;

    /*
     * Live trace configuration of a Microsoft.SignalRService resource.
     */
    @JsonProperty(value = "liveTraceConfiguration")
    private LiveTraceConfiguration liveTraceConfiguration;

    /*
     * Resource log configuration of a Microsoft.SignalRService resource.
     * If resourceLogConfiguration isn't null or empty, it will override
     * options "EnableConnectivityLog" and "EnableMessagingLogs" in features.
     * Otherwise, use options "EnableConnectivityLog" and "EnableMessagingLogs"
     * in features.
     */
    @JsonProperty(value = "resourceLogConfiguration")
    private ResourceLogConfiguration resourceLogConfiguration;

    /*
     * Network ACLs
     */
    @JsonProperty(value = "networkACLs")
    private WebPubSubNetworkACLs networkACLs;

    /*
     * Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter
     * what you set in network ACLs.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private String publicNetworkAccess;

    /*
     * DisableLocalAuth
     * Enable or disable local auth with AccessKey
     * When set as true, connection with AccessKey=xxx won't work.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * DisableLocalAuth
     * Enable or disable aad auth
     * When set as true, connection with AuthType=aad won't work.
     */
    @JsonProperty(value = "disableAadAuth")
    private Boolean disableAadAuth;

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the externalIp property: The publicly accessible IP of the resource.
     *
     * @return the externalIp value.
     */
    public String externalIp() {
        return this.externalIp;
    }

    /**
     * Get the hostname property: FQDN of the service instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the publicPort property: The publicly accessible port of the resource which is designed for browser/client
     * side usage.
     *
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Get the serverPort property: The publicly accessible port of the resource which is designed for customer server
     * side usage.
     *
     * @return the serverPort value.
     */
    public Integer serverPort() {
        return this.serverPort;
    }

    /**
     * Get the version property: Version of the resource. Probably you need the same or higher version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections to the resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Get the tls property: TLS settings.
     *
     * @return the tls value.
     */
    public WebPubSubTlsSettings tls() {
        return this.tls;
    }

    /**
     * Set the tls property: TLS settings.
     *
     * @param tls the tls value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withTls(WebPubSubTlsSettings tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Get the hostnamePrefix property: Deprecated.
     *
     * @return the hostnamePrefix value.
     */
    public String hostnamePrefix() {
        return this.hostnamePrefix;
    }

    /**
     * Get the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService resource.
     *
     * @return the liveTraceConfiguration value.
     */
    public LiveTraceConfiguration liveTraceConfiguration() {
        return this.liveTraceConfiguration;
    }

    /**
     * Set the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService resource.
     *
     * @param liveTraceConfiguration the liveTraceConfiguration value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withLiveTraceConfiguration(LiveTraceConfiguration liveTraceConfiguration) {
        this.liveTraceConfiguration = liveTraceConfiguration;
        return this;
    }

    /**
     * Get the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService resource. If
     * resourceLogConfiguration isn't null or empty, it will override options "EnableConnectivityLog" and
     * "EnableMessagingLogs" in features. Otherwise, use options "EnableConnectivityLog" and "EnableMessagingLogs" in
     * features.
     *
     * @return the resourceLogConfiguration value.
     */
    public ResourceLogConfiguration resourceLogConfiguration() {
        return this.resourceLogConfiguration;
    }

    /**
     * Set the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService resource. If
     * resourceLogConfiguration isn't null or empty, it will override options "EnableConnectivityLog" and
     * "EnableMessagingLogs" in features. Otherwise, use options "EnableConnectivityLog" and "EnableMessagingLogs" in
     * features.
     *
     * @param resourceLogConfiguration the resourceLogConfiguration value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withResourceLogConfiguration(ResourceLogConfiguration resourceLogConfiguration) {
        this.resourceLogConfiguration = resourceLogConfiguration;
        return this;
    }

    /**
     * Get the networkACLs property: Network ACLs.
     *
     * @return the networkACLs value.
     */
    public WebPubSubNetworkACLs networkACLs() {
        return this.networkACLs;
    }

    /**
     * Set the networkACLs property: Network ACLs.
     *
     * @param networkACLs the networkACLs value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withNetworkACLs(WebPubSubNetworkACLs networkACLs) {
        this.networkACLs = networkACLs;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withPublicNetworkAccess(String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @return the disableAadAuth value.
     */
    public Boolean disableAadAuth() {
        return this.disableAadAuth;
    }

    /**
     * Set the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @param disableAadAuth the disableAadAuth value to set.
     * @return the WebPubSubProperties object itself.
     */
    public WebPubSubProperties withDisableAadAuth(Boolean disableAadAuth) {
        this.disableAadAuth = disableAadAuth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
        if (tls() != null) {
            tls().validate();
        }
        if (liveTraceConfiguration() != null) {
            liveTraceConfiguration().validate();
        }
        if (resourceLogConfiguration() != null) {
            resourceLogConfiguration().validate();
        }
        if (networkACLs() != null) {
            networkACLs().validate();
        }
    }
}