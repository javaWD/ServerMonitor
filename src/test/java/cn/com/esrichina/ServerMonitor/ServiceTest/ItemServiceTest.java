package cn.com.esrichina.ServerMonitor.ServiceTest;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.ServerMonitor.services.ItemService;
import cn.com.esrichina.genericdao.search.Search;
import junit.framework.TestCase;

public class ItemServiceTest extends TestCase{
	
	private String sortBy;
	private Boolean sortDesc;
	@Before
	public void setUp(){
		
		
	}
	
	@Resource
	public ItemService itemService=new ItemService();
	
	
	@Test
	public void testItemService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Search search = new Search(Items.class);
		search.setFirstResult(0);
		search.setMaxResults(100);
		if (sortBy != null && sortDesc != null) {
			search.addSort(sortBy, sortDesc);
		} else {
			search.addSort("hosts.id", true);
		}
		
		search.addFilterEqual("hosts.id",10084);
		itemService.searchItems(search);
	}
	
}
