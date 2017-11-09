package com.net.memento;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Memento {

    private String value;

    public Memento(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
}
