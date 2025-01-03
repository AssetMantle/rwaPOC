// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/genesis.proto

package com.cosmos.capability.v1beta1;

public interface GenesisOwnersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.capability.v1beta1.GenesisOwners)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * index is the index of the capability owner.
   * </pre>
   *
   * <code>uint64 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  long getIndex();

  /**
   * <pre>
   * index_owners are the owners at the given index.
   * </pre>
   *
   * <code>.cosmos.capability.v1beta1.CapabilityOwners index_owners = 2 [json_name = "indexOwners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"index_owners&#92;""];</code>
   * @return Whether the indexOwners field is set.
   */
  boolean hasIndexOwners();
  /**
   * <pre>
   * index_owners are the owners at the given index.
   * </pre>
   *
   * <code>.cosmos.capability.v1beta1.CapabilityOwners index_owners = 2 [json_name = "indexOwners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"index_owners&#92;""];</code>
   * @return The indexOwners.
   */
  com.cosmos.capability.v1beta1.CapabilityOwners getIndexOwners();
  /**
   * <pre>
   * index_owners are the owners at the given index.
   * </pre>
   *
   * <code>.cosmos.capability.v1beta1.CapabilityOwners index_owners = 2 [json_name = "indexOwners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"index_owners&#92;""];</code>
   */
  com.cosmos.capability.v1beta1.CapabilityOwnersOrBuilder getIndexOwnersOrBuilder();
}
