package cn.com.esrichina.ServerMonitor.MethodTable;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import cn.com.esrichina.ServerMonitor.dao.ItemsHome;
import cn.com.esrichina.ServerMonitor.domain.Items;

public class TestItems extends TestCase{

	private ItemsHome itemsHome;
	private Items items;
	
	@Before
	public void setUp(){
		itemsHome=new ItemsHome();
	}
	
	@Test
	public void testGetItemsByHostId(){
		
		List<Items> list=itemsHome.getItemsByHostId(MonitorConstants.HostId);
		for(Items it:list){
			System.out.println("Id:"+it.getItemid()+"作用："+it.getKey()+"解释："+it.getDescription()+"时间间隔："+it.getDelay());
		}
		
	}
	
	@Test
	public void testGetItemByItemsId(){
		//items=itemsHome.getItemsByItemsId(MonitorConstants.ItemsId);
		items=itemsHome.findById(MonitorConstants.ItemsId);
		System.out.println(items.getItemid()+"---"+items.getDelay()+"---"+items.getKey()+"---"+items.getDescription());
		System.out.println(items.getHosts().getHostid());
	}
	
	
}
