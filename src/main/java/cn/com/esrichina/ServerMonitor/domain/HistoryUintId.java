package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * HistoryUintId generated by hbm2java
 */
public class HistoryUintId implements java.io.Serializable {

	private long itemid;
	private int clock;
	private long value;
	private int ns;

	public HistoryUintId() {
	}

	public HistoryUintId(long itemid, int clock, long value, int ns) {
		this.itemid = itemid;
		this.clock = clock;
		this.value = value;
		this.ns = ns;
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

	public long getValue() {
		return this.value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public int getNs() {
		return this.ns;
	}

	public void setNs(int ns) {
		this.ns = ns;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HistoryUintId))
			return false;
		HistoryUintId castOther = (HistoryUintId) other;

		return (this.getItemid() == castOther.getItemid())
				&& (this.getClock() == castOther.getClock())
				&& (this.getValue() == castOther.getValue())
				&& (this.getNs() == castOther.getNs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemid();
		result = 37 * result + this.getClock();
		result = 37 * result + (int) this.getValue();
		result = 37 * result + this.getNs();
		return result;
	}

}