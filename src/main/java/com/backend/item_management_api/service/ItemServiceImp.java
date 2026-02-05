package com.backend.item_management_api.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.item_management_api.entity.ItemEntity;

@Service
public class ItemServiceImp implements ItemService {
	
	 private final Map<Long, ItemEntity> items = new HashMap<>();
	
	  @Override
	    public ItemEntity addItem(ItemEntity item) {
	        return item; // later: save to DB
	    }

	    @Override
	    public Optional<ItemEntity> getItemById(Long id) {
	        return Optional.empty(); // placeholder
	    }

}
