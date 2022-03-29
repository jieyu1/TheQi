package com.example.controller;

import com.example.pojo.User;
import com.example.utils.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @RequestMapping("login")
    public ServerResponse login(String username,String password){
        User userInfo = new User();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        return ServerResponse.createServerResponseBySuccess(userInfo);
    }
}
