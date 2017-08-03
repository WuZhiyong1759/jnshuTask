package com.ptteng.requestModels;

import java.io.Serializable;

/**
 * Created by litao on 2017/2/23.
 */
public class Header implements Serializable{
    private static final long seriaVersionUID = 1L;

    private  String ck;//给予调用者的,根据项目制定标准

    public String v;//调用登陆接口后的返回值,根据项目制定标准

    public String getCK(){
        return ck;
    }

    public void setCk(String ck){
        this.ck = ck;
    }

    public String getV(){
        return v;
    }

    public void setV(String v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "Header [ck=" + ck + ", v=" + v + "]";
    }

    public Header(){
        super();
    }

    public Header(String ck,String v){
        super();
        this.ck = ck;
        this.v = v;
    }
}
