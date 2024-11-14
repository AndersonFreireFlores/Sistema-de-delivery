package com.example.delivery.Models.Item;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface ItemMapper {
    @Mapping(target = "id", ignore = true)
    Item convert(ItemDTO itemDTO);

    ItemDTO convert(Item item);
    

}
