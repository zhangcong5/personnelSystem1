package com.personnelSystem.entity;

import java.util.Date;

public class AAResource {
    private Integer resourceId;

    private String resourceCode;

    private String resourceName;

    private String resourceTypeCd;

    private String resourceValue;

    private Integer parentResourceId;

    private Integer deleted;

    private Date createdTime;

    private Date updatedTime;

    private Integer createdByid;

    private Integer updatedByid;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceTypeCd() {
        return resourceTypeCd;
    }

    public void setResourceTypeCd(String resourceTypeCd) {
        this.resourceTypeCd = resourceTypeCd == null ? null : resourceTypeCd.trim();
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue == null ? null : resourceValue.trim();
    }

    public Integer getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(Integer parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getCreatedByid() {
        return createdByid;
    }

    public void setCreatedByid(Integer createdByid) {
        this.createdByid = createdByid;
    }

    public Integer getUpdatedByid() {
        return updatedByid;
    }

    public void setUpdatedByid(Integer updatedByid) {
        this.updatedByid = updatedByid;
    }
}