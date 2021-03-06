package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * TrendsId generated by hbm2java
 */
public class TrendsId implements java.io.Serializable {

	private long itemid;
	private int clock;

	public TrendsId() {
	}

	public TrendsId(long itemid, int clock) {
		this.itemid = itemid;
		this.clock = clock;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrendsId))
			return false;
		TrendsId castOther = (TrendsId) other;

		return (this.getItemid() == castOther.getItemid())
				&& (this.getClock() == castOther.getClock());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemid();
		result = 37 * result + this.getClock();
		return result;
	}

}
