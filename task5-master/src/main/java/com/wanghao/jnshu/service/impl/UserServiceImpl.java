package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.UserDao;
import com.wanghao.jnshu.model.User;
import com.wanghao.jnshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WangHao on 2017/1/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User select(long id){
        return userDao.select(id);
    }
    public User selectToUsername(String username){
        return userDao.selectToUsername(username);
    }
    public boolean verification(String username, String psaaword) {

        if(userDao.verification(username,psaaword)==null){
            return false;
        }
        return true;
    }

    public int insert(String username, String password){
        return  userDao.insert(username,password);
    }
}
