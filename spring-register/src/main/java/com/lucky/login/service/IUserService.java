package com.lucky.login.service;

import com.lucky.login.dto.UserDto;
import com.lucky.login.model.User;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/12/4 11:27
 * @Description:
 */
public interface IUserService {

    public User registerNewUserAccount(UserDto accountDto);
}
