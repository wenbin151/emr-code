package pkuhit.md;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;








 
 /**
  * 数据对象编码
  */
 public static final String OBJ_CD = "MDM01";
 
 
// 通用主数据编码
public static final   String  CODE = "MDM01.AT01";
// 数据对象编码
public static final   String  OBJECT_CODE = "MDM01.AT02";
// 名称
public static final   String  NAME = "MDM01.AT03";
// 描述
public static final   String  DESCRIPTION = "MDM01.AT04";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MDM01.AT05";
// 英文名称
public static final   String  ENGLISH_NAME = "MDM01.AT06";


@Column(name="GS_CD") 
private  String code;

@Column(name="OBJ_CD") 
private  String objectCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.objectCode;
 }

 {
  this.objectCode = objectCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

