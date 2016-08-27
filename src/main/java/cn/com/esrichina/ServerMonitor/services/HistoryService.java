package cn.com.esrichina.ServerMonitor.services;

import java.util.List;

import javax.annotation.Resource;

import cn.com.esrichina.ServerMonitor.dao.HistoryHome;
import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.ServerMonitor.utils.QueryHistoryOption;

public class HistoryService {
	
	@Resource
	private HistoryHome historyHome;

	public List<History> searchHistory(QueryHistoryOption qho) {
		
		return historyHome.getHistoryByQueryHistoryOption(qho);
	}
	
	
}
