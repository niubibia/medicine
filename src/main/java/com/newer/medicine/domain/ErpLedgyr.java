package com.newer.medicine.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 分店支出收入
 * @author wzl
 */
public class ErpLedgyr implements Serializable {

    private static final long serialVersionUID = -1603261204280571198L;
    private String gyrId;

    private String fdproId;

    private String saleId;

    private String annexId;

    private String gyrSreial;

    private BigDecimal gyrPrice;

    private String remark;

    private String creater;

    private String createtime;

    private Integer isva;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date saleDate;
private double saleMoney;
private double saleNum;

private Integer fdproWarecount;
private double fdproSumprice;
private String fdproTime;

    public Integer getFdproWarecount() {
        return fdproWarecount;
    }

    public void setFdproWarecount(Integer fdproWarecount) {
        this.fdproWarecount = fdproWarecount;
    }

    public double getFdproSumprice() {
        return fdproSumprice;
    }

    public void setFdproSumprice(double fdproSumprice) {
        this.fdproSumprice = fdproSumprice;
    }

    public String getFdproTime() {
        return fdproTime;
    }

    public void setFdproTime(String fdproTime) {
        this.fdproTime = fdproTime;
    }

    public double getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(double saleNum) {
        this.saleNum = saleNum;
    }

    public double getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public ErpLedgyr() {
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * 分店支出收入id
     * @return
     */
    public String getGyrId() {
        return gyrId;
    }

    /**
     * 分店支出收入id
     * @return
     */
    public void setGyrId(String gyrId) {
        this.gyrId = gyrId == null ? null : gyrId.trim();
    }
    
    /**
     * 分店采购订单id
     * @return
     */
    public String getFdproId() {
        return fdproId;
    }

    /**
     * 分店采购订单id
     * @return
     */
    public void setFdproId(String fdproId) {
        this.fdproId = fdproId == null ? null : fdproId.trim();
    }

    /**
     * 分店销售ID
     * @return
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * 分店销售ID
     * @param saleId
     */
    public void setSaleId(String saleId) {
        this.saleId = saleId == null ? null : saleId.trim();
    }

    /**
     * 分店id
     * @return
     */
    public String getAnnexId() {
        return annexId;
    }

    /**
     * 分店id
     * @return
     */
    public void setAnnexId(String annexId) {
        this.annexId = annexId == null ? null : annexId.trim();
    }

    /**
     * 分店支出收入编号
     * @return
     */
    public String getGyrSreial() {
        return gyrSreial;
    }

    /**
     * 分店支出收入编号
     * @return
     */
    public void setGyrSreial(String gyrSreial) {
        this.gyrSreial = gyrSreial == null ? null : gyrSreial.trim();
    }

    /**
     * 分店支出金钱
     * @return
     */
    public BigDecimal getGyrPrice() {
        return gyrPrice;
    }

    /**
     * 分店支出金钱
     * @return
     */
    public void setGyrPrice(BigDecimal gyrPrice) {
        this.gyrPrice = gyrPrice;
    }

    /**
     * 备注
     * @return
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    /**
     * 创建人
     * @return
     */
    public String getCreater() {
        return creater;
    }
    /**
     * 创建人
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
    /**
     * 创建时间
     * @return
     */
    public String getCreatetime() {
        return createtime;
    }
    /**
     * 创建时间
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
    /**
     * 状态
     * @return
     */
    public Integer getIsva() {
        return isva;
    }
    /**
     * 状态
     * @param isva
     */
    public void setIsva(Integer isva) {
        this.isva = isva;
    }
}