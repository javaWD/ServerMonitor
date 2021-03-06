package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Screens generated by hbm2java
 */
public class Screens implements java.io.Serializable {

	private long screenid;
	private Hosts hosts;
	private Users users;
	private String name;
	private int hsize;
	private int vsize;
	private int private_;
	private Set screenUsers = new HashSet(0);
	private Set slideses = new HashSet(0);
	private Set screenUsrgrps = new HashSet(0);
	private Set screensItemses = new HashSet(0);

	public Screens() {
	}

	public Screens(long screenid, String name, int hsize, int vsize,
			int private_) {
		this.screenid = screenid;
		this.name = name;
		this.hsize = hsize;
		this.vsize = vsize;
		this.private_ = private_;
	}

	public Screens(long screenid, Hosts hosts, Users users, String name,
			int hsize, int vsize, int private_, Set screenUsers, Set slideses,
			Set screenUsrgrps, Set screensItemses) {
		this.screenid = screenid;
		this.hosts = hosts;
		this.users = users;
		this.name = name;
		this.hsize = hsize;
		this.vsize = vsize;
		this.private_ = private_;
		this.screenUsers = screenUsers;
		this.slideses = slideses;
		this.screenUsrgrps = screenUsrgrps;
		this.screensItemses = screensItemses;
	}

	public long getScreenid() {
		return this.screenid;
	}

	public void setScreenid(long screenid) {
		this.screenid = screenid;
	}

	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHsize() {
		return this.hsize;
	}

	public void setHsize(int hsize) {
		this.hsize = hsize;
	}

	public int getVsize() {
		return this.vsize;
	}

	public void setVsize(int vsize) {
		this.vsize = vsize;
	}

	public int getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(int private_) {
		this.private_ = private_;
	}

	public Set getScreenUsers() {
		return this.screenUsers;
	}

	public void setScreenUsers(Set screenUsers) {
		this.screenUsers = screenUsers;
	}

	public Set getSlideses() {
		return this.slideses;
	}

	public void setSlideses(Set slideses) {
		this.slideses = slideses;
	}

	public Set getScreenUsrgrps() {
		return this.screenUsrgrps;
	}

	public void setScreenUsrgrps(Set screenUsrgrps) {
		this.screenUsrgrps = screenUsrgrps;
	}

	public Set getScreensItemses() {
		return this.screensItemses;
	}

	public void setScreensItemses(Set screensItemses) {
		this.screensItemses = screensItemses;
	}

}
