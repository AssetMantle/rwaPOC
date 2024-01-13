// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package com.cosmos.base.tendermint.v1beta1;

public interface VersionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.tendermint.v1beta1.VersionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string app_name = 2 [json_name = "appName"];</code>
   * @return The appName.
   */
  java.lang.String getAppName();
  /**
   * <code>string app_name = 2 [json_name = "appName"];</code>
   * @return The bytes for appName.
   */
  com.google.protobuf.ByteString
      getAppNameBytes();

  /**
   * <code>string version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 3 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string git_commit = 4 [json_name = "gitCommit"];</code>
   * @return The gitCommit.
   */
  java.lang.String getGitCommit();
  /**
   * <code>string git_commit = 4 [json_name = "gitCommit"];</code>
   * @return The bytes for gitCommit.
   */
  com.google.protobuf.ByteString
      getGitCommitBytes();

  /**
   * <code>string build_tags = 5 [json_name = "buildTags"];</code>
   * @return The buildTags.
   */
  java.lang.String getBuildTags();
  /**
   * <code>string build_tags = 5 [json_name = "buildTags"];</code>
   * @return The bytes for buildTags.
   */
  com.google.protobuf.ByteString
      getBuildTagsBytes();

  /**
   * <code>string go_version = 6 [json_name = "goVersion"];</code>
   * @return The goVersion.
   */
  java.lang.String getGoVersion();
  /**
   * <code>string go_version = 6 [json_name = "goVersion"];</code>
   * @return The bytes for goVersion.
   */
  com.google.protobuf.ByteString
      getGoVersionBytes();

  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Module build_deps = 7 [json_name = "buildDeps"];</code>
   */
  java.util.List<com.cosmos.base.tendermint.v1beta1.Module> 
      getBuildDepsList();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Module build_deps = 7 [json_name = "buildDeps"];</code>
   */
  com.cosmos.base.tendermint.v1beta1.Module getBuildDeps(int index);
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Module build_deps = 7 [json_name = "buildDeps"];</code>
   */
  int getBuildDepsCount();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Module build_deps = 7 [json_name = "buildDeps"];</code>
   */
  java.util.List<? extends com.cosmos.base.tendermint.v1beta1.ModuleOrBuilder> 
      getBuildDepsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.tendermint.v1beta1.Module build_deps = 7 [json_name = "buildDeps"];</code>
   */
  com.cosmos.base.tendermint.v1beta1.ModuleOrBuilder getBuildDepsOrBuilder(
      int index);

  /**
   * <pre>
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string cosmos_sdk_version = 8 [json_name = "cosmosSdkVersion"];</code>
   * @return The cosmosSdkVersion.
   */
  java.lang.String getCosmosSdkVersion();
  /**
   * <pre>
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>string cosmos_sdk_version = 8 [json_name = "cosmosSdkVersion"];</code>
   * @return The bytes for cosmosSdkVersion.
   */
  com.google.protobuf.ByteString
      getCosmosSdkVersionBytes();
}