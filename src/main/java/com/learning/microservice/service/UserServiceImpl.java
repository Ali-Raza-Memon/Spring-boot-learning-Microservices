package com.learning.microservice.service;

import com.learning.microservice.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    //fake user list





    List<User> list = List.of(
           new  User(1311L,"Durgesh Tiwari","012329304"),
           new  User(1312L,"Sooraj","02354304"),
           new  User(1311L,"Kumar","2319304"),
           new  User(1311L,"Pawan","232444")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id).findAny().orElse(null));
    }



}
