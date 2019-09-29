package com.hp.bean;

public class Group {
    private Integer gNum;

    private String gName;

    private Integer roNo;
    
    private Role role;

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getRoNo() {
        return roNo;
    }

    public void setRoNo(Integer roNo) {
        this.roNo = roNo;
    }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}