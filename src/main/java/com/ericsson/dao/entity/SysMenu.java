package com.ericsson.dao.entity;


import java.util.Date;

public class SysMenu implements java.io.Serializable {

    private static final long serialVersionUID = 3135869533120278089L;
    private Integer id;
    private Integer pid;
    private String name;
    private String url;
    private int orderNum;
    private int type;
    private Date updateTime;
    private Date createTime;

    public SysMenu() {
    }
    

	public SysMenu(Integer id, Integer pid, String name, String url,
			int orderNum, int type, Date updateTime, Date createTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.url = url;
		this.orderNum = orderNum;
		this.type = type;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
