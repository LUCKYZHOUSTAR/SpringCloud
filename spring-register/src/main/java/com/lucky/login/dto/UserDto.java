package com.lucky.login.dto;

import com.lucky.login.validate.PasswordMatches;
import com.lucky.login.validate.ValidateEmail;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/12/4 11:08
 * @Description:
 */

@PasswordMatches
@Data
public class UserDto {

    @NotEmpty
    @NotNull
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    @ValidateEmail
    private String email;
}
