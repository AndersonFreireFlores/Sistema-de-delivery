package com.example.delivery.Controllers;

import com.example.delivery.Models.Item.ItemDTO;
import com.example.delivery.Services.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items/{id}")
    public ItemDTO getItemById(UUID id) {
        return itemService.getItemById(id);
    }

    @GetMapping("/items")
    public Set<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/items")
    public void createItem(@RequestBody ItemDTO itemDTO) {
        itemService.saveItem(itemDTO);
    }

    @PutMapping("/items/{id}")
    public void updateItem(@PathVariable UUID id, @RequestBody ItemDTO itemDTO) {
        itemService.updateItem(id, itemDTO);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable UUID id) {
        itemService.deleteItem(id);
    }
}
