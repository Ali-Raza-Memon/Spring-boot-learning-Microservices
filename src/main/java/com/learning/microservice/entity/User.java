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
    private Long userID;
    private String name;
    private String phone;
    List<Contact> contacts = new ArrayList<>();
}
