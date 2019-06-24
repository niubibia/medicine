package com.newer.medicine.domain;

import java.io.Serializable;

public class Erp_audit implements Serializable{
    private static final long serialVersionUID = -728046639666909480L;
    private String AUD_ID;
    private String PURC_ID;
    private String AUD_NAME;
    private String AUD_TIME;
    private int STATE;
    private String FEEDBACK;

    public Erp_audit() {
    }

    public String getAUD_ID() {
        return AUD_ID;
    }

    public void setAUD_ID(String AUD_ID) {
        this.AUD_ID = AUD_ID;
    }

    public String getPURC_ID() {
        return PURC_ID;
    }

    public void setPURC_ID(String PURC_ID) {
        this.PURC_ID = PURC_ID;
    }

    public String getAUD_NAME() {
        return AUD_NAME;
    }

    public void setAUD_NAME(String AUD_NAME) {
        this.AUD_NAME = AUD_NAME;
    }

    public String getAUD_TIME() {
        return AUD_TIME;
    }

    public void setAUD_TIME(String AUD_TIME) {
        this.AUD_TIME = AUD_TIME;
    }

    public int getSTATE() {
        return STATE;
    }

    public void setSTATE(int STATE) {
        this.STATE = STATE;
    }

    public String getFEEDBACK() {
        return FEEDBACK;
    }

    public void setFEEDBACK(String FEEDBACK) {
        this.FEEDBACK = FEEDBACK;
    }
}
