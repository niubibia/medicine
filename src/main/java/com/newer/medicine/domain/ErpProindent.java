package com.newer.medicine.domain;

import java.math.BigDecimal;

public class ErpProindent {
    private String indentId;

    private String indentNumber;

    private BigDecimal indentMoney;

    private Integer indentCount;

    private String indentUrgency;

    private String indentEmetime;

    private String indentWorktime;

    private String indentEndtime;

    private Integer state;

    private String isva;

    private String indentState;

    private String remark;

    private String createtime;

    private String creater;

    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId == null ? null : indentId.trim();
    }

    public String getIndentNumber() {
        return indentNumber;
    }

    public void setIndentNumber(String indentNumber) {
        this.indentNumber = indentNumber == null ? null : indentNumber.trim();
    }

    public BigDecimal getIndentMoney() {
        return indentMoney;
    }

    public void setIndentMoney(BigDecimal indentMoney) {
        this.indentMoney = indentMoney;
    }

    public Integer getIndentCount() {
        return indentCount;
    }

    public void setIndentCount(Integer indentCount) {
        this.indentCount = indentCount;
    }

    public String getIndentUrgency() {
        return indentUrgency;
    }

    public void setIndentUrgency(String indentUrgency) {
        this.indentUrgency = indentUrgency == null ? null : indentUrgency.trim();
    }

    public String getIndentEmetime() {
        return indentEmetime;
    }

    public void setIndentEmetime(String indentEmetime) {
        this.indentEmetime = indentEmetime == null ? null : indentEmetime.trim();
    }

    public String getIndentWorktime() {
        return indentWorktime;
    }

    public void setIndentWorktime(String indentWorktime) {
        this.indentWorktime = indentWorktime == null ? null : indentWorktime.trim();
    }

    public String getIndentEndtime() {
        return indentEndtime;
    }

    public void setIndentEndtime(String indentEndtime) {
        this.indentEndtime = indentEndtime == null ? null : indentEndtime.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIsva() {
        return isva;
    }

    public void setIsva(String isva) {
        this.isva = isva == null ? null : isva.trim();
    }

    public String getIndentState() {
        return indentState;
    }

    public void setIndentState(String indentState) {
        this.indentState = indentState == null ? null : indentState.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}