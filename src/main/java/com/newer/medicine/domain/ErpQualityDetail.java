package com.newer.medicine.domain;

import java.io.Serializable;
import java.util.List;

public class ErpQualityDetail implements Serializable {
    private static final long serialVersionUID = 3959220713940326247L;
    private String qdetId;//质检详细表id

    private String quaId;//质检表id

    private String rawId;//原材料id

    private String kinId;//药品id

    private Integer qdetGood;//质检良品

    private Integer qdetBab;//质检不良品

    private String remark;//备注

    private String createtime;//创建时间
    
    private String kindName;//药品名

    private String rawName;//原材料名
    /*List<Erp_purchase> puc;//采购订单表

    public List<Erp_purchase> getPuc() {
        return puc;
    }

    public void setPuc(List<Erp_purchase> puc) {
        this.puc = puc;
    }*/

    /**
     * 原材料名字
     * @return
     */
    public String getRawName() {
		return rawName;
	}
    /**
     * 原材料名字
     * @param rawName
     */
	public void setRawName(String rawName) {
		this.rawName = rawName;
	}
    /**
     * 药品名字
     * @return
     */
	public String getKindName() {
		return kindName;
	}
    /**
     * 药品名字
     * @param kindName
     */
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
    /**
     * 质检明细id
     * @return
     */
	public String getQdetId() {
        return qdetId;
    }
    /**
     * 质检明细id
     * @param qdetId
     */
    public void setQdetId(String qdetId) {
        this.qdetId = qdetId == null ? null : qdetId.trim();
    }
    /**
     * 质检id
     * @return
     */
    public String getQuaId() {
        return quaId;
    }
    /**
     * 质检id
     * @param quaId
     */
    public void setQuaId(String quaId) {
        this.quaId = quaId == null ? null : quaId.trim();
    }
    /**
     * 药效id
     * @return
     */
    public String getRawId() {
        return rawId;
    }
    /**
     * 药效id
     * @param rawId
     */
    public void setRawId(String rawId) {
        this.rawId = rawId == null ? null : rawId.trim();
    }
    /**
     * 药品id
     * @return
     */
    public String getKinId() {
        return kinId;
    }
    /**
     * 药品id
     * @param kinId
     */
    public void setKinId(String kinId) {
        this.kinId = kinId == null ? null : kinId.trim();
    }
    /**
     * 良品
     * @return
     */
    public Integer getQdetGood() {
        return qdetGood;
    }
    /**
     * 良品
     * @param qdetGood
     */
    public void setQdetGood(Integer qdetGood) {
        this.qdetGood = qdetGood;
    }
    /**
     * 不良品
     * @return
     */
    public Integer getQdetBab() {
        return qdetBab;
    }
    /**
     * 不良品
     * @param qdetBab
     */
    public void setQdetBab(Integer qdetBab) {
        this.qdetBab = qdetBab;
    }
    /**
     * 备注
     * @return
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    /**
     * 创建时间
     * @return
     */
    public String getCreatetime() {
        return createtime;
    }
    /**
     * 创建时间
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}