package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * GraphDiscovery generated by hbm2java
 */
public class GraphDiscovery implements java.io.Serializable {

	private long graphid;
	private Graphs graphsByParentGraphid;
	private Graphs graphsByGraphid;

	public GraphDiscovery() {
	}

	public GraphDiscovery(Graphs graphsByParentGraphid, Graphs graphsByGraphid) {
		this.graphsByParentGraphid = graphsByParentGraphid;
		this.graphsByGraphid = graphsByGraphid;
	}

	public long getGraphid() {
		return this.graphid;
	}

	public void setGraphid(long graphid) {
		this.graphid = graphid;
	}

	public Graphs getGraphsByParentGraphid() {
		return this.graphsByParentGraphid;
	}

	public void setGraphsByParentGraphid(Graphs graphsByParentGraphid) {
		this.graphsByParentGraphid = graphsByParentGraphid;
	}

	public Graphs getGraphsByGraphid() {
		return this.graphsByGraphid;
	}

	public void setGraphsByGraphid(Graphs graphsByGraphid) {
		this.graphsByGraphid = graphsByGraphid;
	}

}