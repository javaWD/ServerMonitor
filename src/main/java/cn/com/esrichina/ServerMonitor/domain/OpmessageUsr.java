package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * OpmessageUsr generated by hbm2java
 */
public class OpmessageUsr implements java.io.Serializable {

	private long opmessageUsrid;
	private Operations operations;
	private Users users;

	public OpmessageUsr() {
	}

	public OpmessageUsr(long opmessageUsrid, Operations operations, Users users) {
		this.opmessageUsrid = opmessageUsrid;
		this.operations = operations;
		this.users = users;
	}

	public long getOpmessageUsrid() {
		return this.opmessageUsrid;
	}

	public void setOpmessageUsrid(long opmessageUsrid) {
		this.opmessageUsrid = opmessageUsrid;
	}

	public Operations getOperations() {
		return this.operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
