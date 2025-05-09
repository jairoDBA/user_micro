package com.user.infrastructure.mappers;

import com.user.domain.model.User;
import com.user.infrastructure.controllers.request.UserRequest;
import com.user.infrastructure.controllers.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
     User requestToDomain(UserRequest userRequest);

     UserResponse domainToResponse(User user);
}
