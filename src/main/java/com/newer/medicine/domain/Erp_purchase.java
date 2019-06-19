package com.newer.medicine.domain;

import java.io.Serializable;

/**
 * 采购订单表
 */

public class Erp_purchase implements Serializable {
    private static final long serialVersionUID = -2167246545479211100L;
   private String PURC_ID;
   private String PURC_SERIAL;//采购订单表
    private String PURC_TITLE;//采购标题
    private String PURC_NAME;//采购人
    private int STATE;//状态
    private String PURC_TIME;//采购时间
    private String CREATE;//创建人
    private String CREATETIME;//创建时间
    private Integer ISVA;//是否有效
    private String RAW_NAME;//原材料名字
    private double PUR_TOTAL_NUMBER;//单价
    private double PUR_TOTAL_PRICE;//总价
    private double PURC_TOTAL_PRICE;

    public Erp_purchase() {
    }

    public double getPURC_TOTAL_PRICE() {
        return PURC_TOTAL_PRICE;
    }

    public void setPURC_TOTAL_PRICE(double PURC_TOTAL_PRICE) {
        this.PURC_TOTAL_PRICE = PURC_TOTAL_PRICE;
    }

    public String getRAW_NAME() {
        return RAW_NAME;
    }

    public void setRAW_NAME(String RAW_NAME) {
        this.RAW_NAME = RAW_NAME;
    }

    public double getPUR_TOTAL_NUMBER() {
        return PUR_TOTAL_NUMBER;
    }

    public void setPUR_TOTAL_NUMBER(double PUR_TOTAL_NUMBER) {
        this.PUR_TOTAL_NUMBER = PUR_TOTAL_NUMBER;
    }

    public double getPUR_TOTAL_PRICE() {
        return PUR_TOTAL_PRICE;
    }

    public void setPUR_TOTAL_PRICE(double PUR_TOTAL_PRICE) {
        this.PUR_TOTAL_PRICE = PUR_TOTAL_PRICE;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPURC_ID() {
        return PURC_ID;
    }

    public void setPURC_ID(String PURC_ID) {
        this.PURC_ID = PURC_ID;
    }

    public String getPURC_SERIAL() {
        return PURC_SERIAL;
    }

    public void setPURC_SERIAL(String PURC_SERIAL) {
        this.PURC_SERIAL = PURC_SERIAL;
    }

    public String getPURC_TITLE() {
        return PURC_TITLE;
    }

    public void setPURC_TITLE(String PURC_TITLE) {
        this.PURC_TITLE = PURC_TITLE;
    }

    public String getPURC_NAME() {
        return PURC_NAME;
    }

    public void setPURC_NAME(String PURC_NAME) {
        this.PURC_NAME = PURC_NAME;
    }

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }

    public String getPURC_TIME() {
        return PURC_TIME;
    }

    public void setPURC_TIME(String PURC_TIME) {
        this.PURC_TIME = PURC_TIME;
    }

    public String getCREATE() {
        return CREATE;
    }

    public void setCREATE(String CREATE) {
        this.CREATE = CREATE;
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public Integer getISVA() {
        return ISVA;
    }

    public void setISVA(Integer ISVA) {
        this.ISVA = ISVA;
    }
}
