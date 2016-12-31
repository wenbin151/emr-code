package pkuhit.xap.dao.auto.entity;

import java.math.BigInteger;
import java.sql.Timestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ME_FU

 */
@Entity(listener = MeFuListener.class)
@Table(name = "ME_FU")
public class MeFu {

    /** */
    @Id
    @Column(name = "FU_CD")
    String fuCd;

    /** */
    @Column(name = "FUTPL_CD")
    String futplCd;

    /** */
    @Column(name = "PAR_FU_CD")
    String parFuCd;

    /** */
    @Column(name = "DO_CD")
    String doCd;

    /** */
    @Column(name = "RT_FU_CD")
    String rtFuCd;

    /** */
    @Column(name = "VER_NO")
    String verNo;

    /** */
    @Column(name = "FU_TP_CD")
    String fuTpCd;

    /** */
    @Column(name = "NM")
    String nm;

    /** */
    @Column(name = "DES")
    String des;

    /** */
    @Column(name = "SHT_NM_EN")
    String shtNmEn;

    /** */
    @Column(name = "NM_EN")
    String nmEn;

    /** 0：不可被菜单引用
1：可被菜单引用 */
    @Column(name = "MENU_F")
    Short menuF;

    /** */
    @Column(name = "MENU_NM")
    String menuNm;

    /** */
    @Column(name = "MEMO")
    String memo;

    /** */
    @Column(name = "SORT_NO")
    String sortNo;

    /** */
    @Column(name = "SPELL_NO")
    String spellNo;

    /** */
    @Column(name = "WUBI_NO")
    String wubiNo;

    /** */
    @Column(name = "UPD_CNT")
    BigInteger updCnt;

    /** */
    @Column(name = "CRT_TIME")
    Timestamp crtTime;

    /** */
    @Column(name = "CRT_USER_ID")
    String crtUserId;

    /** */
    @Column(name = "CRT_DEPT_CD")
    String crtDeptCd;

    /** */
    @Column(name = "LAST_UPD_TIME")
    Timestamp lastUpdTime;

    /** */
    @Column(name = "LAST_UPD_DEPT_CD")
    String lastUpdDeptCd;

    /** */
    @Column(name = "LAST_UPD_USER_ID")
    String lastUpdUserId;

    /** */
    @Column(name = "DEL_F")
    Short delF;

    /** 
     * Returns the fuCd.
     * 
     * @return the fuCd
     */
    public String getFuCd() {
        return fuCd;
    }

    /** 
     * Sets the fuCd.
     * 
     * @param fuCd the fuCd
     */
    public void setFuCd(String fuCd) {
        this.fuCd = fuCd;
    }

    /** 
     * Returns the futplCd.
     * 
     * @return the futplCd
     */
    public String getFutplCd() {
        return futplCd;
    }

    /** 
     * Sets the futplCd.
     * 
     * @param futplCd the futplCd
     */
    public void setFutplCd(String futplCd) {
        this.futplCd = futplCd;
    }

    /** 
     * Returns the parFuCd.
     * 
     * @return the parFuCd
     */
    public String getParFuCd() {
        return parFuCd;
    }

    /** 
     * Sets the parFuCd.
     * 
     * @param parFuCd the parFuCd
     */
    public void setParFuCd(String parFuCd) {
        this.parFuCd = parFuCd;
    }

    /** 
     * Returns the doCd.
     * 
     * @return the doCd
     */
    public String getDoCd() {
        return doCd;
    }

    /** 
     * Sets the doCd.
     * 
     * @param doCd the doCd
     */
    public void setDoCd(String doCd) {
        this.doCd = doCd;
    }

    /** 
     * Returns the rtFuCd.
     * 
     * @return the rtFuCd
     */
    public String getRtFuCd() {
        return rtFuCd;
    }

    /** 
     * Sets the rtFuCd.
     * 
     * @param rtFuCd the rtFuCd
     */
    public void setRtFuCd(String rtFuCd) {
        this.rtFuCd = rtFuCd;
    }

    /** 
     * Returns the verNo.
     * 
     * @return the verNo
     */
    public String getVerNo() {
        return verNo;
    }

    /** 
     * Sets the verNo.
     * 
     * @param verNo the verNo
     */
    public void setVerNo(String verNo) {
        this.verNo = verNo;
    }

    /** 
     * Returns the fuTpCd.
     * 
     * @return the fuTpCd
     */
    public String getFuTpCd() {
        return fuTpCd;
    }

    /** 
     * Sets the fuTpCd.
     * 
     * @param fuTpCd the fuTpCd
     */
    public void setFuTpCd(String fuTpCd) {
        this.fuTpCd = fuTpCd;
    }

    /** 
     * Returns the nm.
     * 
     * @return the nm
     */
    public String getNm() {
        return nm;
    }

    /** 
     * Sets the nm.
     * 
     * @param nm the nm
     */
    public void setNm(String nm) {
        this.nm = nm;
    }

    /** 
     * Returns the des.
     * 
     * @return the des
     */
    public String getDes() {
        return des;
    }

    /** 
     * Sets the des.
     * 
     * @param des the des
     */
    public void setDes(String des) {
        this.des = des;
    }

