package cn.com.esrichina.ServerMonitor.ServiceTest;

import java.util.List;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.esrichina.ServerMonitor.MethodTable.MonitorConstants;
import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.ServerMonitor.services.HistoryService;
import cn.com.esrichina.ServerMonitor.utils.QueryHistoryOption;
import cn.com.esrichina.ServerMonitor.web.vo.ItemsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class HistoryServiceTest extends TestCase{
	
	private String sortBy;
	private Boolean sortDesc;
	@Before
	public void setUp(){
		
		
	}
	
	@Resource
	public HistoryService historyService;
	
	

	
	@Test
	public void testVOUtil(){
		QueryHistoryOption qho=new QueryHistoryOption(MonitorConstants.HostId);
		
		List<History> history=historyService.searchHistory(qho);
		
		
		//ItemsVO itemsVO=new ItemsVO(items);
		
		//System.out.println(itemsVO.toString());
	}
	
}
