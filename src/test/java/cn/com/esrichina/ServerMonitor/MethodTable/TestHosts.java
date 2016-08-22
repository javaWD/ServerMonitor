package cn.com.esrichina.ServerMonitor.MethodTable;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import cn.com.esrichina.ServerMonitor.dao.HostsHome;
import cn.com.esrichina.ServerMonitor.domain.Hosts;

public class TestHosts extends TestCase{
	private HostsHome hostsHome;

	@Before
	public void setUp(){
		hostsHome=new HostsHome();
	}
	
	@Test
	public void testGetAvailableHosts(){
		List<Hosts> list=hostsHome.getAvilableHosts();
		for(Hosts hs:list){
			System.out.println(hs.getHostid()+"---"+hs.getHost());
		}
	}
	
	@Test
	public void testGetAvailableHostById(){
		//hostsHome.getAvailableHostById(MonitorConstants.HostId);
		Hosts host=hostsHome.findById(MonitorConstants.HostId);
		System.out.println(host.getHostid()+"---"+host.getHost()+"---"+host.getAvailable());
	}
}
