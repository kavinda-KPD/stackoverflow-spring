package com.kpd.stackoverflowspring.dtos;

import lombok.Data;

@Data
public class  signupDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
}
