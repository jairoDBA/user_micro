package com.user.infrastructure.persistence;

import com.user.application.usecase.port.output.UserPersistencePort;
import com.user.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserPersistencePortImpl implements UserPersistencePort {

    @Override
    public User saveUser(User user) {
        return null;
    }
}
