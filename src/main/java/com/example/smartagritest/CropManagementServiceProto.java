// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cropmanagementservice.proto

package com.example.smartagritest;

public final class CropManagementServiceProto {
  private CropManagementServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_AddCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_AddCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_AddCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_AddCropResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_RemoveCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_RemoveCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_RemoveCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_RemoveCropResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_UpdateCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_UpdateCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_UpdateCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_UpdateCropResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_CropInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_CropInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_CropInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_CropInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_PlantCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_PlantCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_PlantCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_PlantCropResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_HarvestCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_HarvestCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_HarvestCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_HarvestCropResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_WaterCropRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_WaterCropRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_smartagritest_WaterCropResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_smartagritest_WaterCropResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033cropmanagementservice.proto\022\031com.examp" +
      "le.smartagritest\">\n\016AddCropRequest\022\014\n\004na" +
      "me\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\020\n\010quantity\030\003 \001(\005" +
      "\"\"\n\017AddCropResponse\022\017\n\007message\030\001 \001(\t\"!\n\021" +
      "RemoveCropRequest\022\014\n\004name\030\001 \001(\t\"%\n\022Remov" +
      "eCropResponse\022\017\n\007message\030\001 \001(\t\"N\n\021Update" +
      "CropRequest\022\014\n\004name\030\001 \001(\t\022\020\n\010new_type\030\002 " +
      "\001(\t\022\031\n\021new_planting_date\030\003 \001(\t\"%\n\022Update" +
      "CropResponse\022\017\n\007message\030\001 \001(\t\"\037\n\017CropInf" +
      "oRequest\022\014\n\004name\030\001 \001(\t\"E\n\020CropInfoRespon" +
      "se\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\025\n\rplanti" +
      "ng_date\030\003 \001(\t\"J\n\020PlantCropRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022\021\n\tseed_type\030\002 \001(\t\022\025\n\rplanting_d" +
      "ate\030\003 \001(\t\"$\n\021PlantCropResponse\022\017\n\007messag" +
      "e\030\001 \001(\t\";\n\022HarvestCropRequest\022\014\n\004name\030\001 " +
      "\001(\t\022\027\n\017harvesting_date\030\002 \001(\t\"&\n\023HarvestC" +
      "ropResponse\022\017\n\007message\030\001 \001(\t\"0\n\020WaterCro" +
      "pRequest\022\014\n\004name\030\001 \001(\t\022\016\n\006amount\030\002 \001(\001\"$" +
      "\n\021WaterCropResponse\022\017\n\007message\030\001 \001(\t2\203\006\n" +
      "\025CropManagementService\022b\n\007addCrop\022).com." +
      "example.smartagritest.AddCropRequest\032*.c" +
      "om.example.smartagritest.AddCropResponse" +
      "\"\000\022k\n\nremoveCrop\022,.com.example.smartagri" +
      "test.RemoveCropRequest\032-.com.example.sma" +
      "rtagritest.RemoveCropResponse\"\000\022k\n\nupdat" +
      "eCrop\022,.com.example.smartagritest.Update" +
      "CropRequest\032-.com.example.smartagritest." +
      "UpdateCropResponse\"\000\022h\n\013getCropInfo\022*.co" +
      "m.example.smartagritest.CropInfoRequest\032" +
      "+.com.example.smartagritest.CropInfoResp" +
      "onse\"\000\022h\n\tplantCrop\022+.com.example.smarta" +
      "gritest.PlantCropRequest\032,.com.example.s" +
      "martagritest.PlantCropResponse\"\000\022n\n\013harv" +
      "estCrop\022-.com.example.smartagritest.Harv" +
      "estCropRequest\032..com.example.smartagrite" +
      "st.HarvestCropResponse\"\000\022h\n\twaterCrop\022+." +
      "com.example.smartagritest.WaterCropReque" +
      "st\032,.com.example.smartagritest.WaterCrop" +
      "Response\"\000B9\n\031com.example.smartagritestB" +
      "\032CropManagementServiceProtoP\001b\006proto3"
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
    internal_static_com_example_smartagritest_AddCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_smartagritest_AddCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_AddCropRequest_descriptor,
        new java.lang.String[] { "Name", "Type", "Quantity", });
    internal_static_com_example_smartagritest_AddCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_smartagritest_AddCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_AddCropResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_RemoveCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_smartagritest_RemoveCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_RemoveCropRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_smartagritest_RemoveCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_smartagritest_RemoveCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_RemoveCropResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_UpdateCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_smartagritest_UpdateCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_UpdateCropRequest_descriptor,
        new java.lang.String[] { "Name", "NewType", "NewPlantingDate", });
    internal_static_com_example_smartagritest_UpdateCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_smartagritest_UpdateCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_UpdateCropResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_CropInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_smartagritest_CropInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_CropInfoRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_smartagritest_CropInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_example_smartagritest_CropInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_CropInfoResponse_descriptor,
        new java.lang.String[] { "Name", "Type", "PlantingDate", });
    internal_static_com_example_smartagritest_PlantCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_example_smartagritest_PlantCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_PlantCropRequest_descriptor,
        new java.lang.String[] { "Name", "SeedType", "PlantingDate", });
    internal_static_com_example_smartagritest_PlantCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_example_smartagritest_PlantCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_PlantCropResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_HarvestCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_example_smartagritest_HarvestCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_HarvestCropRequest_descriptor,
        new java.lang.String[] { "Name", "HarvestingDate", });
    internal_static_com_example_smartagritest_HarvestCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_example_smartagritest_HarvestCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_HarvestCropResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_smartagritest_WaterCropRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_example_smartagritest_WaterCropRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_WaterCropRequest_descriptor,
        new java.lang.String[] { "Name", "Amount", });
    internal_static_com_example_smartagritest_WaterCropResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_example_smartagritest_WaterCropResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_smartagritest_WaterCropResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
