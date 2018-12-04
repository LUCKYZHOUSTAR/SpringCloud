package com.lucky.login.service;

import com.lucky.login.dto.UserDto;
import com.lucky.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * @Auther: chaoqiang.zhou
 * @Date: 2018/12/4 14:21
 * @Description:
 */
public class UserService implements IUserService {

    @Autowired
//    private UserRepository repository;

    @Override
    public User registerNewUserAccount(UserDto accountDto) {

        if (emailExist(accountDto.getEmail())) {

            return null;
        }

        User user = new User();
        user.setFirstName(accountDto.getFirstName());
        user.setLastName(accountDto.getLastName());
        user.setPassword(accountDto.getPassword());
        user.setEmail(accountDto.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));
        

        return user;
    }

    private boolean emailExist(String email) {
//        User user = repository.findByEmail(email);
        User user = new User();
        if (user != null) {
            return true;
        }
        return false;
    }
}
