package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * HostsTemplates generated by hbm2java
 */
public class HostsTemplates implements java.io.Serializable {

	private long hosttemplateid;
	private Hosts hostsByHostid;
	private Hosts hostsByTemplateid;

	public HostsTemplates() {
	}

	public HostsTemplates(long hosttemplateid, Hosts hostsByHostid,
			Hosts hostsByTemplateid) {
		this.hosttemplateid = hosttemplateid;
		this.hostsByHostid = hostsByHostid;
		this.hostsByTemplateid = hostsByTemplateid;
	}

	public long getHosttemplateid() {
		return this.hosttemplateid;
	}

	public void setHosttemplateid(long hosttemplateid) {
		this.hosttemplateid = hosttemplateid;
	}

	public Hosts getHostsByHostid() {
		return this.hostsByHostid;
	}

	public void setHostsByHostid(Hosts hostsByHostid) {
		this.hostsByHostid = hostsByHostid;
	}

	public Hosts getHostsByTemplateid() {
		return this.hostsByTemplateid;
	}

	public void setHostsByTemplateid(Hosts hostsByTemplateid) {
		this.hostsByTemplateid = hostsByTemplateid;
	}

}
