package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * ProxyAutoregHost generated by hbm2java
 */
public class ProxyAutoregHost implements java.io.Serializable {

	private Long id;
	private int clock;
	private String host;
	private String listenIp;
	private int listenPort;
	private String listenDns;
	private String hostMetadata;

	public ProxyAutoregHost() {
	}

	public ProxyAutoregHost(int clock, String host, String listenIp,
			int listenPort, String listenDns, String hostMetadata) {
		this.clock = clock;
		this.host = host;
		this.listenIp = listenIp;
		this.listenPort = listenPort;
		this.listenDns = listenDns;
		this.hostMetadata = hostMetadata;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getListenIp() {
		return this.listenIp;
	}

	public void setListenIp(String listenIp) {
		this.listenIp = listenIp;
	}

	public int getListenPort() {
		return this.listenPort;
	}

	public void setListenPort(int listenPort) {
		this.listenPort = listenPort;
	}

	public String getListenDns() {
		return this.listenDns;
	}

	public void setListenDns(String listenDns) {
		this.listenDns = listenDns;
	}

	public String getHostMetadata() {
		return this.hostMetadata;
	}

	public void setHostMetadata(String hostMetadata) {
		this.hostMetadata = hostMetadata;
	}

}
