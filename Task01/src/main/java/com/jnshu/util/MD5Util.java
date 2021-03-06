package com.jnshu.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Tom on 2017/5/4.
 */
public class MD5Util {
    public static String stringToMD5(String string){
        MessageDigest md=null;
        try {
            md=MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //计算md5函数
        md.update(string.getBytes());
        //digest（）最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
//      BigInteger函数则将8位的字符串换成16位的hex值，用字符串来表示；得到字符形式的hash值
        return new BigInteger(1,md.digest()).toString(16);
    }

//    public static void main(String[] args){
//        String str="helloword";
//        System.out.println(MD5Util.stringToMD5(str));
//
//    }
}
