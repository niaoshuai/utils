package com.ruijc.shiro.logic;

import com.ruijc.shiro.mapper.IUserMapper;
import com.ruijc.shiro.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserL {

    @Autowired
    private IUserMapper userMapper;

    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
