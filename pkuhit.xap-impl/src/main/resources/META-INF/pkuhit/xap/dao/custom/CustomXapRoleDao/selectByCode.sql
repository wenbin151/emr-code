select
  ROLE_CD,
  ORG_CD,
  NM,
  DES,
  SHT_NM_EN,
  NM_EN,
  BIZ_ROLE_CD,
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
  DEL_F
from
  XAP_ROLE
where
	del_f = 0 and
  ROLE_CD = /* roleCd */'a'
  
