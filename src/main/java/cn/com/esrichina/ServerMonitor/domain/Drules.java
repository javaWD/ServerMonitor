package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Drules generated by hbm2java
 */
public class Drules implements java.io.Serializable {

	private long druleid;
	private Hosts hosts;
	private String name;
	private String iprange;
	private int delay;
	private int nextcheck;
	private int status;
	private Set dhostses = new HashSet(0);
	private Set dcheckses = new HashSet(0);

	public Drules() {
	}

	public Drules(long druleid, String name, String iprange, int delay,
			int nextcheck, int status) {
		this.druleid = druleid;
		this.name = name;
		this.iprange = iprange;
		this.delay = delay;
		this.nextcheck = nextcheck;
		this.status = status;
	}

	public Drules(long druleid, Hosts hosts, String name, String iprange,
			int delay, int nextcheck, int status, Set dhostses, Set dcheckses) {
		this.druleid = druleid;
		this.hosts = hosts;
		this.name = name;
		this.iprange = iprange;
		this.delay = delay;
		this.nextcheck = nextcheck;
		this.status = status;
		this.dhostses = dhostses;
		this.dcheckses = dcheckses;
	}

	public long getDruleid() {
		return this.druleid;
	}

	public void setDruleid(long druleid) {
		this.druleid = druleid;
	}

	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIprange() {
		return this.iprange;
	}

	public void setIprange(String iprange) {
		this.iprange = iprange;
	}

	public int getDelay() {
		return this.delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getNextcheck() {
		return this.nextcheck;
	}

	public void setNextcheck(int nextcheck) {
		this.nextcheck = nextcheck;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set getDhostses() {
		return this.dhostses;
	}

	public void setDhostses(Set dhostses) {
		this.dhostses = dhostses;
	}

	public Set getDcheckses() {
		return this.dcheckses;
	}

	public void setDcheckses(Set dcheckses) {
		this.dcheckses = dcheckses;
	}

}
