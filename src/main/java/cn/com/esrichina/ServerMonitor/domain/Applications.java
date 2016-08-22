package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Applications generated by hbm2java
 */
public class Applications implements java.io.Serializable {

	private long applicationid;
	private Hosts hosts;
	private String name;
	private int flags;
	private Set applicationTemplatesForApplicationid = new HashSet(0);
	private Set applicationDiscoveries = new HashSet(0);
	private Set httptests = new HashSet(0);
	private Set applicationTemplatesForTemplateid = new HashSet(0);
	private Set itemsApplicationses = new HashSet(0);

	public Applications() {
	}

	public Applications(long applicationid, Hosts hosts, String name, int flags) {
		this.applicationid = applicationid;
		this.hosts = hosts;
		this.name = name;
		this.flags = flags;
	}

	public Applications(long applicationid, Hosts hosts, String name,
			int flags, Set applicationTemplatesForApplicationid,
			Set applicationDiscoveries, Set httptests,
			Set applicationTemplatesForTemplateid, Set itemsApplicationses) {
		this.applicationid = applicationid;
		this.hosts = hosts;
		this.name = name;
		this.flags = flags;
		this.applicationTemplatesForApplicationid = applicationTemplatesForApplicationid;
		this.applicationDiscoveries = applicationDiscoveries;
		this.httptests = httptests;
		this.applicationTemplatesForTemplateid = applicationTemplatesForTemplateid;
		this.itemsApplicationses = itemsApplicationses;
	}

	public long getApplicationid() {
		return this.applicationid;
	}

	public void setApplicationid(long applicationid) {
		this.applicationid = applicationid;
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

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public Set getApplicationTemplatesForApplicationid() {
		return this.applicationTemplatesForApplicationid;
	}

	public void setApplicationTemplatesForApplicationid(
			Set applicationTemplatesForApplicationid) {
		this.applicationTemplatesForApplicationid = applicationTemplatesForApplicationid;
	}

	public Set getApplicationDiscoveries() {
		return this.applicationDiscoveries;
	}

	public void setApplicationDiscoveries(Set applicationDiscoveries) {
		this.applicationDiscoveries = applicationDiscoveries;
	}

	public Set getHttptests() {
		return this.httptests;
	}

	public void setHttptests(Set httptests) {
		this.httptests = httptests;
	}

	public Set getApplicationTemplatesForTemplateid() {
		return this.applicationTemplatesForTemplateid;
	}

	public void setApplicationTemplatesForTemplateid(
			Set applicationTemplatesForTemplateid) {
		this.applicationTemplatesForTemplateid = applicationTemplatesForTemplateid;
	}

	public Set getItemsApplicationses() {
		return this.itemsApplicationses;
	}

	public void setItemsApplicationses(Set itemsApplicationses) {
		this.itemsApplicationses = itemsApplicationses;
	}

}