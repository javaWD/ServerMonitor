package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Graphs generated by hbm2java
 */
public class Graphs implements java.io.Serializable {

	private long graphid;
	private Graphs graphs;
	private Items itemsByYmaxItemid;
	private Items itemsByYminItemid;
	private String name;
	private int width;
	private int height;
	private double yaxismin;
	private double yaxismax;
	private int showWorkPeriod;
	private int showTriggers;
	private int graphtype;
	private int showLegend;
	private int show3d;
	private double percentLeft;
	private double percentRight;
	private int yminType;
	private int ymaxType;
	private int flags;
	private Set graphDiscoveriesForParentGraphid = new HashSet(0);
	private GraphDiscovery graphDiscoveryByGraphid;
	private Set graphsItemses = new HashSet(0);
	private Set graphses = new HashSet(0);

	public Graphs() {
	}

	public Graphs(long graphid, String name, int width, int height,
			double yaxismin, double yaxismax, int showWorkPeriod,
			int showTriggers, int graphtype, int showLegend, int show3d,
			double percentLeft, double percentRight, int yminType,
			int ymaxType, int flags) {
		this.graphid = graphid;
		this.name = name;
		this.width = width;
		this.height = height;
		this.yaxismin = yaxismin;
		this.yaxismax = yaxismax;
		this.showWorkPeriod = showWorkPeriod;
		this.showTriggers = showTriggers;
		this.graphtype = graphtype;
		this.showLegend = showLegend;
		this.show3d = show3d;
		this.percentLeft = percentLeft;
		this.percentRight = percentRight;
		this.yminType = yminType;
		this.ymaxType = ymaxType;
		this.flags = flags;
	}

	public Graphs(long graphid, Graphs graphs, Items itemsByYmaxItemid,
			Items itemsByYminItemid, String name, int width, int height,
			double yaxismin, double yaxismax, int showWorkPeriod,
			int showTriggers, int graphtype, int showLegend, int show3d,
			double percentLeft, double percentRight, int yminType,
			int ymaxType, int flags, Set graphDiscoveriesForParentGraphid,
			GraphDiscovery graphDiscoveryByGraphid, Set graphsItemses,
			Set graphses) {
		this.graphid = graphid;
		this.graphs = graphs;
		this.itemsByYmaxItemid = itemsByYmaxItemid;
		this.itemsByYminItemid = itemsByYminItemid;
		this.name = name;
		this.width = width;
		this.height = height;
		this.yaxismin = yaxismin;
		this.yaxismax = yaxismax;
		this.showWorkPeriod = showWorkPeriod;
		this.showTriggers = showTriggers;
		this.graphtype = graphtype;
		this.showLegend = showLegend;
		this.show3d = show3d;
		this.percentLeft = percentLeft;
		this.percentRight = percentRight;
		this.yminType = yminType;
		this.ymaxType = ymaxType;
		this.flags = flags;
		this.graphDiscoveriesForParentGraphid = graphDiscoveriesForParentGraphid;
		this.graphDiscoveryByGraphid = graphDiscoveryByGraphid;
		this.graphsItemses = graphsItemses;
		this.graphses = graphses;
	}

	public long getGraphid() {
		return this.graphid;
	}

	public void setGraphid(long graphid) {
		this.graphid = graphid;
	}

	public Graphs getGraphs() {
		return this.graphs;
	}

	public void setGraphs(Graphs graphs) {
		this.graphs = graphs;
	}

	public Items getItemsByYmaxItemid() {
		return this.itemsByYmaxItemid;
	}

	public void setItemsByYmaxItemid(Items itemsByYmaxItemid) {
		this.itemsByYmaxItemid = itemsByYmaxItemid;
	}

	public Items getItemsByYminItemid() {
		return this.itemsByYminItemid;
	}

	public void setItemsByYminItemid(Items itemsByYminItemid) {
		this.itemsByYminItemid = itemsByYminItemid;
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

	public double getYaxismin() {
		return this.yaxismin;
	}

	public void setYaxismin(double yaxismin) {
		this.yaxismin = yaxismin;
	}

	public double getYaxismax() {
		return this.yaxismax;
	}

	public void setYaxismax(double yaxismax) {
		this.yaxismax = yaxismax;
	}

	public int getShowWorkPeriod() {
		return this.showWorkPeriod;
	}

	public void setShowWorkPeriod(int showWorkPeriod) {
		this.showWorkPeriod = showWorkPeriod;
	}

	public int getShowTriggers() {
		return this.showTriggers;
	}

	public void setShowTriggers(int showTriggers) {
		this.showTriggers = showTriggers;
	}

	public int getGraphtype() {
		return this.graphtype;
	}

	public void setGraphtype(int graphtype) {
		this.graphtype = graphtype;
	}

	public int getShowLegend() {
		return this.showLegend;
	}

	public void setShowLegend(int showLegend) {
		this.showLegend = showLegend;
	}

	public int getShow3d() {
		return this.show3d;
	}

	public void setShow3d(int show3d) {
		this.show3d = show3d;
	}

	public double getPercentLeft() {
		return this.percentLeft;
	}

	public void setPercentLeft(double percentLeft) {
		this.percentLeft = percentLeft;
	}

	public double getPercentRight() {
		return this.percentRight;
	}

	public void setPercentRight(double percentRight) {
		this.percentRight = percentRight;
	}

	public int getYminType() {
		return this.yminType;
	}

	public void setYminType(int yminType) {
		this.yminType = yminType;
	}

	public int getYmaxType() {
		return this.ymaxType;
	}

	public void setYmaxType(int ymaxType) {
		this.ymaxType = ymaxType;
	}

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public Set getGraphDiscoveriesForParentGraphid() {
		return this.graphDiscoveriesForParentGraphid;
	}

	public void setGraphDiscoveriesForParentGraphid(
			Set graphDiscoveriesForParentGraphid) {
		this.graphDiscoveriesForParentGraphid = graphDiscoveriesForParentGraphid;
	}

	public GraphDiscovery getGraphDiscoveryByGraphid() {
		return this.graphDiscoveryByGraphid;
	}

	public void setGraphDiscoveryByGraphid(
			GraphDiscovery graphDiscoveryByGraphid) {
		this.graphDiscoveryByGraphid = graphDiscoveryByGraphid;
	}

	public Set getGraphsItemses() {
		return this.graphsItemses;
	}

	public void setGraphsItemses(Set graphsItemses) {
		this.graphsItemses = graphsItemses;
	}

	public Set getGraphses() {
		return this.graphses;
	}

	public void setGraphses(Set graphses) {
		this.graphses = graphses;
	}

}
