package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * ScreenUser generated by hbm2java
 */
public class ScreenUser implements java.io.Serializable {

	private long screenuserid;
	private Screens screens;
	private Users users;
	private int permission;

	public ScreenUser() {
	}

	public ScreenUser(long screenuserid, Screens screens, Users users,
			int permission) {
		this.screenuserid = screenuserid;
		this.screens = screens;
		this.users = users;
		this.permission = permission;
	}

	public long getScreenuserid() {
		return this.screenuserid;
	}

	public void setScreenuserid(long screenuserid) {
		this.screenuserid = screenuserid;
	}

	public Screens getScreens() {
		return this.screens;
	}

	public void setScreens(Screens screens) {
		this.screens = screens;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getPermission() {
		return this.permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

}