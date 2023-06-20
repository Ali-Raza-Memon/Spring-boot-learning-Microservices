package com.learning.microservice.service;

import com.learning.microservice.entity.User;
import org.springframework.stereotype.Repository;


public interface UserService {

    public User getUser(Long id);
}
