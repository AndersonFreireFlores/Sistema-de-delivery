package com.example.delivery.Services;

import com.example.delivery.Models.Item.Item;
import com.example.delivery.Models.Item.ItemDTO;
import com.example.delivery.Models.Item.ItemMapper;
import com.example.delivery.Repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    private final ItemMapper itemMapper;

    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemDTO getItemById(UUID id) {
        return itemMapper.convert(itemRepository.findById(id).orElseThrow());
    }

    public Set<ItemDTO> getAllItems() {
        return itemMapper.convert(itemRepository.findAll());
    }

    public void saveItem(ItemDTO itemDTO) {
        itemRepository.save(itemMapper.convert(itemDTO));
    }

    public void updateItem(UUID id, ItemDTO itemDTO) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        itemMapper.convert(itemDTO, item);
        itemRepository.save(item);
    }

    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}
