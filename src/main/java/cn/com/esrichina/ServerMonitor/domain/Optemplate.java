package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * Optemplate generated by hbm2java
 */
public class Optemplate implements java.io.Serializable {

	private long optemplateid;
	private Operations operations;
	private Hosts hosts;

	public Optemplate() {
	}

	public Optemplate(long optemplateid, Operations operations, Hosts hosts) {
		this.optemplateid = optemplateid;
		this.operations = operations;
		this.hosts = hosts;
	}

	public long getOptemplateid() {
		return this.optemplateid;
	}

	public void setOptemplateid(long optemplateid) {
		this.optemplateid = optemplateid;
	}

	public Operations getOperations() {
		return this.operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

}
