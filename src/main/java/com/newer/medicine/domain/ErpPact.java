package com.newer.medicine.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErpPact {
    private String pactId;

    private String purId;

    private String applyId;

    private String patypeId;

    private String pactTitle;

    private String pactNumber;

    private Date pactSigntime;

    private String pactText;

    private String partaName;

    private String partbName;

    private String pactEndtime;

    private String pactIsvo;

    private Integer isva;

    private String creater;

    private String createtime;

    private String remark;

    public String getPactId() {
        return pactId;
    }

    public void setPactId(String pactId) {
        this.pactId = pactId == null ? null : pactId.trim();
    }

    public String getPurId() {
        return purId;
    }

    public void setPurId(String purId) {
        this.purId = purId == null ? null : purId.trim();
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getPatypeId() {
        return patypeId;
    }

    public void setPatypeId(String patypeId) {
        this.patypeId = patypeId == null ? null : patypeId.trim();
    }

    public String getPactTitle() {
        return pactTitle;
    }

    public void setPactTitle(String pactTitle) {
        this.pactTitle = pactTitle == null ? null : pactTitle.trim();
    }

    public String getPactNumber() {
        return pactNumber;
    }

    public void setPactNumber(String pactNumber) {
        this.pactNumber = pactNumber == null ? null : pactNumber.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getPactSigntime() {
        return pactSigntime;
    }

    public void setPactSigntime(Date pactSigntime) {
        this.pactSigntime = pactSigntime;
    }

    public String getPactText() {
        return pactText;
    }

    public void setPactText(String pactText) {
        this.pactText = pactText == null ? null : pactText.trim();
    }

    public String getPartaName() {
        return partaName;
    }

    public void setPartaName(String partaName) {
        this.partaName = partaName == null ? null : partaName.trim();
    }

    public String getPartbName() {
        return partbName;
    }

    public void setPartbName(String partbName) {
        this.partbName = partbName == null ? null : partbName.trim();
    }

    public String getPactEndtime() {
        return pactEndtime;
    }

    public void setPactEndtime(String pactEndtime) {
        this.pactEndtime = pactEndtime == null ? null : pactEndtime.trim();
    }

    public String getPactIsvo() {
        return pactIsvo;
    }

    public void setPactIsvo(String pactIsvo) {
        this.pactIsvo = pactIsvo == null ? null : pactIsvo.trim();
    }

    public Integer getIsva() {
        return isva;
    }

    public void setIsva(Integer isva) {
        this.isva = isva;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

   
}