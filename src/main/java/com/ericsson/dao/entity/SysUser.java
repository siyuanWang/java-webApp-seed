package com.ericsson.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private static final long serialVersionUID = -3147008101648688774L;
    
    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String phone;
    private String email;
    private boolean isBuiltin;
    private String loginTime;
    private Date passwordLastModifyTime;
    private Date updateTime;
    private Date createTime;

    public SysUser() {};
    
    public SysUser(Long id, String loginId, String password, String name,
			String phone, String email, boolean isBuiltin, String loginTime,
			Date passwordLastModifyTime, Date updateTime, Date createTime) {
		super();
		this.id = id;
		this.loginId = loginId;
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

	public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(final String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
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

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public boolean isBuiltin() {
		return isBuiltin;
	}

	public void setBuiltin(boolean isBuiltin) {
		this.isBuiltin = isBuiltin;
	}

	public Date getPasswordLastModifyTime() {
		return passwordLastModifyTime;
	}

	public void setPasswordLastModifyTime(Date passwordLastModifyTime) {
		this.passwordLastModifyTime = passwordLastModifyTime;
	}
}
