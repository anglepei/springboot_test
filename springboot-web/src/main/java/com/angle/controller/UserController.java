package com.angle.controller;

import com.angle.dal.UserMapper;
import com.angle.dal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liupei on 2017/8/2.
 */
@RestController
@RequestMapping({ "/user" })
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/findById")
    @ResponseBody
    public User findById() {
        // User user = userMapper.selectByPrimaryKey(1);
        // return user;
        return null;
    }

    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<User> listAll() {
        List<User> users = userMapper.listAll();
        return users;
    }

}
