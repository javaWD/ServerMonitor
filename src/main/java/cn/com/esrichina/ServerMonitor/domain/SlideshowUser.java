package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * SlideshowUser generated by hbm2java
 */
public class SlideshowUser implements java.io.Serializable {

	private long slideshowuserid;
	private Users users;
	private Slideshows slideshows;
	private int permission;

	public SlideshowUser() {
	}

	public SlideshowUser(long slideshowuserid, Users users,
			Slideshows slideshows, int permission) {
		this.slideshowuserid = slideshowuserid;
		this.users = users;
		this.slideshows = slideshows;
		this.permission = permission;
	}

	public long getSlideshowuserid() {
		return this.slideshowuserid;
	}

	public void setSlideshowuserid(long slideshowuserid) {
		this.slideshowuserid = slideshowuserid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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
