package com.newer.medicine.domain;

import java.io.Serializable;

/**
 * @program: medicine
 * @description: pojo - ErpRoleModel
 * @author: ccziwe
 * @create: 2019-06-13 16:26
 **/

public class ErpRoleModel implements Serializable {
    private static final long serialVersionUID = 6220956714125993677L;
    private String roleModelId;

    private String modelId;

    private String roleId;

    public String getRoleModelId() {
        return roleModelId;
    }

    public void setRoleModelId(String roleModelId) {
        this.roleModelId = roleModelId == null ? null : roleModelId.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }


}
