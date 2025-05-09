package com.user.application.usecase.interactors;

import com.user.application.usecase.port.input.RegisterUserService;
import com.user.application.usecase.port.output.UserPersistencePort;
import com.user.domain.model.User;
import com.user.infrastructure.controllers.request.UserRequest;
import com.user.infrastructure.controllers.response.UserResponse;
import com.user.infrastructure.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserImpl implements RegisterUserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserPersistencePort userPersistencePort;


    @Override
    public UserResponse registerUser(UserRequest userRequest) {
        User userToSave = userMapper.requestToDomain(userRequest);

        User userSaved = userPersistencePort.saveUser(userToSave);

        return userMapper.domainToResponse(userSaved);
    }
}
