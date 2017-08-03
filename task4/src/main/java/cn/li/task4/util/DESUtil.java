package cn.li.task4.util;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * Created by lizenan on 2017/4/19.
 */
@Component
public class DESUtil {
// 注意：DES加密和解密过程中，密钥长度都必须是8的倍数
public byte[] encrypt(byte[] datasource,String password){
    try {
        SecureRandom random =new SecureRandom();
        DESKeySpec desKey=new DESKeySpec(password.getBytes());
        //穿件一个秘钥工厂,然后用它把DESKeySpec转换
        SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DES");
        SecretKey secretKey =keyFactory.generateSecret(desKey);

        //Cipher对象实际完成加密操作
        Cipher cipher =Cipher.getInstance("DES");
         cipher.init(Cipher.ENCRYPT_MODE,secretKey,random);
         // 现在获取数据并加密
//        正式执行加密操作
        return cipher.doFinal(datasource);

    }catch (Throwable e){
        e.printStackTrace();
    }
        return null;
}

/*
*解密过程
 */
public  byte[] decrypt(byte[] src,String  password) throws Exception{
//    DES算法要求一个可信任的随即资源
    SecureRandom random = new SecureRandom();
//    创建一个DESKeySpec对象
    DESKeySpec desKey = new DESKeySpec(password.getBytes());
//    创建一个秘钥工厂
    SecretKeyFactory keyFactory =SecretKeyFactory.getInstance("DES");
//    讲DES对象转换为SecretKey对象
    SecretKey secretKey =keyFactory.generateSecret(desKey);
//    Cipher对象实际完成解密操作
    Cipher cipher =Cipher.getInstance("DES");
//    用秘钥初始化Cipher对象
    cipher.init(Cipher.DECRYPT_MODE,secretKey,random);
//    真正的开始解密操作
    return  cipher.doFinal(src);
}
}
