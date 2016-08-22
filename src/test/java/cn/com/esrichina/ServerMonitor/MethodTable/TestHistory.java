package cn.com.esrichina.ServerMonitor.MethodTable;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import cn.com.esrichina.ServerMonitor.dao.HistoryHome;
import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.utils.QueryHistoryOption;

public class TestHistory extends TestCase{

	private QueryHistoryOption queryHistoryOption;
	private HistoryHome historyHome;
	
	@Before
	public void setUp(){
		queryHistoryOption=new QueryHistoryOption(MonitorConstants.ItemsId,MonitorConstants.Start,MonitorConstants.End);
		historyHome=new HistoryHome();
	}
	
	@Test
	public void testGetHistoryByItemId(){
		List<History> ls=historyHome.getHistoryByItemId(queryHistoryOption);
		for(History hs:ls){
			System.out.println(hs.getId().getItemid()+"---"+hs.getId().getClock()+"---"+hs.getId().getValue());
		}
	}
}
