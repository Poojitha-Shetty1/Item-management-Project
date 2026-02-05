
package com.backend.item_management_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.item_management_api.entity.ItemEntity;
import com.backend.item_management_api.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")

public class ItemController {
	
    private ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }
    
    @PostMapping
    public ResponseEntity<ItemEntity> addItem(@Valid @RequestBody ItemEntity item) {
        return ResponseEntity.ok(service.addItem(item));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getItemById(@PathVariable Long id) {
        return service.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
