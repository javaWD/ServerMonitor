package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * SlideshowUsrgrp generated by hbm2java
 */
public class SlideshowUsrgrp implements java.io.Serializable {

	private long slideshowusrgrpid;
	private Usrgrp usrgrp;
	private Slideshows slideshows;
	private int permission;

	public SlideshowUsrgrp() {
	}

	public SlideshowUsrgrp(long slideshowusrgrpid, Usrgrp usrgrp,
			Slideshows slideshows, int permission) {
		this.slideshowusrgrpid = slideshowusrgrpid;
		this.usrgrp = usrgrp;
		this.slideshows = slideshows;
		this.permission = permission;
	}

	public long getSlideshowusrgrpid() {
		return this.slideshowusrgrpid;
	}

	public void setSlideshowusrgrpid(long slideshowusrgrpid) {
		this.slideshowusrgrpid = slideshowusrgrpid;
	}

	public Usrgrp getUsrgrp() {
		return this.usrgrp;
	}

	public void setUsrgrp(Usrgrp usrgrp) {
		this.usrgrp = usrgrp;
	}

	public Slideshows getSlideshows() {
		return this.slideshows;
	}

	public void setSlideshows(Slideshows slideshows) {
		this.slideshows = slideshows;
	}

	public int getPermission() {
		return this.permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

}
