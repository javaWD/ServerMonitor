package cn.com.esrichina.ServerMonitor.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.esrichina.ServerMonitor.Repository.ItemsRepository;
import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.genericdao.search.Search;
import cn.com.esrichina.genericdao.search.SearchResult;

@Service
public class ItemService {

	@Resource
	private ItemsRepository itemsRepository;
	
	public SearchResult<Items> searchItems(Search search){
		
		return itemsRepository.searchAndCount(search);
	}
	
}
