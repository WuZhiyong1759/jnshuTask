package cn.li.task4;

import cn.li.task4.util.DESUtil;

/**
 * Created by lizenan on 2017/4/24.
 */
public class TestDES {
    public static  void main(String[] args){
//        测试DES的工具类
        DESUtil util =new DESUtil();
        String str ="泽南第二帅";
//        因为DES算法的特殊性，密码长度必须是8的倍数
        String password="12345678";
        byte[] result = util.encrypt(str.getBytes(),password);
        System.out.println("加密后的内容是"+new String(result));

        try{
            byte[] decryResult = util.decrypt(result,password);
            System.out.println("解密后的内容是:"+new String(decryResult));
        }catch (Exception e){

        }
    }
}
