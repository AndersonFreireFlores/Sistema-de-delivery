package com.example.delivery.Models.Item;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")

public interface ItemMapper {
    @Mapping(target = "id", ignore = true)
    Item convert(ItemDTO itemDTO);

    ItemDTO convert(Item item);

    void convert(ItemDTO itemDTO,@MappingTarget Item item);

    Set<ItemDTO> convert(List<Item> all);
}
