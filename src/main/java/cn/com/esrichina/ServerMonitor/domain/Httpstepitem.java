package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * Httpstepitem generated by hbm2java
 */
public class Httpstepitem implements java.io.Serializable {

	private long httpstepitemid;
	private Items items;
	private Httpstep httpstep;
	private int type;

	public Httpstepitem() {
	}

	public Httpstepitem(long httpstepitemid, Items items, Httpstep httpstep,
			int type) {
		this.httpstepitemid = httpstepitemid;
		this.items = items;
		this.httpstep = httpstep;
		this.type = type;
	}

	public long getHttpstepitemid() {
		return this.httpstepitemid;
	}

	public void setHttpstepitemid(long httpstepitemid) {
		this.httpstepitemid = httpstepitemid;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Httpstep getHttpstep() {
		return this.httpstep;
	}

	public void setHttpstep(Httpstep httpstep) {
		this.httpstep = httpstep;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
