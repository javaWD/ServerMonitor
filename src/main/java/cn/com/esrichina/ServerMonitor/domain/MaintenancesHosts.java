package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * MaintenancesHosts generated by hbm2java
 */
public class MaintenancesHosts implements java.io.Serializable {

	private long maintenanceHostid;
	private Hosts hosts;
	private Maintenances maintenances;

	public MaintenancesHosts() {
	}

	public MaintenancesHosts(long maintenanceHostid, Hosts hosts,
			Maintenances maintenances) {
		this.maintenanceHostid = maintenanceHostid;
		this.hosts = hosts;
		this.maintenances = maintenances;
	}

	public long getMaintenanceHostid() {
		return this.maintenanceHostid;
	}

	public void setMaintenanceHostid(long maintenanceHostid) {
		this.maintenanceHostid = maintenanceHostid;
	}

	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	public Maintenances getMaintenances() {
		return this.maintenances;
	}

	public void setMaintenances(Maintenances maintenances) {
		this.maintenances = maintenances;
	}

}
