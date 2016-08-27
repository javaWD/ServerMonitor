package cn.com.esrichina.ServerMonitor.ServiceTest;

import java.util.List;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.esrichina.ServerMonitor.MethodTable.MonitorConstants;
import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.ServerMonitor.services.ItemService;
import cn.com.esrichina.ServerMonitor.web.vo.ItemsVO;
import cn.com.esrichina.genericdao.search.Search;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ItemServiceTest extends TestCase{
	
	private String sortBy;
	private Boolean sortDesc;
	@Before
	public void setUp(){
		
		
	}
	
	@Resource
	public ItemService itemService;
	
	
	@Test
	public void testItemService(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Search search = new Search(Items.class);
//		search.setFirstResult(0);
//		search.setMaxResults(100);
//		if (sortBy != null && sortDesc != null) {
//			search.addSort(sortBy, sortDesc);
//		} else {
//			search.addSort("itemid", true);
//		}
//		
//		search.addFilterEqual("itemid",10013);
//		ItemService itemService=context.getBean(ItemService.class);
//		itemService.searchItems(search);
		List<Items> listItems=itemService.searchItemsByHostId(MonitorConstants.HostId);
		
	}
	
	@Test
	public void testVOUtil(){
		Items items=itemService.searchItemsByID(MonitorConstants.ItemsId);
		ItemsVO itemsVO=new ItemsVO(items);
		
		System.out.println(itemsVO.toString());
	}
	
}
