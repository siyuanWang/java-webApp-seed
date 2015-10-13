package com.ericsson.controller.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * 对应前端的bootstrap-treeview的数据结构
 * @author wangsy
 *
 */
public class SysMenuPojo implements Serializable{
	private static final long serialVersionUID = -3393229039591335016L;
	
	private String text;
	private String icon = "fa fa-paper-plane";
	private String selectedIcon;
	private String color;
	private String backColor;
	private String href;
	private String selectable;
	private BootstrapTreeviewNodeState state;
	private String[] tags;
	private List<SysMenuPojo> nodes;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getSelectedIcon() {
		return selectedIcon;
	}
	public void setSelectedIcon(String selectedIcon) {
		this.selectedIcon = selectedIcon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBackColor() {
		return backColor;
	}
	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getSelectable() {
		return selectable;
	}
	public void setSelectable(String selectable) {
		this.selectable = selectable;
	}
	public BootstrapTreeviewNodeState getState() {
		return state;
	}
	public void setState(BootstrapTreeviewNodeState state) {
		this.state = state;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public List<SysMenuPojo> getNodes() {
		return nodes;
	}
	public void setNodes(List<SysMenuPojo> nodes) {
		this.nodes = nodes;
	}
}

class BootstrapTreeviewNodeState {
    private boolean checked;
    private boolean disabled;
    private boolean expanded;
    private boolean selected;
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
