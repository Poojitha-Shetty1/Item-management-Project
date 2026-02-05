package com.backend.item_management_api.service;

import java.util.Optional;

import com.backend.item_management_api.entity.ItemEntity;

public interface ItemService {
	  ItemEntity addItem(ItemEntity item);
	    Optional<ItemEntity> getItemById(Long id);
}
