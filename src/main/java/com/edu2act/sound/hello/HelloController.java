package com.edu2act.sound.hello;

import com.edu2act.sound.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${my.number}")
    private int number;

    @RequestMapping("/hello")
    public String helloWord(){
        System.out.println(number);

        return "hello word！";
    }

    @RequestMapping("/user/info")
    public User getUser(){
        User u = new User();
        u.setId(1);
        u.setName("张三");
        u.setPassword("123456");
        return u;
    }
}