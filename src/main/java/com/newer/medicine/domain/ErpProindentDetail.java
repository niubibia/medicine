package com.newer.medicine.domain;


import java.io.Serializable;

public class ErpProindentDetail implements Serializable {
    private static final long serialVersionUID = -5932233870623896223L;
    private String entdeId;
    private String kinId;
    private String indentId;
    private int entdeNum;
    private int num;
    private double entdePrice;
    private String creater;
    private String createTime;
    private String remark;
    private String isva;
    private String kinName;
    private double kinPrice;

    public double getKinPrice() {
        return kinPrice;
    }

    public void setKinPrice(double kinPrice) {
        this.kinPrice = kinPrice;
    }

    public String getKinName() {
        return kinName;
    }

    public void setKinName(String kinName) {
        this.kinName = kinName;
    }

    public ErpProindentDetail() {
    }

    public String getEntdeId() {
        return entdeId;
    }

    public void setEntdeId(String entdeId) {
        this.entdeId = entdeId;
    }

    public String getKinId() {
        return kinId;
    }

    public void setKinId(String kinId) {
        this.kinId = kinId;
    }

    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    public int getEntdeNum() {
        return entdeNum;
    }

    public void setEntdeNum(int entdeNum) {
        this.entdeNum = entdeNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getEntdePrice() {
        return entdePrice;
    }

    public void setEntdePrice(double entdePrice) {
        this.entdePrice = entdePrice;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsva() {
        return isva;
    }

    public void setIsva(String isva) {
        this.isva = isva;
    }
}

