package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * MediaType generated by hbm2java
 */
public class MediaType implements java.io.Serializable {

	private long mediatypeid;
	private int type;
	private String description;
	private String smtpServer;
	private String smtpHelo;
	private String smtpEmail;
	private String execPath;
	private String gsmModem;
	private String username;
	private String passwd;
	private int status;
	private int smtpPort;
	private int smtpSecurity;
	private int smtpVerifyPeer;
	private int smtpVerifyHost;
	private int smtpAuthentication;
	private String execParams;
	private Set medias = new HashSet(0);
	private Set opmessages = new HashSet(0);
	private Set alertses = new HashSet(0);

	public MediaType() {
	}

	public MediaType(long mediatypeid, int type, String description,
			String smtpServer, String smtpHelo, String smtpEmail,
			String execPath, String gsmModem, String username, String passwd,
			int status, int smtpPort, int smtpSecurity, int smtpVerifyPeer,
			int smtpVerifyHost, int smtpAuthentication, String execParams) {
		this.mediatypeid = mediatypeid;
		this.type = type;
		this.description = description;
		this.smtpServer = smtpServer;
		this.smtpHelo = smtpHelo;
		this.smtpEmail = smtpEmail;
		this.execPath = execPath;
		this.gsmModem = gsmModem;
		this.username = username;
		this.passwd = passwd;
		this.status = status;
		this.smtpPort = smtpPort;
		this.smtpSecurity = smtpSecurity;
		this.smtpVerifyPeer = smtpVerifyPeer;
		this.smtpVerifyHost = smtpVerifyHost;
		this.smtpAuthentication = smtpAuthentication;
		this.execParams = execParams;
	}

	public MediaType(long mediatypeid, int type, String description,
			String smtpServer, String smtpHelo, String smtpEmail,
			String execPath, String gsmModem, String username, String passwd,
			int status, int smtpPort, int smtpSecurity, int smtpVerifyPeer,
			int smtpVerifyHost, int smtpAuthentication, String execParams,
			Set medias, Set opmessages, Set alertses) {
		this.mediatypeid = mediatypeid;
		this.type = type;
		this.description = description;
		this.smtpServer = smtpServer;
		this.smtpHelo = smtpHelo;
		this.smtpEmail = smtpEmail;
		this.execPath = execPath;
		this.gsmModem = gsmModem;
		this.username = username;
		this.passwd = passwd;
		this.status = status;
		this.smtpPort = smtpPort;
		this.smtpSecurity = smtpSecurity;
		this.smtpVerifyPeer = smtpVerifyPeer;
		this.smtpVerifyHost = smtpVerifyHost;
		this.smtpAuthentication = smtpAuthentication;
		this.execParams = execParams;
		this.medias = medias;
		this.opmessages = opmessages;
		this.alertses = alertses;
	}

	public long getMediatypeid() {
		return this.mediatypeid;
	}

	public void setMediatypeid(long mediatypeid) {
		this.mediatypeid = mediatypeid;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSmtpServer() {
		return this.smtpServer;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public String getSmtpHelo() {
		return this.smtpHelo;
	}

	public void setSmtpHelo(String smtpHelo) {
		this.smtpHelo = smtpHelo;
	}

	public String getSmtpEmail() {
		return this.smtpEmail;
	}

	public void setSmtpEmail(String smtpEmail) {
		this.smtpEmail = smtpEmail;
	}

	public String getExecPath() {
		return this.execPath;
	}

	public void setExecPath(String execPath) {
		this.execPath = execPath;
	}

	public String getGsmModem() {
		return this.gsmModem;
	}

	public void setGsmModem(String gsmModem) {
		this.gsmModem = gsmModem;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSmtpPort() {
		return this.smtpPort;
	}

	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}

	public int getSmtpSecurity() {
		return this.smtpSecurity;
	}

	public void setSmtpSecurity(int smtpSecurity) {
		this.smtpSecurity = smtpSecurity;
	}

	public int getSmtpVerifyPeer() {
		return this.smtpVerifyPeer;
	}

	public void setSmtpVerifyPeer(int smtpVerifyPeer) {
		this.smtpVerifyPeer = smtpVerifyPeer;
	}

	public int getSmtpVerifyHost() {
		return this.smtpVerifyHost;
	}

	public void setSmtpVerifyHost(int smtpVerifyHost) {
		this.smtpVerifyHost = smtpVerifyHost;
	}

	public int getSmtpAuthentication() {
		return this.smtpAuthentication;
	}

	public void setSmtpAuthentication(int smtpAuthentication) {
		this.smtpAuthentication = smtpAuthentication;
	}

	public String getExecParams() {
		return this.execParams;
	}

	public void setExecParams(String execParams) {
		this.execParams = execParams;
	}

	public Set getMedias() {
		return this.medias;
	}

	public void setMedias(Set medias) {
		this.medias = medias;
	}

	public Set getOpmessages() {
		return this.opmessages;
	}

	public void setOpmessages(Set opmessages) {
		this.opmessages = opmessages;
	}

	public Set getAlertses() {
		return this.alertses;
	}

	public void setAlertses(Set alertses) {
		this.alertses = alertses;
	}

}
