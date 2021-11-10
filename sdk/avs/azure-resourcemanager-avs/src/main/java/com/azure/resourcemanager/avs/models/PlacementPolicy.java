// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.PlacementPolicyInner;
import java.util.List;

/** An immutable client-side representation of PlacementPolicy. */
public interface PlacementPolicy {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: placement policy properties.
     *
     * @return the properties value.
     */
    PlacementPolicyProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.PlacementPolicyInner object.
     *
     * @return the inner object.
     */
    PlacementPolicyInner innerModel();

    /** The entirety of the PlacementPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PlacementPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the PlacementPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PlacementPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, privateCloudName, clusterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param privateCloudName Name of the private cloud.
             * @param clusterName Name of the cluster in the private cloud.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String privateCloudName, String clusterName);
        }
        /**
         * The stage of the PlacementPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PlacementPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PlacementPolicy create(Context context);
        }
        /** The stage of the PlacementPolicy definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: placement policy properties.
             *
             * @param properties placement policy properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(PlacementPolicyProperties properties);
        }
    }
    /**
     * Begins update for the PlacementPolicy resource.
     *
     * @return the stage of resource update.
     */
    PlacementPolicy.Update update();

    /** The template for PlacementPolicy update. */
    interface Update extends UpdateStages.WithState, UpdateStages.WithVmMembers, UpdateStages.WithHostMembers {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PlacementPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PlacementPolicy apply(Context context);
    }
    /** The PlacementPolicy update stages. */
    interface UpdateStages {
        /** The stage of the PlacementPolicy update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Whether the placement policy is enabled or disabled.
             *
             * @param state Whether the placement policy is enabled or disabled.
             * @return the next definition stage.
             */
            Update withState(PlacementPolicyState state);
        }
        /** The stage of the PlacementPolicy update allowing to specify vmMembers. */
        interface WithVmMembers {
            /**
             * Specifies the vmMembers property: Virtual machine members list.
             *
             * @param vmMembers Virtual machine members list.
             * @return the next definition stage.
             */
            Update withVmMembers(List<String> vmMembers);
        }
        /** The stage of the PlacementPolicy update allowing to specify hostMembers. */
        interface WithHostMembers {
            /**
             * Specifies the hostMembers property: Host members list.
             *
             * @param hostMembers Host members list.
             * @return the next definition stage.
             */
            Update withHostMembers(List<String> hostMembers);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PlacementPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PlacementPolicy refresh(Context context);
}