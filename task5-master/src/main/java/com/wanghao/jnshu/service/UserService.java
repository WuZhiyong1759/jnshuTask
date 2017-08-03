package com.wanghao.jnshu.service;

import com.wanghao.jnshu.model.User;

/**
 * Created by WangHao on 2017/1/26.
 */
public interface UserService {
    public User select(long id);
    public boolean verification(String username,String psaaword);
    public int insert(String username,  String password);
    public User selectToUsername(String username);
}
