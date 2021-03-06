// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataConversion.proto

package com.dei.isassignment;

public final class DataConversionOuterClass {
  private DataConversionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_XMLRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_XMLRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dei_isassignment_XMLResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dei_isassignment_XMLResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024DataConversion.proto\022\024com.dei.isassign" +
      "ment\"E\n\005Owner\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022" +
      "\021\n\ttelephone\030\003 \001(\t\022\017\n\007address\030\004 \001(\t\"\221\001\n\003" +
      "Car\022\n\n\002id\030\001 \001(\005\022\r\n\005brand\030\002 \001(\t\022\r\n\005model\030" +
      "\003 \001(\t\022\016\n\006engine\030\004 \001(\t\022\014\n\004size\030\005 \001(\005\022\r\n\005p" +
      "ower\030\006 \001(\005\022\023\n\013consumption\030\007 \001(\002\022\r\n\005plate" +
      "\030\010 \001(\t\022\017\n\007ownerId\030\t \001(\005\"6\n\007Request\022+\n\006ow" +
      "ners\030\001 \003(\0132\033.com.dei.isassignment.Owner\"" +
      "3\n\010Response\022\'\n\004cars\030\001 \003(\0132\031.com.dei.isas" +
      "signment.Car\"\035\n\nXMLRequest\022\017\n\007request\030\001 " +
      "\001(\t\"\037\n\013XMLResponse\022\020\n\010response\030\001 \001(\t2\317\001\n" +
      "\016DataConversion\022]\n\032listOfCarsPerOwnerPro" +
      "tobuf\022\035.com.dei.isassignment.Request\032\036.c" +
      "om.dei.isassignment.Response\"\000\022^\n\025listOf" +
      "CarsPerOwnerXML\022 .com.dei.isassignment.X" +
      "MLRequest\032!.com.dei.isassignment.XMLResp" +
      "onse\"\000B\005P\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_dei_isassignment_Owner_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dei_isassignment_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_Owner_descriptor,
        new java.lang.String[] { "Id", "Name", "Telephone", "Address", });
    internal_static_com_dei_isassignment_Car_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dei_isassignment_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_Car_descriptor,
        new java.lang.String[] { "Id", "Brand", "Model", "Engine", "Size", "Power", "Consumption", "Plate", "OwnerId", });
    internal_static_com_dei_isassignment_Request_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dei_isassignment_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_Request_descriptor,
        new java.lang.String[] { "Owners", });
    internal_static_com_dei_isassignment_Response_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dei_isassignment_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_Response_descriptor,
        new java.lang.String[] { "Cars", });
    internal_static_com_dei_isassignment_XMLRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dei_isassignment_XMLRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_XMLRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_com_dei_isassignment_XMLResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dei_isassignment_XMLResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dei_isassignment_XMLResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
