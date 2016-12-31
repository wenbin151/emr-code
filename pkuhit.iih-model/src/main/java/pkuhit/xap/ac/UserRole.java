package pkuhit.xap.ac;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;








public static final   String  CODE = "XAPM13.AT01";
// 用户ID
public static final   String  USER_ID = "XAPM13.AT02";
// 角色编码
public static final   String  ROLE_CODE = "XAPM13.AT03";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "XAPM13.AT04";
// 启用时间
public static final   String  START_TIME = "XAPM13.AT05";
// 停用时间
public static final   String  STOP_TIME = "XAPM13.AT06";


@Column(name="USER_ROLE_CD") 
private  String code;

@Column(name="USER_ID") 
private  String userId;

@Column(name="ROLE_CD") 
private  String roleCode;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="START_TIME") 
private  String startTime;

@Column(name="STOP_TIME") 
private  String stopTime;
// 用户名称
//@DictionaryTag(code = "userId")
private  String userName;
// 角色名称
//@DictionaryTag(code = "roleCode")
private  String roleName;
// 组织机构名称
@DictionaryTag(code = "organizationCode" ,objCd="ORGB01")
private  String organizationName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.userId;
 }

 {
  this.userId = userId;
 }

 {
     return this.roleCode;
 }

 {
  this.roleCode = roleCode;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.startTime;
 }

 {
  this.startTime = startTime;
 }

 {
     return this.stopTime;
 }

 {
  this.stopTime = stopTime;
 }

 {
     return this.userName;
 }

 {
  this.userName = userName;
 }

 {
     return this.roleName;
 }

 {
  this.roleName = roleName;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

