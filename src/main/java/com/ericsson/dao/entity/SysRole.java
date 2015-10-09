package com.ericsson.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    private static final long serialVersionUID = -7945370600090841709L;
    private Long id;
    private String name;
    private Long status;
    private Date updateTime;
    private Date createTime;

    public SysRole() {};
    
    public SysRole(Long id, String name, Long status, Date updateTime,
			Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(final Long status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

}
