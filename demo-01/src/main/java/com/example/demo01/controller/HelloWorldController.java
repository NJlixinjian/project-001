package com.example.demo01.controller;

import com.example.demo01.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lxj
 * @Date: 2019/7/17 14:40
 * @Description:
 */
@RestController
public class HelloWorldController {

    /**
     * 访问地址
     * http://localhost:8088/hello
     * @return
     */
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setUserName("Bob");
        user.setPassWord("123456");
        return user;
    }
}
