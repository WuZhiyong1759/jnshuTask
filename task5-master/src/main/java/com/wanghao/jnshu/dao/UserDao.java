package com.wanghao.jnshu.dao;

import com.wanghao.jnshu.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by WangHao on 2017/1/26.
 */
public interface UserDao {
    public User select(long id);
    public User selectToUsername(String username);
    public int insert(@Param("username") String username, @Param("password") String password);
    public User verification(@Param("username") String username, @Param("password") String password);

}
