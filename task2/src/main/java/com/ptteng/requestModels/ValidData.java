package com.ptteng.requestModels;

import java.security.PublicKey;

/**
 * Created by litao on 2017/2/23.
 */
public class ValidData<T> {

    private Header header;

    private T t;

    public  Header getHeader(){
        return header;
    }

    public void setHeader(Header header){
        this.header = header;
    }

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

    public  ValidData(){
        super();
    }

    public ValidData(Header header, T t) {
        super();
        this.header = header;
        this.t = t;
    }


}
