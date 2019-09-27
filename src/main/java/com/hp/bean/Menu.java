package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private Integer menuNo;

    private String menuName;

    private String menuUrl;

    private Integer menuUpperNo;

    private String menuImg;

    private String icon;
    
    private boolean open = true;
    
    private boolean checked = false;
    
	private List<Menu> children = new ArrayList<Menu>();

    public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Integer getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Integer menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Integer getMenuUpperNo() {
        return menuUpperNo;
    }

    public void setMenuUpperNo(Integer menuUpperNo) {
        this.menuUpperNo = menuUpperNo;
    }

    public String getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg == null ? null : menuImg.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}