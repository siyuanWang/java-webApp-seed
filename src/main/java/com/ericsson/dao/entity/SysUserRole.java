package com.ericsson.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUserRole implements Serializable {
	private static final long serialVersionUID = 6128818075716860897L;
    private Long id;
    private Long userId;
    private Long roleId;
    private Date updateTime;
    private Date createTime;
    
    public SysUserRole() {};
    
	public SysUserRole(Long id, Long userId, Long roleId, Date updateTime,
			Date createTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
    
}
