package com.newer.medicine.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Erp_Keids implements Serializable {
    private static final long serialVersionUID = -3756991941437019974L;

    private String kinId; //商品id

    private String typeId;//药品类型id

    private String kinSerial;//药品类型边海

    private String kinBarcode;//药品单位

    private String kinName;//药品名

    private BigDecimal kinContent;

    private String kinExpiration;
    private BigDecimal kinSellinf;
    private String bure;

    private BigDecimal kinPrice;//药品出售价格

    private BigDecimal kinStost;//药品出售价

    private Integer isva;//是否有效

    private String createtime;//创建时间

    private String creater;//创建人
    private String resName;//药品名字
    private String remark;//备注

    public Erp_Keids() {
    }

    public String getKinId() {
        return kinId;
    }

    public void setKinId(String kinId) {
        this.kinId = kinId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getKinSerial() {
        return kinSerial;
    }

    public void setKinSerial(String kinSerial) {
        this.kinSerial = kinSerial;
    }

    public String getKinBarcode() {
        return kinBarcode;
    }

    public void setKinBarcode(String kinBarcode) {
        this.kinBarcode = kinBarcode;
    }

    public String getKinName() {
        return kinName;
    }

    public void setKinName(String kinName) {
        this.kinName = kinName;
    }

    public BigDecimal getKinContent() {
        return kinContent;
    }

    public void setKinContent(BigDecimal kinContent) {
        this.kinContent = kinContent;
    }

    public String getKinExpiration() {
        return kinExpiration;
    }

    public void setKinExpiration(String kinExpiration) {
        this.kinExpiration = kinExpiration;
    }

    public BigDecimal getKinSellinf() {
        return kinSellinf;
    }

    public void setKinSellinf(BigDecimal kinSellinf) {
        this.kinSellinf = kinSellinf;
    }

    public String getBure() {
        return bure;
    }

    public void setBure(String bure) {
        this.bure = bure;
    }

    public BigDecimal getKinPrice() {
        return kinPrice;
    }

    public void setKinPrice(BigDecimal kinPrice) {
        this.kinPrice = kinPrice;
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
        this.createtime = createtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
