package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
//    @GetMapping("hello")
//    public String hello() {
//        return "hello,spring boot!";
//    }

        @Autowired
        private UserService userService;

        @GetMapping("user/{id}")
        @ResponseBody
        public User queryUserById(@PathVariable("id")Long Id) {
            User user = this.userService.queryById(Id);
            if (user != null) {
                return user;
            }
            return null;
        }
    }

