package cn.com.esrichina.ServerMonitor.commons;

import cn.com.esrichina.ServerMonitor.dao.ItemsHome;
import cn.com.esrichina.ServerMonitor.domain.Items;

public class Cpu {
	private Items cpuUtilIdle;
	private Items cpuUtilInterrupt;
	private Items cpuUtilIowait;
	private Items cpuUtilNice;
	private ItemsHome itemsHome;
	
	public Cpu(String ownerHostId){
		itemsHome=new ItemsHome();
		
	}
	
	public Items getCpuUtilIdle() {
		return cpuUtilIdle;
	}
	public void setCpuUtilIdle(Items cpuUtilIdle) {
		this.cpuUtilIdle = cpuUtilIdle;
	}
	public Items getCpuUtilInterrupt() {
		return cpuUtilInterrupt;
	}
	public void setCpuUtilInterrupt(Items cpuUtilInterrupt) {
		this.cpuUtilInterrupt = cpuUtilInterrupt;
	}
	public Items getCpuUtilIowait() {
		return cpuUtilIowait;
	}
	public void setCpuUtilIowait(Items cpuUtilIowait) {
		this.cpuUtilIowait = cpuUtilIowait;
	}
	public Items getCpuUtilNice() {
		return cpuUtilNice;
	}
	public void setCpuUtilNice(Items cpuUtilNice) {
		this.cpuUtilNice = cpuUtilNice;
	}
	
	
}
