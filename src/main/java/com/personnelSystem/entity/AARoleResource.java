package com.personnelSystem.entity;

import java.util.Date;

public class AARoleResource extends AARoleResourceKey {
    private Date createdTime;

    private Integer createdBy;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
}