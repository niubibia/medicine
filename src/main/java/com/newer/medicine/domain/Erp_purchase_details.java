package com.newer.medicine.domain;

import java.io.Serializable;

public class Erp_purchase_details implements Serializable {
private String PUR_DET_ID;
private String PURC_ID;
private String RAW_ID;
private String PUR_DET_SERIA;
private int PUR_TOTAL_NUMBER;
private double PUR_TOTAL_PRICE;

    public Erp_purchase_details() {
    }

    public String getPUR_DET_ID() {
        return PUR_DET_ID;
    }

    public void setPUR_DET_ID(String PUR_DET_ID) {
        this.PUR_DET_ID = PUR_DET_ID;
    }

    public String getPURC_ID() {
        return PURC_ID;
    }

    public void setPURC_ID(String PURC_ID) {
        this.PURC_ID = PURC_ID;
    }

    public String getRAW_ID() {
        return RAW_ID;
    }

    public void setRAW_ID(String RAW_ID) {
        this.RAW_ID = RAW_ID;
    }

    public String getPUR_DET_SERIA() {
        return PUR_DET_SERIA;
    }

    public void setPUR_DET_SERIA(String PUR_DET_SERIA) {
        this.PUR_DET_SERIA = PUR_DET_SERIA;
    }

    public int getPUR_TOTAL_NUMBER() {
        return PUR_TOTAL_NUMBER;
    }

    public void setPUR_TOTAL_NUMBER(int PUR_TOTAL_NUMBER) {
        this.PUR_TOTAL_NUMBER = PUR_TOTAL_NUMBER;
    }

    public double getPUR_TOTAL_PRICE() {
        return PUR_TOTAL_PRICE;
    }

    public void setPUR_TOTAL_PRICE(double PUR_TOTAL_PRICE) {
        this.PUR_TOTAL_PRICE = PUR_TOTAL_PRICE;
    }
}
