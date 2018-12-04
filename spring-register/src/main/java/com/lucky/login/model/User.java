package com.lucky.login.model;

import lombok.Data;

import java.util.List;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/12/4 14:20
 * @Description:
 */
@Data
public class User {
    private String firstName;
    private String lastName;

    private String password;
    private String matchingPassword;

    private String email;

    private List<String> roles;
}
