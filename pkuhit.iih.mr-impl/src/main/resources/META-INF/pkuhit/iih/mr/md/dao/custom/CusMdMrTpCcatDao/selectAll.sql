select 
  MR_TP_CCAT_CD,
  NM,
  DES,
  CONTINUE_PRINT_F,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F,
  DCT_NS_F 
from MD_MR_TP_CCAT
 where del_f = 0
 order by to_number(sort_no)