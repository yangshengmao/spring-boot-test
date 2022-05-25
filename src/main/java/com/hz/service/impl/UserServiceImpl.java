package com.hz.service.impl;

import com.hz.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了sayHello业务方法"+name);
    }
}
