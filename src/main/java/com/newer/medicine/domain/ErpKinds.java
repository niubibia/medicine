package com.newer.medicine.domain;

import java.math.BigDecimal;

public class ErpKinds {
    private String kinId;

    private String typeId;

    private String kinSerial;

    private String kinBarcode;

    private String kinName;

    private Integer kinContent;

    private String kinExpiration;

    private BigDecimal kinPrice;

    private BigDecimal kinSellinf;

    private BigDecimal kinStost;

    private Integer isva;

    private String createtime;

    private String creater;

    private String remark;
    private int indentCount;
    private double indentMoney;

    public int getIndentCount() {
        return indentCount;
    }

    public void setIndentCount(int indentCount) {
        this.indentCount = indentCount;
    }

    public double getIndentMoney() {
        return indentMoney;
    }

    public void setIndentMoney(double indentMoney) {
        this.indentMoney = indentMoney;
    }

    public String getKinId() {
        return kinId;
    }

    public void setKinId(String kinId) {
        this.kinId = kinId == null ? null : kinId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getKinSerial() {
        return kinSerial;
    }

    public void setKinSerial(String kinSerial) {
        this.kinSerial = kinSerial == null ? null : kinSerial.trim();
    }

    public String getKinBarcode() {
        return kinBarcode;
    }

    public void setKinBarcode(String kinBarcode) {
        this.kinBarcode = kinBarcode == null ? null : kinBarcode.trim();
    }

    public String getKinName() {
        return kinName;
    }

    public void setKinName(String kinName) {
        this.kinName = kinName == null ? null : kinName.trim();
    }

    public Integer getKinContent() {
        return kinContent;
    }

    public void setKinContent(Integer kinContent) {
        this.kinContent = kinContent;
    }

    public String getKinExpiration() {
        return kinExpiration;
    }

    public void setKinExpiration(String kinExpiration) {
        this.kinExpiration = kinExpiration == null ? null : kinExpiration.trim();
    }

    public BigDecimal getKinPrice() {
        return kinPrice;
    }

    public void setKinPrice(BigDecimal kinPrice) {
        this.kinPrice = kinPrice;
    }

    public BigDecimal getKinSellinf() {
        return kinSellinf;
    }

    public void setKinSellinf(BigDecimal kinSellinf) {
        this.kinSellinf = kinSellinf;
    }

    public BigDecimal getKinStost() {
        return kinStost;
    }

    public void setKinStost(BigDecimal kinStost) {
        this.kinStost = kinStost;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}