package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * HistoryText generated by hbm2java
 */
public class HistoryText implements java.io.Serializable {

	private long id;
	private long itemid;
	private int clock;
	private String value;
	private int ns;

	public HistoryText() {
	}

	public HistoryText(long id, long itemid, int clock, String value, int ns) {
		this.id = id;
		this.itemid = itemid;
		this.clock = clock;
		this.value = value;
		this.ns = ns;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItemid() {
		return this.itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNs() {
		return this.ns;
	}

	public void setNs(int ns) {
		this.ns = ns;
	}

}