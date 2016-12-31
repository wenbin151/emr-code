package pkuhit.iih.mr.md;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;








 public static final String   OBJ_CD  = "MRM15";
public static final   String  CODE = "MRM15.AT01";
// 医疗记录自定义分类编码
public static final   String  MR_TYPE_CUSTOM_CODE = "MRM15.AT02";
// 医疗记录类型编码
public static final   String  MR_TYPE__CODE = "MRM15.AT03";
// 就诊类型编码
public static final   String  ENCOUNTER_TYPE_CODE = "MRM15.AT04";


@Column(name="MR_TP_CCAT_ITM_CD") 
private  String code;

@Column(name="MR_TP_CCAT_CD") 
private  String mrTypeCustomCode;

@Column(name="MR_TP_CD") 
private  String mrTypeCode;

@Column(name="EN_TP_CD") 
private  String encounterTypeCode;
// 医疗记录自定义分类名称
//@DictionaryTag(code = "mrTypeCustomCode")
private  String mrTypeCustomName;
// 医疗记录类型名称
//@DictionaryTag(code = "mrTypeCode")
private  String mrTypeName;
// 就诊类型名称
@DictionaryTag(code = "encounterTypeCode",objCd ="ENM01")
private  String encounterTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.mrTypeCustomCode;
 }

 {
  this.mrTypeCustomCode = mrTypeCustomCode;
 }

 {
     return this.mrTypeCode;
 }

 {
  this.mrTypeCode = mrTypeCode;
 }

 {
     return this.encounterTypeCode;
 }

 {
  this.encounterTypeCode = encounterTypeCode;
 }

 {
     return this.mrTypeCustomName;
 }

 {
  this.mrTypeCustomName = mrTypeCustomName;
 }

 {
     return this.mrTypeName;
 }

 {
  this.mrTypeName = mrTypeName;
 }

 {
     return this.encounterTypeName;
 }

 {
  this.encounterTypeName = encounterTypeName;
 }

