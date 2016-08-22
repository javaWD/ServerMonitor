package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * ScreensItems generated by hbm2java
 */
public class ScreensItems implements java.io.Serializable {

	private long screenitemid;
	private Screens screens;
	private int resourcetype;
	private long resourceid;
	private int width;
	private int height;
	private int x;
	private int y;
	private int colspan;
	private int rowspan;
	private int elements;
	private int valign;
	private int halign;
	private int style;
	private String url;
	private int dynamic;
	private int sortTriggers;
	private String application;
	private int maxColumns;

	public ScreensItems() {
	}

	public ScreensItems(long screenitemid, Screens screens, int resourcetype,
			long resourceid, int width, int height, int x, int y, int colspan,
			int rowspan, int elements, int valign, int halign, int style,
			String url, int dynamic, int sortTriggers, String application,
			int maxColumns) {
		this.screenitemid = screenitemid;
		this.screens = screens;
		this.resourcetype = resourcetype;
		this.resourceid = resourceid;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.colspan = colspan;
		this.rowspan = rowspan;
		this.elements = elements;
		this.valign = valign;
		this.halign = halign;
		this.style = style;
		this.url = url;
		this.dynamic = dynamic;
		this.sortTriggers = sortTriggers;
		this.application = application;
		this.maxColumns = maxColumns;
	}

	public long getScreenitemid() {
		return this.screenitemid;
	}

	public void setScreenitemid(long screenitemid) {
		this.screenitemid = screenitemid;
	}

	public Screens getScreens() {
		return this.screens;
	}

	public void setScreens(Screens screens) {
		this.screens = screens;
	}

	public int getResourcetype() {
		return this.resourcetype;
	}

	public void setResourcetype(int resourcetype) {
		this.resourcetype = resourcetype;
	}

	public long getResourceid() {
		return this.resourceid;
	}

	public void setResourceid(long resourceid) {
		this.resourceid = resourceid;
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

	public int getColspan() {
		return this.colspan;
	}

	public void setColspan(int colspan) {
		this.colspan = colspan;
	}

	public int getRowspan() {
		return this.rowspan;
	}

	public void setRowspan(int rowspan) {
		this.rowspan = rowspan;
	}

	public int getElements() {
		return this.elements;
	}

	public void setElements(int elements) {
		this.elements = elements;
	}

	public int getValign() {
		return this.valign;
	}

	public void setValign(int valign) {
		this.valign = valign;
	}

	public int getHalign() {
		return this.halign;
	}

	public void setHalign(int halign) {
		this.halign = halign;
	}

	public int getStyle() {
		return this.style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getDynamic() {
		return this.dynamic;
	}

	public void setDynamic(int dynamic) {
		this.dynamic = dynamic;
	}

	public int getSortTriggers() {
		return this.sortTriggers;
	}

	public void setSortTriggers(int sortTriggers) {
		this.sortTriggers = sortTriggers;
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public int getMaxColumns() {
		return this.maxColumns;
	}

	public void setMaxColumns(int maxColumns) {
		this.maxColumns = maxColumns;
	}

}