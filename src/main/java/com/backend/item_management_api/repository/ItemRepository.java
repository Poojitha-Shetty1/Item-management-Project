package com.backend.item_management_api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.backend.item_management_api.entity.ItemEntity;


@Repository
public class ItemRepository{
	
	   private final List<ItemEntity> items = new ArrayList<>();

	    public ItemEntity save(ItemEntity item) {
	        items.add(item);
	        return item;
	    }

	    public Optional<ItemEntity> findById(Long id) {
	        return items.stream()
	                .filter(item -> item.getId().equals(id))
	                .findFirst();
	    }
	
}
