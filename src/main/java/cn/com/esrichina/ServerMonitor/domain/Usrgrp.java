package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Usrgrp generated by hbm2java
 */
public class Usrgrp implements java.io.Serializable {

	private long usrgrpid;
	private String name;
	private int guiAccess;
	private int usersStatus;
	private int debugMode;
	private Set opmessageGrps = new HashSet(0);
	private Set slideshowUsrgrps = new HashSet(0);
	private Set usersGroupses = new HashSet(0);
	private Set rightses = new HashSet(0);
	private Set scriptses = new HashSet(0);
	private Set configs = new HashSet(0);
	private Set sysmapUsrgrps = new HashSet(0);
	private Set screenUsrgrps = new HashSet(0);

	public Usrgrp() {
	}

	public Usrgrp(long usrgrpid, String name, int guiAccess, int usersStatus,
			int debugMode) {
		this.usrgrpid = usrgrpid;
		this.name = name;
		this.guiAccess = guiAccess;
		this.usersStatus = usersStatus;
		this.debugMode = debugMode;
	}

	public Usrgrp(long usrgrpid, String name, int guiAccess, int usersStatus,
			int debugMode, Set opmessageGrps, Set slideshowUsrgrps,
			Set usersGroupses, Set rightses, Set scriptses, Set configs,
			Set sysmapUsrgrps, Set screenUsrgrps) {
		this.usrgrpid = usrgrpid;
		this.name = name;
		this.guiAccess = guiAccess;
		this.usersStatus = usersStatus;
		this.debugMode = debugMode;
		this.opmessageGrps = opmessageGrps;
		this.slideshowUsrgrps = slideshowUsrgrps;
		this.usersGroupses = usersGroupses;
		this.rightses = rightses;
		this.scriptses = scriptses;
		this.configs = configs;
		this.sysmapUsrgrps = sysmapUsrgrps;
		this.screenUsrgrps = screenUsrgrps;
	}

	public long getUsrgrpid() {
		return this.usrgrpid;
	}

	public void setUsrgrpid(long usrgrpid) {
		this.usrgrpid = usrgrpid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGuiAccess() {
		return this.guiAccess;
	}

	public void setGuiAccess(int guiAccess) {
		this.guiAccess = guiAccess;
	}

	public int getUsersStatus() {
		return this.usersStatus;
	}

	public void setUsersStatus(int usersStatus) {
		this.usersStatus = usersStatus;
	}

	public int getDebugMode() {
		return this.debugMode;
	}

	public void setDebugMode(int debugMode) {
		this.debugMode = debugMode;
	}

	public Set getOpmessageGrps() {
		return this.opmessageGrps;
	}

	public void setOpmessageGrps(Set opmessageGrps) {
		this.opmessageGrps = opmessageGrps;
	}

	public Set getSlideshowUsrgrps() {
		return this.slideshowUsrgrps;
	}

	public void setSlideshowUsrgrps(Set slideshowUsrgrps) {
		this.slideshowUsrgrps = slideshowUsrgrps;
	}

	public Set getUsersGroupses() {
		return this.usersGroupses;
	}

	public void setUsersGroupses(Set usersGroupses) {
		this.usersGroupses = usersGroupses;
	}

	public Set getRightses() {
		return this.rightses;
	}

	public void setRightses(Set rightses) {
		this.rightses = rightses;
	}

	public Set getScriptses() {
		return this.scriptses;
	}

	public void setScriptses(Set scriptses) {
		this.scriptses = scriptses;
	}

	public Set getConfigs() {
		return this.configs;
	}

	public void setConfigs(Set configs) {
		this.configs = configs;
	}

	public Set getSysmapUsrgrps() {
		return this.sysmapUsrgrps;
	}

	public void setSysmapUsrgrps(Set sysmapUsrgrps) {
		this.sysmapUsrgrps = sysmapUsrgrps;
	}

	public Set getScreenUsrgrps() {
		return this.screenUsrgrps;
	}

	public void setScreenUsrgrps(Set screenUsrgrps) {
		this.screenUsrgrps = screenUsrgrps;
	}

}