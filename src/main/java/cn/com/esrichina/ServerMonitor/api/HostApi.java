package cn.com.esrichina.ServerMonitor.api;

import cn.com.esrichina.ServerMonitor.dao.HostsHome;
import cn.com.esrichina.ServerMonitor.domain.Hosts;
import cn.com.esrichina.ServerMonitor.domain.Items;

public class HostApi {
	
	private HostsHome hhome;
	private Hosts host;
	private String hostId;
	
	public HostApi(String hostId){
		this.hostId=hostId;
		this.host=hhome.findById(Long.valueOf(hostId));
	}
	
	public Hosts getHost(){
		
		return host;
	}
	
	public CpuApi getCpuApi(){
		//host.get
		return null;
	}
	
	public MemoryApi getMemoryApi(){
		return null;
	}
	
	public DiskApi getDiskApi(){
		return null;
	}
	
	public NetworkApi getNetworkApi(){
		return null;
	}
}
