package pkuhit.xap.file;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseBizModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  PK = "XAPB02.AT01";
// 文件格式编码
public static final   String  FORMAT_CODE = "XAPB02.AT02";
// 文件数据
public static final   String  DATA = "XAPB02.AT03";


@Column(name="FILE_PK") 
private  String pk;

@Column(name="FILE_FMT_CD") 
private  String formatCode;

@Column(name="FILE_DATA") 
private  String data;
// 文件格式名称
@DictionaryTag(code = "formatCode")
private  String formatName;

 {
     return this.pk;
 }

 {
  this.pk = pk;
 }

 {
     return this.formatCode;
 }

 {
  this.formatCode = formatCode;
 }

 {
     return this.data;
 }

 {
  this.data = data;
 }

 {
     return this.formatName;
 }

 {
  this.formatName = formatName;
 }

