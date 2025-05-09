package com.user.application.usecase.port.output;

import com.user.domain.model.User;

public interface UserPersistencePort {

    public User saveUser(User user);
}
