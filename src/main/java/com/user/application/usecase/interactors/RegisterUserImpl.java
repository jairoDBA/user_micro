package com.user.application.usecase.interactors;

import com.user.application.usecase.port.input.RegisterUserService;
import com.user.infrastructure.controllers.request.UserRequest;
import com.user.infrastructure.controllers.response.UserResponse;
import org.springframework.stereotype.Component;

@Component
public  class RegisterUserImpl implements RegisterUserService {
    @Override
    public UserResponse registerUser(UserRequest user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setEmail("TEst");
        return userResponse;
    }
}
