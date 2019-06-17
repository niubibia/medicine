package com.newer.medicine.domain;

import java.io.Serializable;

public class ErpLog implements Serializable {
    private static final long serialVersionUID = -7673358437248091118L;
    private String logId;

    private String indentId;

    private String logSerial;

    private String logTitle;

    private String logContent;

    private Integer logNum;

    private Integer logComplet;

    private String logPerson;

    private Integer isva;

    private Integer state;

    private String createtime;

    private String creater;

    private String remark;

    public ErpLog() {
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    public String getLogSerial() {
        return logSerial;
    }

    public void setLogSerial(String logSerial) {
        this.logSerial = logSerial;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public Integer getLogNum() {
        return logNum;
    }

    public void setLogNum(Integer logNum) {
        this.logNum = logNum;
    }

    public Integer getLogComplet() {
        return logComplet;
    }

    public void setLogComplet(Integer logComplet) {
        this.logComplet = logComplet;
    }

    public String getLogPerson() {
        return logPerson;
    }

    public void setLogPerson(String logPerson) {
        this.logPerson = logPerson;
    }

    public Integer getIsva() {
        return isva;
    }

    public void setIsva(Integer isva) {
        this.isva = isva;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
