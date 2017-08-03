package com.test;

import com.ptteng.carrots.zangai.service.ArticleService;
import com.ptteng.carrots.zangai.service.CompanyService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lzn312 on 2017/7/7.
 */
public class TestJu {



    public static void main(String[] args) {
    int a[] ={49,38,65,97,76,13,27,224};
    int temp;
     boolean flag=true;
    for (int i=0;i<a.length&& flag;i++){
        flag=false;
        for (int j=a.length-1;j>i;j--){
            if(a[j]>a[j-1]){
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                flag=true;
            }
        }
    }
    for (int i=0;i<a.length;i++) {
        System.out.println(a[i]);
    }

    }

}
