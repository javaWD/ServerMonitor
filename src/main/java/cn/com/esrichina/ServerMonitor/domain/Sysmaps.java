package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Sysmaps generated by hbm2java
 */
public class Sysmaps implements java.io.Serializable {

	private long sysmapid;
	private Images images;
	private IconMap iconMap;
	private Users users;
	private String name;
	private int width;
	private int height;
	private int labelType;
	private int labelLocation;
	private int highlight;
	private int expandproblem;
	private int markelements;
	private int showUnack;
	private int gridSize;
	private int gridShow;
	private int gridAlign;
	private int labelFormat;
	private int labelTypeHost;
	private int labelTypeHostgroup;
	private int labelTypeTrigger;
	private int labelTypeMap;
	private int labelTypeImage;
	private String labelStringHost;
	private String labelStringHostgroup;
	private String labelStringTrigger;
	private String labelStringMap;
	private String labelStringImage;
	private int expandMacros;
	private int severityMin;
	private int private_;
	private Set sysmapsElementses = new HashSet(0);
	private Set sysmapUsrgrps = new HashSet(0);
	private Set sysmapUrls = new HashSet(0);
	private Set sysmapUsers = new HashSet(0);
	private Set sysmapsLinkses = new HashSet(0);

	public Sysmaps() {
	}

	public Sysmaps(long sysmapid, Users users, String name, int width,
			int height, int labelType, int labelLocation, int highlight,
			int expandproblem, int markelements, int showUnack, int gridSize,
			int gridShow, int gridAlign, int labelFormat, int labelTypeHost,
			int labelTypeHostgroup, int labelTypeTrigger, int labelTypeMap,
			int labelTypeImage, String labelStringHost,
			String labelStringHostgroup, String labelStringTrigger,
			String labelStringMap, String labelStringImage, int expandMacros,
			int severityMin, int private_) {
		this.sysmapid = sysmapid;
		this.users = users;
		this.name = name;
		this.width = width;
		this.height = height;
		this.labelType = labelType;
		this.labelLocation = labelLocation;
		this.highlight = highlight;
		this.expandproblem = expandproblem;
		this.markelements = markelements;
		this.showUnack = showUnack;
		this.gridSize = gridSize;
		this.gridShow = gridShow;
		this.gridAlign = gridAlign;
		this.labelFormat = labelFormat;
		this.labelTypeHost = labelTypeHost;
		this.labelTypeHostgroup = labelTypeHostgroup;
		this.labelTypeTrigger = labelTypeTrigger;
		this.labelTypeMap = labelTypeMap;
		this.labelTypeImage = labelTypeImage;
		this.labelStringHost = labelStringHost;
		this.labelStringHostgroup = labelStringHostgroup;
		this.labelStringTrigger = labelStringTrigger;
		this.labelStringMap = labelStringMap;
		this.labelStringImage = labelStringImage;
		this.expandMacros = expandMacros;
		this.severityMin = severityMin;
		this.private_ = private_;
	}

	public Sysmaps(long sysmapid, Images images, IconMap iconMap, Users users,
			String name, int width, int height, int labelType,
			int labelLocation, int highlight, int expandproblem,
			int markelements, int showUnack, int gridSize, int gridShow,
			int gridAlign, int labelFormat, int labelTypeHost,
			int labelTypeHostgroup, int labelTypeTrigger, int labelTypeMap,
			int labelTypeImage, String labelStringHost,
			String labelStringHostgroup, String labelStringTrigger,
			String labelStringMap, String labelStringImage, int expandMacros,
			int severityMin, int private_, Set sysmapsElementses,
			Set sysmapUsrgrps, Set sysmapUrls, Set sysmapUsers,
			Set sysmapsLinkses) {
		this.sysmapid = sysmapid;
		this.images = images;
		this.iconMap = iconMap;
		this.users = users;
		this.name = name;
		this.width = width;
		this.height = height;
		this.labelType = labelType;
		this.labelLocation = labelLocation;
		this.highlight = highlight;
		this.expandproblem = expandproblem;
		this.markelements = markelements;
		this.showUnack = showUnack;
		this.gridSize = gridSize;
		this.gridShow = gridShow;
		this.gridAlign = gridAlign;
		this.labelFormat = labelFormat;
		this.labelTypeHost = labelTypeHost;
		this.labelTypeHostgroup = labelTypeHostgroup;
		this.labelTypeTrigger = labelTypeTrigger;
		this.labelTypeMap = labelTypeMap;
		this.labelTypeImage = labelTypeImage;
		this.labelStringHost = labelStringHost;
		this.labelStringHostgroup = labelStringHostgroup;
		this.labelStringTrigger = labelStringTrigger;
		this.labelStringMap = labelStringMap;
		this.labelStringImage = labelStringImage;
		this.expandMacros = expandMacros;
		this.severityMin = severityMin;
		this.private_ = private_;
		this.sysmapsElementses = sysmapsElementses;
		this.sysmapUsrgrps = sysmapUsrgrps;
		this.sysmapUrls = sysmapUrls;
		this.sysmapUsers = sysmapUsers;
		this.sysmapsLinkses = sysmapsLinkses;
	}

	public long getSysmapid() {
		return this.sysmapid;
	}

