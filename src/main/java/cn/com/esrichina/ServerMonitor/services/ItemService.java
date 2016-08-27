package cn.com.esrichina.ServerMonitor.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.esrichina.ServerMonitor.Repository.ItemsRepository;
import cn.com.esrichina.ServerMonitor.dao.ItemsHome;
import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.genericdao.search.Search;
import cn.com.esrichina.genericdao.search.SearchResult;

@Service
public class ItemService {

	@Resource
	private ItemsHome itemsHome;
	
	public ItemService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Items> searchItems(Search search){
		
		return itemsHome.searchAndCount(search);
	}
	
	public List<Items> searchItemsByHostId(Long hostId){
		return itemsHome.getItemsByHostId(hostId);
	}
	
	public Items searchItemsByID(Long id){
		return itemsHome.findById(id);
	}
}
