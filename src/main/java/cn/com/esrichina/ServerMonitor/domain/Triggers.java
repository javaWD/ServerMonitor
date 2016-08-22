package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Triggers generated by hbm2java
 */
public class Triggers implements java.io.Serializable {

	private long triggerid;
	private Triggers triggers;
	private String expression;
	private String description;
	private String url;
	private int status;
	private int value;
	private int priority;
	private int lastchange;
	private String comments;
	private String error;
	private int type;
	private int state;
	private int flags;
	private Set triggerDependsesForTriggeridUp = new HashSet(0);
	private Set functionses = new HashSet(0);
	private Set triggerDependsesForTriggeridDown = new HashSet(0);
	private Set sysmapsLinkTriggerses = new HashSet(0);
	private Set triggerDiscoveriesForParentTriggerid = new HashSet(0);
	private TriggerDiscovery triggerDiscoveryByTriggerid;
	private Set triggerses = new HashSet(0);
	private Set serviceses = new HashSet(0);

	public Triggers() {
	}

	public Triggers(long triggerid, String expression, String description,
			String url, int status, int value, int priority, int lastchange,
			String comments, String error, int type, int state, int flags) {
		this.triggerid = triggerid;
		this.expression = expression;
		this.description = description;
		this.url = url;
		this.status = status;
		this.value = value;
		this.priority = priority;
		this.lastchange = lastchange;
		this.comments = comments;
		this.error = error;
		this.type = type;
		this.state = state;
		this.flags = flags;
	}

	public Triggers(long triggerid, Triggers triggers, String expression,
			String description, String url, int status, int value,
			int priority, int lastchange, String comments, String error,
			int type, int state, int flags, Set triggerDependsesForTriggeridUp,
			Set functionses, Set triggerDependsesForTriggeridDown,
			Set sysmapsLinkTriggerses,
			Set triggerDiscoveriesForParentTriggerid,
			TriggerDiscovery triggerDiscoveryByTriggerid, Set triggerses,
			Set serviceses) {
		this.triggerid = triggerid;
		this.triggers = triggers;
		this.expression = expression;
		this.description = description;
		this.url = url;
		this.status = status;
		this.value = value;
		this.priority = priority;
		this.lastchange = lastchange;
		this.comments = comments;
		this.error = error;
		this.type = type;
		this.state = state;
		this.flags = flags;
		this.triggerDependsesForTriggeridUp = triggerDependsesForTriggeridUp;
		this.functionses = functionses;
		this.triggerDependsesForTriggeridDown = triggerDependsesForTriggeridDown;
		this.sysmapsLinkTriggerses = sysmapsLinkTriggerses;
		this.triggerDiscoveriesForParentTriggerid = triggerDiscoveriesForParentTriggerid;
		this.triggerDiscoveryByTriggerid = triggerDiscoveryByTriggerid;
		this.triggerses = triggerses;
		this.serviceses = serviceses;
	}

	public long getTriggerid() {
		return this.triggerid;
	}

	public void setTriggerid(long triggerid) {
		this.triggerid = triggerid;
	}

	public Triggers getTriggers() {
		return this.triggers;
	}

	public void setTriggers(Triggers triggers) {
		this.triggers = triggers;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getLastchange() {
		return this.lastchange;
	}

	public void setLastchange(int lastchange) {
		this.lastchange = lastchange;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public Set getTriggerDependsesForTriggeridUp() {
		return this.triggerDependsesForTriggeridUp;
	}

	public void setTriggerDependsesForTriggeridUp(
			Set triggerDependsesForTriggeridUp) {
		this.triggerDependsesForTriggeridUp = triggerDependsesForTriggeridUp;
	}

	public Set getFunctionses() {
		return this.functionses;
	}

	public void setFunctionses(Set functionses) {
		this.functionses = functionses;
	}

	public Set getTriggerDependsesForTriggeridDown() {
		return this.triggerDependsesForTriggeridDown;
	}

	public void setTriggerDependsesForTriggeridDown(
			Set triggerDependsesForTriggeridDown) {
		this.triggerDependsesForTriggeridDown = triggerDependsesForTriggeridDown;
	}

	public Set getSysmapsLinkTriggerses() {
		return this.sysmapsLinkTriggerses;
	}

	public void setSysmapsLinkTriggerses(Set sysmapsLinkTriggerses) {
		this.sysmapsLinkTriggerses = sysmapsLinkTriggerses;
	}

	public Set getTriggerDiscoveriesForParentTriggerid() {
		return this.triggerDiscoveriesForParentTriggerid;
	}

	public void setTriggerDiscoveriesForParentTriggerid(
			Set triggerDiscoveriesForParentTriggerid) {
		this.triggerDiscoveriesForParentTriggerid = triggerDiscoveriesForParentTriggerid;
	}

	public TriggerDiscovery getTriggerDiscoveryByTriggerid() {
		return this.triggerDiscoveryByTriggerid;
	}

	public void setTriggerDiscoveryByTriggerid(
			TriggerDiscovery triggerDiscoveryByTriggerid) {
		this.triggerDiscoveryByTriggerid = triggerDiscoveryByTriggerid;
	}

	public Set getTriggerses() {
		return this.triggerses;
	}

	public void setTriggerses(Set triggerses) {
		this.triggerses = triggerses;
	}

	public Set getServiceses() {
		return this.serviceses;
	}

	public void setServiceses(Set serviceses) {
		this.serviceses = serviceses;
	}

}