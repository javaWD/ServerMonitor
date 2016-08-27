package cn.com.esrichina.ServerMonitor.web.vo;

import cn.com.esrichina.ServerMonitor.commons.MyBeanUtils;
import cn.com.esrichina.ServerMonitor.domain.Items;

public class ItemsVO {
	public ItemsVO(Items items){
		super();
		MyBeanUtils.copyProperties(items,this);
		this.hostId=items.getHosts().getHostid();
	}
	


	private long itemid;
	private long hostId;
	private String units;
	private int trends;
	private String name;
    private String key;
    private int delay;
    private int history;
	public long getItemid() {
		return itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
	public long getHostId() {
		return hostId;
	}
	public void setHostId(long hostId) {
		this.hostId = hostId;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public int getTrends() {
		return trends;
	}
	public void setTrends(int trends) {
		this.trends = trends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	
	@Override
	public String toString() {
		return "["+"itemid:"+itemid+";hostId:"+hostId+";name:"+name+";key:"+key+"]";
	}
}
