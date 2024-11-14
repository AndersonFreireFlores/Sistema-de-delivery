package com.example.delivery.Models.User;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mapping(target = "id", ignore = true)
    User convert(SignInDTO signInDTO);

    @Mapping(target = "id", ignore = true)
    User convert(UserDTO userDTO);

    UserDTO convert(User user);



}
