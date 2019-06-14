package com.newer.medicine.domain;

import java.util.List;

/**
 * 出库单表
 */
public class ErpOutbank {
    private String obId;//出库id

    private String kinordId;//分店采购id

    private String obNumber;//出库编号

    private String obTime;//出库时间

    private Integer obWarecount;//出库数量

    private Integer obBusibess;//出库状态

    private String obStaffid;//出库人

    private Integer isva;//是否有效

    private String createtime;//创建时间

    private String creater;//创建人

    private String remark;//备注

    private String staName;//出库人姓名

    private List<ErpInvedet> det;//库存明细

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public List<ErpInvedet> getDet() {
        return det;
    }

    public void setDet(List<ErpInvedet> det) {
        this.det = det;
    }

    public String getObId() {
        return obId;
    }

    public void setObId(String obId) {
        this.obId = obId == null ? null : obId.trim();
    }

    public String getKinordId() {
        return kinordId;
    }

    public void setKinordId(String kinordId) {
        this.kinordId = kinordId == null ? null : kinordId.trim();
    }

    public String getObNumber() {
        return obNumber;
    }

    public void setObNumber(String obNumber) {
        this.obNumber = obNumber == null ? null : obNumber.trim();
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime == null ? null : obTime.trim();
    }

    public Integer getObWarecount() {
        return obWarecount;
    }

    public void setObWarecount(Integer obWarecount) {
        this.obWarecount = obWarecount;
    }

    public Integer getObBusibess() {
        return obBusibess;
    }

    public void setObBusibess(Integer obBusibess) {
        this.obBusibess = obBusibess;
    }

    public String getObStaffid() {
        return obStaffid;
    }

    public void setObStaffid(String obStaffid) {
        this.obStaffid = obStaffid == null ? null : obStaffid.trim();
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