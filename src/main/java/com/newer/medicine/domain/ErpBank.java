package com.newer.medicine.domain;

/**
 * 入库表
 */
public class ErpBank {
    private String bankId; //入库id

    private String bankNumber; // 入库编号

    private String bankTime; // 入库时间

    private Integer bankCount; //入库数量

    private String bankStaffid; //入库人id

    private Integer isva; //是否有效

    private String createtime; // 创建时间

    private String creater; // 创建人

    private String reaark; // 备注

    private Integer bankIsva; // 入库状态

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    public String getBankTime() {
        return bankTime;
    }

    public void setBankTime(String bankTime) {
        this.bankTime = bankTime == null ? null : bankTime.trim();
    }

    public Integer getBankCount() {
        return bankCount;
    }

    public void setBankCount(Integer bankCount) {
        this.bankCount = bankCount;
    }

    public String getBankStaffid() {
        return bankStaffid;
    }

    public void setBankStaffid(String bankStaffid) {
        this.bankStaffid = bankStaffid == null ? null : bankStaffid.trim();
    }

    public Integer getIsva() {
        return isva;
    }

    public void setIsva(Integer isva) {
        this.isva = isva;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getReaark() {
        return reaark;
    }

    public void setReaark(String reaark) {
        this.reaark = reaark == null ? null : reaark.trim();
    }

    public Integer getBankIsva() {
        return bankIsva;
    }

    public void setBankIsva(Integer bankIsva) {
        this.bankIsva = bankIsva;
    }
}