package com.wanghao.jnshu.Util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by WangHao on 2017/1/27.
 */
public class MD5UtilTest {
    @Test
    public void a(){
        String token="F7751582142D4BE8E9119508E8812CB9";
        byte[] tk= TypeUtil.hexStringToByte(token);
        byte[] tk1= new byte[0];
        try {
            tk1 = DesUtil.decrypt(tk,"12345678");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String tk2=new String(tk1);
        String id="";
        String time="";
        for (int j=0;j<tk2.length();j++){
            char c=tk2.charAt(j);
            if (c=='='){
                for (int k=j+1;k<tk2.length();k++)
                    time=time+tk2.charAt(k);
                break;
            }
            id=id+c;
        }
        System.out.println(id);
        System.out.println(time);

    }

}