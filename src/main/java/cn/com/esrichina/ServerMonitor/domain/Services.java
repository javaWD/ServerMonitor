package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Services generated by hbm2java
 */
public class Services implements java.io.Serializable {

	private long serviceid;
	private Triggers triggers;
	private String name;
	private int status;
	private int algorithm;
	private int showsla;
	private double goodsla;
	private int sortorder;
	private Set servicesLinksesForServicedownid = new HashSet(0);
	private Set servicesLinksesForServiceupid = new HashSet(0);
	private Set serviceAlarmses = new HashSet(0);
	private Set servicesTimeses = new HashSet(0);

	public Services() {
	}

	public Services(long serviceid, String name, int status, int algorithm,
			int showsla, double goodsla, int sortorder) {
		this.serviceid = serviceid;
		this.name = name;
		this.status = status;
		this.algorithm = algorithm;
		this.showsla = showsla;
		this.goodsla = goodsla;
		this.sortorder = sortorder;
	}

	public Services(long serviceid, Triggers triggers, String name, int status,
			int algorithm, int showsla, double goodsla, int sortorder,
			Set servicesLinksesForServicedownid,
			Set servicesLinksesForServiceupid, Set serviceAlarmses,
			Set servicesTimeses) {
		this.serviceid = serviceid;
		this.triggers = triggers;
		this.name = name;
		this.status = status;
		this.algorithm = algorithm;
		this.showsla = showsla;
		this.goodsla = goodsla;
		this.sortorder = sortorder;
		this.servicesLinksesForServicedownid = servicesLinksesForServicedownid;
		this.servicesLinksesForServiceupid = servicesLinksesForServiceupid;
		this.serviceAlarmses = serviceAlarmses;
		this.servicesTimeses = servicesTimeses;
	}

	public long getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(long serviceid) {
		this.serviceid = serviceid;
	}

	public Triggers getTriggers() {
		return this.triggers;
	}

	public void setTriggers(Triggers triggers) {
		this.triggers = triggers;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(int algorithm) {
		this.algorithm = algorithm;
	}

	public int getShowsla() {
		return this.showsla;
	}

	public void setShowsla(int showsla) {
		this.showsla = showsla;
	}

	public double getGoodsla() {
		return this.goodsla;
	}

	public void setGoodsla(double goodsla) {
		this.goodsla = goodsla;
	}

	public int getSortorder() {
		return this.sortorder;
	}

	public void setSortorder(int sortorder) {
		this.sortorder = sortorder;
	}

	public Set getServicesLinksesForServicedownid() {
		return this.servicesLinksesForServicedownid;
	}

	public void setServicesLinksesForServicedownid(
			Set servicesLinksesForServicedownid) {
		this.servicesLinksesForServicedownid = servicesLinksesForServicedownid;
	}

	public Set getServicesLinksesForServiceupid() {
		return this.servicesLinksesForServiceupid;
	}

	public void setServicesLinksesForServiceupid(
			Set servicesLinksesForServiceupid) {
		this.servicesLinksesForServiceupid = servicesLinksesForServiceupid;
	}

	public Set getServiceAlarmses() {
		return this.serviceAlarmses;
	}

	public void setServiceAlarmses(Set serviceAlarmses) {
		this.serviceAlarmses = serviceAlarmses;
	}

	public Set getServicesTimeses() {
		return this.servicesTimeses;
	}

	public void setServicesTimeses(Set servicesTimeses) {
		this.servicesTimeses = servicesTimeses;
	}

}
