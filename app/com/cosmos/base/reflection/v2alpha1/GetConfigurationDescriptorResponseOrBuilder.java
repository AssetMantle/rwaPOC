// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

public interface GetConfigurationDescriptorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * config describes the application's sdk.Config
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor config = 1 [json_name = "config"];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * config describes the application's sdk.Config
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor config = 1 [json_name = "config"];</code>
   * @return The config.
   */
  com.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor getConfig();
  /**
   * <pre>
   * config describes the application's sdk.Config
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor config = 1 [json_name = "config"];</code>
   */
  com.cosmos.base.reflection.v2alpha1.ConfigurationDescriptorOrBuilder getConfigOrBuilder();
}
