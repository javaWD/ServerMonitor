package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * GroupPrototype generated by hbm2java
 */
public class GroupPrototype implements java.io.Serializable {

	private long groupPrototypeid;
	private GroupPrototype groupPrototype;
	private Hosts hosts;
	private Groups groups;
	private String name;
	private Set groupPrototypes = new HashSet(0);
	private Set groupDiscoveries = new HashSet(0);

	public GroupPrototype() {
	}

	public GroupPrototype(long groupPrototypeid, Hosts hosts, String name) {
		this.groupPrototypeid = groupPrototypeid;
		this.hosts = hosts;
		this.name = name;
	}

	public GroupPrototype(long groupPrototypeid, GroupPrototype groupPrototype,
			Hosts hosts, Groups groups, String name, Set groupPrototypes,
			Set groupDiscoveries) {
		this.groupPrototypeid = groupPrototypeid;
		this.groupPrototype = groupPrototype;
		this.hosts = hosts;
		this.groups = groups;
		this.name = name;
		this.groupPrototypes = groupPrototypes;
		this.groupDiscoveries = groupDiscoveries;
	}

	public long getGroupPrototypeid() {
		return this.groupPrototypeid;
	}

	public void setGroupPrototypeid(long groupPrototypeid) {
		this.groupPrototypeid = groupPrototypeid;
	}

	public GroupPrototype getGroupPrototype() {
		return this.groupPrototype;
	}

	public void setGroupPrototype(GroupPrototype groupPrototype) {
		this.groupPrototype = groupPrototype;
	}

	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getGroupPrototypes() {
		return this.groupPrototypes;
	}

	public void setGroupPrototypes(Set groupPrototypes) {
		this.groupPrototypes = groupPrototypes;
	}

	public Set getGroupDiscoveries() {
		return this.groupDiscoveries;
	}

	public void setGroupDiscoveries(Set groupDiscoveries) {
		this.groupDiscoveries = groupDiscoveries;
	}

}
