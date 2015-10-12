package com.ericsson.dao.entity;

// Generated 2015-10-10 13:46:24 by Hibernate Tools 4.0.0

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
 * SysUser generated by hbm2java
 */
@Entity
//@Table(name = "sys_user", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames ={"LOGIN_NAME","ID"}))
@Table(name = "sys_user", schema = "public")
public class SysUser implements java.io.Serializable {

	private Integer id;
	private String loginName;
	private String password;
	private String name;
	private String phone;
	private String email;
	private boolean isBuiltin;
	private Date loginTime;
	private Date passwordLastModifyTime;
	private Date updateTime;
	private Date createTime;

	public SysUser() {
	}

	public SysUser(Integer id, String loginName, String password, boolean isBuiltin,
			Date updateTime, Date createTime) {
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.isBuiltin = isBuiltin;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	public SysUser(Integer id, String loginName, String password, String name,
			String phone, String email, boolean isBuiltin, Date loginTime,
			Date passwordLastModifyTime, Date updateTime, Date createTime) {
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isBuiltin = isBuiltin;
		this.loginTime = loginTime;
		this.passwordLastModifyTime = passwordLastModifyTime;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public SysUser(String loginName, String password, String name,
			String phone, String email, boolean isBuiltin, Date loginTime,
			Date passwordLastModifyTime, Date updateTime, Date createTime) {
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isBuiltin = isBuiltin;
		this.loginTime = loginTime;
		this.passwordLastModifyTime = passwordLastModifyTime;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}

	@Id
	@SequenceGenerator(name="geely_sequences", sequenceName="geely_sequences", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="geely_sequences")
	@Column(name = "\"ID\"", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "\"LOGIN_NAME\"", nullable = false, unique=true, length = 100)
	public String getloginName() {
		return this.loginName;
	}

	public void setloginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "\"PASSWORD\"", nullable = false, length = 200)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "\"NAME\"", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "\"PHONE\"", length = 32)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "\"EMAIL\"", length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "\"IS_BUILTIN\"", nullable = false)
	public boolean isIsBuiltin() {
		return this.isBuiltin;
	}

	public void setIsBuiltin(boolean isBuiltin) {
		this.isBuiltin = isBuiltin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"LOGIN_TIME\"", length = 22)
	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"PASSWORD_LAST_MODIFY_TIME\"", length = 22)
	public Date getPasswordLastModifyTime() {
		return this.passwordLastModifyTime;
	}

	public void setPasswordLastModifyTime(Date passwordLastModifyTime) {
		this.passwordLastModifyTime = passwordLastModifyTime;
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
