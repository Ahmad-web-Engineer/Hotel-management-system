package com.learning.projects.airBnbApp.dto;

import com.learning.projects.airBnbApp.entity.User;
import com.learning.projects.airBnbApp.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}