	public void setSysmapid(long sysmapid) {
		this.sysmapid = sysmapid;
	}

	public Images getImages() {
		return this.images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public IconMap getIconMap() {
		return this.iconMap;
	}

	public void setIconMap(IconMap iconMap) {
		this.iconMap = iconMap;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLabelType() {
		return this.labelType;
	}

	public void setLabelType(int labelType) {
		this.labelType = labelType;
	}

	public int getLabelLocation() {
		return this.labelLocation;
	}

	public void setLabelLocation(int labelLocation) {
		this.labelLocation = labelLocation;
	}

	public int getHighlight() {
		return this.highlight;
	}

	public void setHighlight(int highlight) {
		this.highlight = highlight;
	}

	public int getExpandproblem() {
		return this.expandproblem;
	}

	public void setExpandproblem(int expandproblem) {
		this.expandproblem = expandproblem;
	}

	public int getMarkelements() {
		return this.markelements;
	}

	public void setMarkelements(int markelements) {
		this.markelements = markelements;
	}

	public int getShowUnack() {
		return this.showUnack;
	}

	public void setShowUnack(int showUnack) {
		this.showUnack = showUnack;
	}

	public int getGridSize() {
		return this.gridSize;
	}

	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
	}

	public int getGridShow() {
		return this.gridShow;
	}

	public void setGridShow(int gridShow) {
		this.gridShow = gridShow;
	}

	public int getGridAlign() {
		return this.gridAlign;
	}

	public void setGridAlign(int gridAlign) {
		this.gridAlign = gridAlign;
	}

	public int getLabelFormat() {
		return this.labelFormat;
	}

	public void setLabelFormat(int labelFormat) {
		this.labelFormat = labelFormat;
	}

	public int getLabelTypeHost() {
		return this.labelTypeHost;
	}

	public void setLabelTypeHost(int labelTypeHost) {
		this.labelTypeHost = labelTypeHost;
	}

	public int getLabelTypeHostgroup() {
		return this.labelTypeHostgroup;
	}

	public void setLabelTypeHostgroup(int labelTypeHostgroup) {
		this.labelTypeHostgroup = labelTypeHostgroup;
	}

	public int getLabelTypeTrigger() {
		return this.labelTypeTrigger;
	}

	public void setLabelTypeTrigger(int labelTypeTrigger) {
		this.labelTypeTrigger = labelTypeTrigger;
	}

	public int getLabelTypeMap() {
		return this.labelTypeMap;
	}

	public void setLabelTypeMap(int labelTypeMap) {
		this.labelTypeMap = labelTypeMap;
	}

	public int getLabelTypeImage() {
		return this.labelTypeImage;
	}

	public void setLabelTypeImage(int labelTypeImage) {
		this.labelTypeImage = labelTypeImage;
	}

	public String getLabelStringHost() {
		return this.labelStringHost;
	}

	public void setLabelStringHost(String labelStringHost) {
		this.labelStringHost = labelStringHost;
	}

	public String getLabelStringHostgroup() {
		return this.labelStringHostgroup;
	}

	public void setLabelStringHostgroup(String labelStringHostgroup) {
		this.labelStringHostgroup = labelStringHostgroup;
	}

	public String getLabelStringTrigger() {
		return this.labelStringTrigger;
	}

	public void setLabelStringTrigger(String labelStringTrigger) {
		this.labelStringTrigger = labelStringTrigger;
	}

	public String getLabelStringMap() {
		return this.labelStringMap;
	}

	public void setLabelStringMap(String labelStringMap) {
		this.labelStringMap = labelStringMap;
	}

	public String getLabelStringImage() {
		return this.labelStringImage;
	}

	public void setLabelStringImage(String labelStringImage) {
		this.labelStringImage = labelStringImage;
	}

	public int getExpandMacros() {
		return this.expandMacros;
	}

	public void setExpandMacros(int expandMacros) {
		this.expandMacros = expandMacros;
	}

	public int getSeverityMin() {
		return this.severityMin;
	}

	public void setSeverityMin(int severityMin) {
		this.severityMin = severityMin;
	}

	public int getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(int private_) {
		this.private_ = private_;
	}

	public Set getSysmapsElementses() {
		return this.sysmapsElementses;
	}

	public void setSysmapsElementses(Set sysmapsElementses) {
		this.sysmapsElementses = sysmapsElementses;
	}

	public Set getSysmapUsrgrps() {
		return this.sysmapUsrgrps;
	}

	public void setSysmapUsrgrps(Set sysmapUsrgrps) {
		this.sysmapUsrgrps = sysmapUsrgrps;
	}

	public Set getSysmapUrls() {
		return this.sysmapUrls;
	}

	public void setSysmapUrls(Set sysmapUrls) {
		this.sysmapUrls = sysmapUrls;
	}

	public Set getSysmapUsers() {
		return this.sysmapUsers;
	}

	public void setSysmapUsers(Set sysmapUsers) {
		this.sysmapUsers = sysmapUsers;
	}

	public Set getSysmapsLinkses() {
		return this.sysmapsLinkses;
	}

	public void setSysmapsLinkses(Set sysmapsLinkses) {
		this.sysmapsLinkses = sysmapsLinkses;
	}

}
