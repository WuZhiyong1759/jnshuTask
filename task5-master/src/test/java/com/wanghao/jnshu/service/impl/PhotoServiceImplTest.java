package com.wanghao.jnshu.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by WangHao on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class PhotoServiceImplTest {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Test
    public void select() throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 计算md5函数
        md.update("123".getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        String md5= new BigInteger(1, md.digest()).toString(16);
        userServiceImpl.insert("abc",md5);
    }
}