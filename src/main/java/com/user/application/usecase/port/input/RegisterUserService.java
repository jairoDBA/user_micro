package com.user.application.usecase.port.input;

import com.user.infrastructure.controllers.request.UserRequest;
import com.user.infrastructure.controllers.response.UserResponse;

@FunctionalInterface
public interface RegisterUserService {

    UserResponse registerUser(UserRequest user);
}
