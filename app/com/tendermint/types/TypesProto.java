// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_PartSetHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_PartSetHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Part_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_BlockID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_BlockID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Vote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Vote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Commit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Commit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_CommitSig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_CommitSig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_Proposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_Proposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_SignedHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_SignedHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_LightBlock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_LightBlock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_BlockMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_BlockMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_types_TxProof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_types_TxProof_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034tendermint/types/types.proto\022\020tendermi" +
      "nt.types\032\024gogoproto/gogo.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\035tendermint/cryp" +
      "to/proof.proto\032\036tendermint/version/types" +
      ".proto\032 tendermint/types/validator.proto" +
      "\"9\n\rPartSetHeader\022\024\n\005total\030\001 \001(\rR\005total\022" +
      "\022\n\004hash\030\002 \001(\014R\004hash\"h\n\004Part\022\024\n\005index\030\001 \001" +
      "(\rR\005index\022\024\n\005bytes\030\002 \001(\014R\005bytes\0224\n\005proof" +
      "\030\003 \001(\0132\030.tendermint.crypto.ProofB\004\310\336\037\000R\005" +
      "proof\"l\n\007BlockID\022\022\n\004hash\030\001 \001(\014R\004hash\022M\n\017" +
      "part_set_header\030\002 \001(\0132\037.tendermint.types" +
      ".PartSetHeaderB\004\310\336\037\000R\rpartSetHeader\"\346\004\n\006" +
      "Header\022=\n\007version\030\001 \001(\0132\035.tendermint.ver" +
      "sion.ConsensusB\004\310\336\037\000R\007version\022&\n\010chain_i" +
      "d\030\002 \001(\tB\013\342\336\037\007ChainIDR\007chainId\022\026\n\006height\030" +
      "\003 \001(\003R\006height\0228\n\004time\030\004 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\010\310\336\037\000\220\337\037\001R\004time\022C\n\rlast_" +
      "block_id\030\005 \001(\0132\031.tendermint.types.BlockI" +
      "DB\004\310\336\037\000R\013lastBlockId\022(\n\020last_commit_hash" +
      "\030\006 \001(\014R\016lastCommitHash\022\033\n\tdata_hash\030\007 \001(" +
      "\014R\010dataHash\022\'\n\017validators_hash\030\010 \001(\014R\016va" +
      "lidatorsHash\0220\n\024next_validators_hash\030\t \001" +
      "(\014R\022nextValidatorsHash\022%\n\016consensus_hash" +
      "\030\n \001(\014R\rconsensusHash\022\031\n\010app_hash\030\013 \001(\014R" +
      "\007appHash\022*\n\021last_results_hash\030\014 \001(\014R\017las" +
      "tResultsHash\022#\n\revidence_hash\030\r \001(\014R\014evi" +
      "denceHash\022)\n\020proposer_address\030\016 \001(\014R\017pro" +
      "poserAddress\"\030\n\004Data\022\020\n\003txs\030\001 \003(\014R\003txs\"\350" +
      "\002\n\004Vote\0223\n\004type\030\001 \001(\0162\037.tendermint.types" +
      ".SignedMsgTypeR\004type\022\026\n\006height\030\002 \001(\003R\006he" +
      "ight\022\024\n\005round\030\003 \001(\005R\005round\022E\n\010block_id\030\004" +
      " \001(\0132\031.tendermint.types.BlockIDB\017\310\336\037\000\342\336\037" +
      "\007BlockIDR\007blockId\022B\n\ttimestamp\030\005 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R\ttime" +
      "stamp\022+\n\021validator_address\030\006 \001(\014R\020valida" +
      "torAddress\022\'\n\017validator_index\030\007 \001(\005R\016val" +
      "idatorIndex\022\034\n\tsignature\030\010 \001(\014R\tsignatur" +
      "e\"\300\001\n\006Commit\022\026\n\006height\030\001 \001(\003R\006height\022\024\n\005" +
      "round\030\002 \001(\005R\005round\022E\n\010block_id\030\003 \001(\0132\031.t" +
      "endermint.types.BlockIDB\017\310\336\037\000\342\336\037\007BlockID" +
      "R\007blockId\022A\n\nsignatures\030\004 \003(\0132\033.tendermi" +
      "nt.types.CommitSigB\004\310\336\037\000R\nsignatures\"\335\001\n" +
      "\tCommitSig\022A\n\rblock_id_flag\030\001 \001(\0162\035.tend" +
      "ermint.types.BlockIDFlagR\013blockIdFlag\022+\n" +
      "\021validator_address\030\002 \001(\014R\020validatorAddre" +
      "ss\022B\n\ttimestamp\030\003 \001(\0132\032.google.protobuf." +
      "TimestampB\010\310\336\037\000\220\337\037\001R\ttimestamp\022\034\n\tsignat" +
      "ure\030\004 \001(\014R\tsignature\"\263\002\n\010Proposal\0223\n\004typ" +
      "e\030\001 \001(\0162\037.tendermint.types.SignedMsgType" +
      "R\004type\022\026\n\006height\030\002 \001(\003R\006height\022\024\n\005round\030" +
      "\003 \001(\005R\005round\022\033\n\tpol_round\030\004 \001(\005R\010polRoun" +
      "d\022E\n\010block_id\030\005 \001(\0132\031.tendermint.types.B" +
      "lockIDB\017\310\336\037\000\342\336\037\007BlockIDR\007blockId\022B\n\ttime" +
      "stamp\030\006 \001(\0132\032.google.protobuf.TimestampB" +
      "\010\310\336\037\000\220\337\037\001R\ttimestamp\022\034\n\tsignature\030\007 \001(\014R" +
      "\tsignature\"r\n\014SignedHeader\0220\n\006header\030\001 \001" +
      "(\0132\030.tendermint.types.HeaderR\006header\0220\n\006" +
      "commit\030\002 \001(\0132\030.tendermint.types.CommitR\006" +
      "commit\"\226\001\n\nLightBlock\022C\n\rsigned_header\030\001" +
      " \001(\0132\036.tendermint.types.SignedHeaderR\014si" +
      "gnedHeader\022C\n\rvalidator_set\030\002 \001(\0132\036.tend" +
      "ermint.types.ValidatorSetR\014validatorSet\"" +
      "\302\001\n\tBlockMeta\022E\n\010block_id\030\001 \001(\0132\031.tender" +
      "mint.types.BlockIDB\017\310\336\037\000\342\336\037\007BlockIDR\007blo" +
      "ckId\022\035\n\nblock_size\030\002 \001(\003R\tblockSize\0226\n\006h" +
      "eader\030\003 \001(\0132\030.tendermint.types.HeaderB\004\310" +
      "\336\037\000R\006header\022\027\n\007num_txs\030\004 \001(\003R\006numTxs\"j\n\007" +
      "TxProof\022\033\n\troot_hash\030\001 \001(\014R\010rootHash\022\022\n\004" +
      "data\030\002 \001(\014R\004data\022.\n\005proof\030\003 \001(\0132\030.tender" +
      "mint.crypto.ProofR\005proof*\327\001\n\013BlockIDFlag" +
      "\0221\n\025BLOCK_ID_FLAG_UNKNOWN\020\000\032\026\212\235 \022BlockID" +
      "FlagUnknown\022/\n\024BLOCK_ID_FLAG_ABSENT\020\001\032\025\212" +
      "\235 \021BlockIDFlagAbsent\022/\n\024BLOCK_ID_FLAG_CO" +
      "MMIT\020\002\032\025\212\235 \021BlockIDFlagCommit\022)\n\021BLOCK_I" +
      "D_FLAG_NIL\020\003\032\022\212\235 \016BlockIDFlagNil\032\010\210\243\036\000\250\244" +
      "\036\001*\327\001\n\rSignedMsgType\022,\n\027SIGNED_MSG_TYPE_" +
      "UNKNOWN\020\000\032\017\212\235 \013UnknownType\022,\n\027SIGNED_MSG" +
      "_TYPE_PREVOTE\020\001\032\017\212\235 \013PrevoteType\0220\n\031SIGN" +
      "ED_MSG_TYPE_PRECOMMIT\020\002\032\021\212\235 \rPrecommitTy" +
      "pe\022.\n\030SIGNED_MSG_TYPE_PROPOSAL\020 \032\020\212\235 \014Pr" +
      "oposalType\032\010\210\243\036\000\250\244\036\001B\274\001\n\024com.tendermint." +
      "typesB\nTypesProtoP\001Z7github.com/tendermi" +
      "nt/tendermint/proto/tendermint/types\242\002\003T" +
      "TX\252\002\020Tendermint.Types\312\002\020Tendermint\\Types" +
      "\342\002\034Tendermint\\Types\\GPBMetadata\352\002\021Tender" +
      "mint::Typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.tendermint.crypto.ProofProto.getDescriptor(),
          com.tendermint.version.TypesProto.getDescriptor(),
          com.tendermint.types.ValidatorProto.getDescriptor(),
        });
    internal_static_tendermint_types_PartSetHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tendermint_types_PartSetHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_PartSetHeader_descriptor,
        new java.lang.String[] { "Total", "Hash", });
    internal_static_tendermint_types_Part_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tendermint_types_Part_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Part_descriptor,
        new java.lang.String[] { "Index", "Bytes", "Proof", });
    internal_static_tendermint_types_BlockID_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tendermint_types_BlockID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_BlockID_descriptor,
        new java.lang.String[] { "Hash", "PartSetHeader", });
    internal_static_tendermint_types_Header_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tendermint_types_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Header_descriptor,
        new java.lang.String[] { "Version", "ChainId", "Height", "Time", "LastBlockId", "LastCommitHash", "DataHash", "ValidatorsHash", "NextValidatorsHash", "ConsensusHash", "AppHash", "LastResultsHash", "EvidenceHash", "ProposerAddress", });
    internal_static_tendermint_types_Data_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tendermint_types_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Data_descriptor,
        new java.lang.String[] { "Txs", });
    internal_static_tendermint_types_Vote_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tendermint_types_Vote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Vote_descriptor,
        new java.lang.String[] { "Type", "Height", "Round", "BlockId", "Timestamp", "ValidatorAddress", "ValidatorIndex", "Signature", });
    internal_static_tendermint_types_Commit_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tendermint_types_Commit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Commit_descriptor,
        new java.lang.String[] { "Height", "Round", "BlockId", "Signatures", });
    internal_static_tendermint_types_CommitSig_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tendermint_types_CommitSig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_CommitSig_descriptor,
        new java.lang.String[] { "BlockIdFlag", "ValidatorAddress", "Timestamp", "Signature", });
    internal_static_tendermint_types_Proposal_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tendermint_types_Proposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_Proposal_descriptor,
        new java.lang.String[] { "Type", "Height", "Round", "PolRound", "BlockId", "Timestamp", "Signature", });
    internal_static_tendermint_types_SignedHeader_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tendermint_types_SignedHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_SignedHeader_descriptor,
        new java.lang.String[] { "Header", "Commit", });
    internal_static_tendermint_types_LightBlock_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tendermint_types_LightBlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_LightBlock_descriptor,
        new java.lang.String[] { "SignedHeader", "ValidatorSet", });
    internal_static_tendermint_types_BlockMeta_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tendermint_types_BlockMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_BlockMeta_descriptor,
        new java.lang.String[] { "BlockId", "BlockSize", "Header", "NumTxs", });
    internal_static_tendermint_types_TxProof_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tendermint_types_TxProof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_types_TxProof_descriptor,
        new java.lang.String[] { "RootHash", "Data", "Proof", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoEnumStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.tendermint.crypto.ProofProto.getDescriptor();
    com.tendermint.version.TypesProto.getDescriptor();
    com.tendermint.types.ValidatorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
