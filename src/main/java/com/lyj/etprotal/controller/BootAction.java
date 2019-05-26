package com.lyj.etprotal.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lyj.etprotal.entity.User;

/**
 * @ClassName liang
 * @Deserption TODO
 * @Author yongjie
 * @Date 2019-5-17 22:11
 * @Version 1.0
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class BootAction {
    @RequestMapping("getuser")
    public User getuser(){
        User user = new User();
        user.setName("第一次成功");
        return user;
    }
}

