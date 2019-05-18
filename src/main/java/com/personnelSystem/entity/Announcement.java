package com.personnelSystem.entity;

import java.util.Date;

public class Announcement {
    private Integer id;

    private String title;

    private Integer state;

    private String content;

    private Integer createbyid;

    private String createbyName;

    private Date createtime;

    private Integer modifybyid;

    private String modifybyName;

    private Date modifydatetime;

    private Boolean version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCreatebyid() {
        return createbyid;
    }

    public void setCreatebyid(Integer createbyid) {
        this.createbyid = createbyid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getModifybyid() {
        return modifybyid;
    }

    public void setModifybyid(Integer modifybyid) {
        this.modifybyid = modifybyid;
    }

    public Date getModifydatetime() {
        return modifydatetime;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

    public Boolean getVersion() {
        return version;
    }

    public void setVersion(Boolean version) {
        this.version = version;
    }

    public String getCreatebyName() {
        return createbyName;
    }

    public void setCreatebyName(String createbyName) {
        this.createbyName = createbyName;
    }

    public String getModifybyName() {
        return modifybyName;
    }

    public void setModifybyName(String modifybyName) {
        this.modifybyName = modifybyName;
    }
}