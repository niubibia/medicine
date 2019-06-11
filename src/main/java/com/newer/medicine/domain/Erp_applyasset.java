package com.newer.medicine.domain;

import java.io.Serializable;

/**
 * 采购pojo
 */

public class Erp_applyasset implements Serializable {
    private static final long serialVersionUID = -2167246545479211100L;
    private String APPASS_ID;
    private String PURC_ID;
    private String APPASS_SERIAL;
    private String APPASS_APPLY;
    private String APPASS_TYPE;
    private Integer STATE;
    private String APPASS_TIME;
    private String APPASS_NUM;
    private Integer ISVA;
    private String REMARK;

    public Erp_applyasset() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAPPASS_ID() {
        return APPASS_ID;
    }

    public void setAPPASS_ID(String APPASS_ID) {
        this.APPASS_ID = APPASS_ID;
    }

    public String getPURC_ID() {
        return PURC_ID;
    }

    public void setPURC_ID(String PURC_ID) {
        this.PURC_ID = PURC_ID;
    }

    public String getAPPASS_SERIAL() {
        return APPASS_SERIAL;
    }

    public void setAPPASS_SERIAL(String APPASS_SERIAL) {
        this.APPASS_SERIAL = APPASS_SERIAL;
    }

    public String getAPPASS_APPLY() {
        return APPASS_APPLY;
    }

    public void setAPPASS_APPLY(String APPASS_APPLY) {
        this.APPASS_APPLY = APPASS_APPLY;
    }

    public String getAPPASS_TYPE() {
        return APPASS_TYPE;
    }

    public void setAPPASS_TYPE(String APPASS_TYPE) {
        this.APPASS_TYPE = APPASS_TYPE;
    }

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }

    public String getAPPASS_TIME() {
        return APPASS_TIME;
    }

    public void setAPPASS_TIME(String APPASS_TIME) {
        this.APPASS_TIME = APPASS_TIME;
    }

    public String getAPPASS_NUM() {
        return APPASS_NUM;
    }

    public void setAPPASS_NUM(String APPASS_NUM) {
        this.APPASS_NUM = APPASS_NUM;
    }

    public Integer getISVA() {
        return ISVA;
    }

    public void setISVA(Integer ISVA) {
        this.ISVA = ISVA;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }
}
