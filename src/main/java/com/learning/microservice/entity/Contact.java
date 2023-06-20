package com.learning.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
}
