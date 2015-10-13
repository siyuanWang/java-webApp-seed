package com.ericsson.dao.entity;

// Generated 2015-10-13 17:16:11 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SysUserRole generated by hbm2java
 */
@Entity
@Table(name = "sys_user_role", schema = "public")
public class SysUserRole implements java.io.Serializable {

	private int id;
	private int userId;
	private int roleId;
	private Date updateTime;
	private Date createTime;

	public SysUserRole() {
	}

	public SysUserRole(int id, int userId, int roleId, Date updateTime,
			Date createTime) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	@Id
	@SequenceGenerator(name="geely_sequences", sequenceName="geely_sequences", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="geely_sequences")
	@Column(name = "\"ID\"", unique=true, nullable=false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "\"USER_ID\"", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "\"ROLE_ID\"", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"UPDATE_TIME\"", nullable = false, length = 22)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"CREATE_TIME\"", nullable = false, length = 22)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}