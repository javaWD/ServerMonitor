package cn.com.esrichina.ServerMonitor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import cn.com.esrichina.ServerMonitor.dao.HistoryHome;
import cn.com.esrichina.ServerMonitor.dao.HostsHome;
import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.domain.Hosts;

public class DaoTest extends TestCase{

	@Before
	public void setUp(){

	}
	
	public static String timeStamp2Date(String seconds,String format) {  
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){  
            return "";  
        }  
        if(format == null || format.isEmpty()) format = "yyyy-MM-dd HH:mm:ss";  
        SimpleDateFormat sdf = new SimpleDateFormat(format);  
        return sdf.format(new Date(Long.valueOf(seconds+"000")));  
    }
	
	
	@Test
	public void testHistory(){
		HistoryHome hh=new HistoryHome();
		List<History> list=hh.getTop5();
		String date;
		for(History hs:list){
			 date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(Long.valueOf(hs.getId().getClock()+"000")));
			System.out.println(hs.getId().getItemid()+"--"+date);
			System.out.println(hs.getId().getClock());
		}
	}
	
	@Test
	public void testHosts(){
		HostsHome hh=new HostsHome();
		Hosts host=hh.findById(Long.valueOf("10084"));
		String date;
		System.out.println(host.getHostid()+"---"+host.getHost());
//		for(Hosts hs:list){
//			 date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(Long.valueOf(hs.getId().getClock()+"000")));
//			System.out.println(hs.getId().getItemid()+"--"+date);
//			System.out.println(hs.getId().getClock());
//		}
	}
	
	@Test
	public void testDate(){
		String date= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(Long.valueOf(1471328792)*1000));
		System.out.println(date);
	}

	@Test
	public void testTimeStamp(){
		System.out.println(new Date()+"---"+System.currentTimeMillis()/1000);
		
	}
	
}
