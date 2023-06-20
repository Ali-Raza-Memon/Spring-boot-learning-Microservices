package com.learning.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long userId;
    private String name;
    private String phone;
    List<Contact> contacts = new ArrayList<>();



    public User(long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;

    }




    public User(long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts= contacts;
    }






}