    /** 
     * Returns the shtNmEn.
     * 
     * @return the shtNmEn
     */
    public String getShtNmEn() {
        return shtNmEn;
    }

    /** 
     * Sets the shtNmEn.
     * 
     * @param shtNmEn the shtNmEn
     */
    public void setShtNmEn(String shtNmEn) {
        this.shtNmEn = shtNmEn;
    }

    /** 
     * Returns the nmEn.
     * 
     * @return the nmEn
     */
    public String getNmEn() {
        return nmEn;
    }

    /** 
     * Sets the nmEn.
     * 
     * @param nmEn the nmEn
     */
    public void setNmEn(String nmEn) {
        this.nmEn = nmEn;
    }

    /** 
     * Returns the menuF.
     * 
     * @return the menuF
     */
    public Short getMenuF() {
        return menuF;
    }

    /** 
     * Sets the menuF.
     * 
     * @param menuF the menuF
     */
    public void setMenuF(Short menuF) {
        this.menuF = menuF;
    }

    /** 
     * Returns the menuNm.
     * 
     * @return the menuNm
     */
    public String getMenuNm() {
        return menuNm;
    }

    /** 
     * Sets the menuNm.
     * 
     * @param menuNm the menuNm
     */
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    /** 
     * Returns the memo.
     * 
     * @return the memo
     */
    public String getMemo() {
        return memo;
    }

    /** 
     * Sets the memo.
     * 
     * @param memo the memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /** 
     * Returns the sortNo.
     * 
     * @return the sortNo
     */
    public String getSortNo() {
        return sortNo;
    }

    /** 
     * Sets the sortNo.
     * 
     * @param sortNo the sortNo
     */
    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    /** 
     * Returns the spellNo.
     * 
     * @return the spellNo
     */
    public String getSpellNo() {
        return spellNo;
    }

    /** 
     * Sets the spellNo.
     * 
     * @param spellNo the spellNo
     */
    public void setSpellNo(String spellNo) {
        this.spellNo = spellNo;
    }

    /** 
     * Returns the wubiNo.
     * 
     * @return the wubiNo
     */
    public String getWubiNo() {
        return wubiNo;
    }

    /** 
     * Sets the wubiNo.
     * 
     * @param wubiNo the wubiNo
     */
    public void setWubiNo(String wubiNo) {
        this.wubiNo = wubiNo;
    }

    /** 
     * Returns the updCnt.
     * 
     * @return the updCnt
     */
    public BigInteger getUpdCnt() {
        return updCnt;
    }

    /** 
     * Sets the updCnt.
     * 
     * @param updCnt the updCnt
     */
    public void setUpdCnt(BigInteger updCnt) {
        this.updCnt = updCnt;
    }

    /** 
     * Returns the crtTime.
     * 
     * @return the crtTime
     */
    public Timestamp getCrtTime() {
        return crtTime;
    }

    /** 
     * Sets the crtTime.
     * 
     * @param crtTime the crtTime
     */
    public void setCrtTime(Timestamp crtTime) {
        this.crtTime = crtTime;
    }

    /** 
     * Returns the crtUserId.
     * 
     * @return the crtUserId
     */
    public String getCrtUserId() {
        return crtUserId;
    }

    /** 
     * Sets the crtUserId.
     * 
     * @param crtUserId the crtUserId
     */
    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    /** 
     * Returns the crtDeptCd.
     * 
     * @return the crtDeptCd
     */
    public String getCrtDeptCd() {
        return crtDeptCd;
    }

    /** 
     * Sets the crtDeptCd.
     * 
     * @param crtDeptCd the crtDeptCd
     */
    public void setCrtDeptCd(String crtDeptCd) {
        this.crtDeptCd = crtDeptCd;
    }

    /** 
     * Returns the lastUpdTime.
     * 
     * @return the lastUpdTime
     */
    public Timestamp getLastUpdTime() {
        return lastUpdTime;
    }

    /** 
     * Sets the lastUpdTime.
     * 
     * @param lastUpdTime the lastUpdTime
     */
    public void setLastUpdTime(Timestamp lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    /** 
     * Returns the lastUpdDeptCd.
     * 
     * @return the lastUpdDeptCd
     */
    public String getLastUpdDeptCd() {
        return lastUpdDeptCd;
    }

    /** 
     * Sets the lastUpdDeptCd.
     * 
     * @param lastUpdDeptCd the lastUpdDeptCd
     */
    public void setLastUpdDeptCd(String lastUpdDeptCd) {
        this.lastUpdDeptCd = lastUpdDeptCd;
    }

    /** 
     * Returns the lastUpdUserId.
     * 
     * @return the lastUpdUserId
     */
    public String getLastUpdUserId() {
        return lastUpdUserId;
    }

    /** 
     * Sets the lastUpdUserId.
     * 
     * @param lastUpdUserId the lastUpdUserId
     */
    public void setLastUpdUserId(String lastUpdUserId) {
        this.lastUpdUserId = lastUpdUserId;
    }

    /** 
     * Returns the delF.
     * 
     * @return the delF
     */
    public Short getDelF() {
        return delF;
    }

    /** 
     * Sets the delF.
     * 
     * @param delF the delF
     */
    public void setDelF(Short delF) {
        this.delF = delF;
    }
}