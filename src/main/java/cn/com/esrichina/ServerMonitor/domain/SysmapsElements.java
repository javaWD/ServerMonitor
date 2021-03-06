package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * SysmapsElements generated by hbm2java
 */
public class SysmapsElements implements java.io.Serializable {

	private long selementid;
	private Images imagesByIconidOn;
	private Images imagesByIconidMaintenance;
	private Sysmaps sysmaps;
	private Images imagesByIconidDisabled;
	private Images imagesByIconidOff;
	private long elementid;
	private int elementtype;
	private String label;
	private int labelLocation;
	private int x;
	private int y;
	private int elementsubtype;
	private int areatype;
	private int width;
	private int height;
	private int viewtype;
	private int useIconmap;
	private String application;
	private Set sysmapElementUrls = new HashSet(0);
	private Set sysmapsLinksesForSelementid2 = new HashSet(0);
	private Set sysmapsLinksesForSelementid1 = new HashSet(0);

	public SysmapsElements() {
	}

	public SysmapsElements(long selementid, Sysmaps sysmaps, long elementid,
			int elementtype, String label, int labelLocation, int x, int y,
			int elementsubtype, int areatype, int width, int height,
			int viewtype, int useIconmap, String application) {
		this.selementid = selementid;
		this.sysmaps = sysmaps;
		this.elementid = elementid;
		this.elementtype = elementtype;
		this.label = label;
		this.labelLocation = labelLocation;
		this.x = x;
		this.y = y;
		this.elementsubtype = elementsubtype;
		this.areatype = areatype;
		this.width = width;
		this.height = height;
		this.viewtype = viewtype;
		this.useIconmap = useIconmap;
		this.application = application;
	}

	public SysmapsElements(long selementid, Images imagesByIconidOn,
			Images imagesByIconidMaintenance, Sysmaps sysmaps,
			Images imagesByIconidDisabled, Images imagesByIconidOff,
			long elementid, int elementtype, String label, int labelLocation,
			int x, int y, int elementsubtype, int areatype, int width,
			int height, int viewtype, int useIconmap, String application,
			Set sysmapElementUrls, Set sysmapsLinksesForSelementid2,
			Set sysmapsLinksesForSelementid1) {
		this.selementid = selementid;
		this.imagesByIconidOn = imagesByIconidOn;
		this.imagesByIconidMaintenance = imagesByIconidMaintenance;
		this.sysmaps = sysmaps;
		this.imagesByIconidDisabled = imagesByIconidDisabled;
		this.imagesByIconidOff = imagesByIconidOff;
		this.elementid = elementid;
		this.elementtype = elementtype;
		this.label = label;
		this.labelLocation = labelLocation;
		this.x = x;
		this.y = y;
		this.elementsubtype = elementsubtype;
		this.areatype = areatype;
		this.width = width;
		this.height = height;
		this.viewtype = viewtype;
		this.useIconmap = useIconmap;
		this.application = application;
		this.sysmapElementUrls = sysmapElementUrls;
		this.sysmapsLinksesForSelementid2 = sysmapsLinksesForSelementid2;
		this.sysmapsLinksesForSelementid1 = sysmapsLinksesForSelementid1;
	}

	public long getSelementid() {
		return this.selementid;
	}

	public void setSelementid(long selementid) {
		this.selementid = selementid;
	}

	public Images getImagesByIconidOn() {
		return this.imagesByIconidOn;
	}

	public void setImagesByIconidOn(Images imagesByIconidOn) {
		this.imagesByIconidOn = imagesByIconidOn;
	}

	public Images getImagesByIconidMaintenance() {
		return this.imagesByIconidMaintenance;
	}

	public void setImagesByIconidMaintenance(Images imagesByIconidMaintenance) {
		this.imagesByIconidMaintenance = imagesByIconidMaintenance;
	}

	public Sysmaps getSysmaps() {
		return this.sysmaps;
	}

	public void setSysmaps(Sysmaps sysmaps) {
		this.sysmaps = sysmaps;
	}

	public Images getImagesByIconidDisabled() {
		return this.imagesByIconidDisabled;
	}

	public void setImagesByIconidDisabled(Images imagesByIconidDisabled) {
		this.imagesByIconidDisabled = imagesByIconidDisabled;
	}

	public Images getImagesByIconidOff() {
		return this.imagesByIconidOff;
	}

	public void setImagesByIconidOff(Images imagesByIconidOff) {
		this.imagesByIconidOff = imagesByIconidOff;
	}

	public long getElementid() {
		return this.elementid;
	}

	public void setElementid(long elementid) {
		this.elementid = elementid;
	}

	public int getElementtype() {
		return this.elementtype;
	}

	public void setElementtype(int elementtype) {
		this.elementtype = elementtype;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getLabelLocation() {
		return this.labelLocation;
	}

	public void setLabelLocation(int labelLocation) {
		this.labelLocation = labelLocation;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getElementsubtype() {
		return this.elementsubtype;
	}

	public void setElementsubtype(int elementsubtype) {
		this.elementsubtype = elementsubtype;
	}

	public int getAreatype() {
		return this.areatype;
	}

	public void setAreatype(int areatype) {
		this.areatype = areatype;
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

	public int getViewtype() {
		return this.viewtype;
	}

	public void setViewtype(int viewtype) {
		this.viewtype = viewtype;
	}

	public int getUseIconmap() {
		return this.useIconmap;
	}

	public void setUseIconmap(int useIconmap) {
		this.useIconmap = useIconmap;
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Set getSysmapElementUrls() {
		return this.sysmapElementUrls;
	}

	public void setSysmapElementUrls(Set sysmapElementUrls) {
		this.sysmapElementUrls = sysmapElementUrls;
	}

	public Set getSysmapsLinksesForSelementid2() {
		return this.sysmapsLinksesForSelementid2;
	}

	public void setSysmapsLinksesForSelementid2(Set sysmapsLinksesForSelementid2) {
		this.sysmapsLinksesForSelementid2 = sysmapsLinksesForSelementid2;
	}

	public Set getSysmapsLinksesForSelementid1() {
		return this.sysmapsLinksesForSelementid1;
	}

	public void setSysmapsLinksesForSelementid1(Set sysmapsLinksesForSelementid1) {
		this.sysmapsLinksesForSelementid1 = sysmapsLinksesForSelementid1;
	}

}
