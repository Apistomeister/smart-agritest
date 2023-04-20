// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: livestockmanagement.proto

package com.example.smartagritest;

public final class LiveStockManagementProto {
  private LiveStockManagementProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_LiveStock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_LiveStock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_AddLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_AddLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_AddLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_AddLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_RemoveLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_RemoveLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_RemoveLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_RemoveLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_UpdateLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_UpdateLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_UpdateLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_UpdateLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_GetLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_GetLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_GetLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_GetLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_FeedLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_FeedLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_FeedLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_FeedLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_WaterLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_WaterLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_WaterLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_WaterLiveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_VaccinateLiveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_VaccinateLiveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_VaccinateLiveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_VaccinateLiveStockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031livestockmanagement.proto\022\031com.example" +
      ".smartagritest\"M\n\tLiveStock\022\014\n\004name\030\001 \001(" +
      "\t\022\014\n\004type\030\002 \001(\t\022\022\n\nbirth_date\030\003 \001(\t\022\020\n\010q" +
      "uantity\030\004 \001(\005\"N\n\023AddLiveStockRequest\0227\n\t" +
      "liveStock\030\001 \001(\0132$.com.example.smartagrit" +
      "est.LiveStock\"\'\n\024AddLiveStockResponse\022\017\n" +
      "\007message\030\001 \001(\t\"&\n\026RemoveLiveStockRequest" +
      "\022\014\n\004name\030\001 \001(\t\"*\n\027RemoveLiveStockRespons" +
      "e\022\017\n\007message\030\001 \001(\t\"Q\n\026UpdateLiveStockReq" +
      "uest\0227\n\tliveStock\030\001 \001(\0132$.com.example.sm" +
      "artagritest.LiveStock\"*\n\027UpdateLiveStock" +
      "Response\022\017\n\007message\030\001 \001(\t\"#\n\023GetLiveStoc" +
      "kRequest\022\014\n\004name\030\001 \001(\t\"O\n\024GetLiveStockRe" +
      "sponse\0227\n\tliveStock\030\001 \001(\0132$.com.example." +
      "smartagritest.LiveStock\"4\n\024FeedLiveStock" +
      "Request\022\014\n\004name\030\001 \001(\t\022\016\n\006amount\030\002 \001(\001\"(\n" +
      "\025FeedLiveStockResponse\022\017\n\007message\030\001 \001(\t\"" +
      "5\n\025WaterLiveStockRequest\022\014\n\004name\030\001 \001(\t\022\016" +
      "\n\006amount\030\002 \001(\001\")\n\026WaterLiveStockResponse" +
      "\022\017\n\007message\030\001 \001(\t\"7\n\031VaccinateLiveStockR" +
      "equest\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"-\n\032Va" +
      "ccinateLiveStockResponse\022\017\n\007message\030\001 \001(" +
      "\t2\357\006\n\032LiveStockManagementService\022q\n\014addL" +
      "ivestock\022..com.example.smartagritest.Add" +
      "LiveStockRequest\032/.com.example.smartagri" +
      "test.AddLiveStockResponse\"\000\022z\n\017removeLiv" +
      "estock\0221.com.example.smartagritest.Remov" +
      "eLiveStockRequest\0322.com.example.smartagr" +
      "itest.RemoveLiveStockResponse\"\000\022z\n\017updat" +
      "eLivestock\0221.com.example.smartagritest.U" +
      "pdateLiveStockRequest\0322.com.example.smar" +
      "tagritest.UpdateLiveStockResponse\"\000\022q\n\014g" +
      "etLivestock\022..com.example.smartagritest." +
      "GetLiveStockRequest\032/.com.example.smarta" +
      "gritest.GetLiveStockResponse\"\000\022t\n\rfeedLi" +
      "vestock\022/.com.example.smartagritest.Feed" +
      "LiveStockRequest\0320.com.example.smartagri" +
      "test.FeedLiveStockResponse\"\000\022w\n\016waterLiv" +
      "estock\0220.com.example.smartagritest.Water" +
      "LiveStockRequest\0321.com.example.smartagri" +
      "test.WaterLiveStockResponse\"\000\022\203\001\n\022vaccin" +
      "ateLivestock\0224.com.example.smartagritest" +
      ".VaccinateLiveStockRequest\0325.com.example" +
      ".smartagritest.VaccinateLiveStockRespons" +
      "e\"\000B7\n\031com.example.smartagritestB\030LiveSt" +
      "ockManagementProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_smartagritest_LiveStock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_smartagritest_LiveStock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_LiveStock_descriptor,
        new java.lang.String[] { "Name", "Type", "BirthDate", "Quantity", });
    internal_static_com_example_smartagritest_AddLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_smartagritest_AddLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_AddLiveStockRequest_descriptor,
        new java.lang.String[] { "LiveStock", });
    internal_static_com_example_smartagritest_AddLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_smartagritest_AddLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_AddLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_RemoveLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_smartagritest_RemoveLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_RemoveLiveStockRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_smartagritest_RemoveLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_smartagritest_RemoveLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_RemoveLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_UpdateLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_smartagritest_UpdateLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_UpdateLiveStockRequest_descriptor,
        new java.lang.String[] { "LiveStock", });
    internal_static_com_example_smartagritest_UpdateLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_smartagritest_UpdateLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_UpdateLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_GetLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_example_smartagritest_GetLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_GetLiveStockRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_smartagritest_GetLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_example_smartagritest_GetLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_GetLiveStockResponse_descriptor,
        new java.lang.String[] { "LiveStock", });
    internal_static_com_example_smartagritest_FeedLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_example_smartagritest_FeedLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_FeedLiveStockRequest_descriptor,
        new java.lang.String[] { "Name", "Amount", });
    internal_static_com_example_smartagritest_FeedLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_example_smartagritest_FeedLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_FeedLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_WaterLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_example_smartagritest_WaterLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_WaterLiveStockRequest_descriptor,
        new java.lang.String[] { "Name", "Amount", });
    internal_static_com_example_smartagritest_WaterLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_example_smartagritest_WaterLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_WaterLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_VaccinateLiveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_example_smartagritest_VaccinateLiveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_VaccinateLiveStockRequest_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_com_example_smartagritest_VaccinateLiveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_com_example_smartagritest_VaccinateLiveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_VaccinateLiveStockResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}