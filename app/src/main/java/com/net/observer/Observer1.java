package com.net.observer;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Observer1 implements Observer {

    @Override
    public void update(){
        System.out.println("observer1 has received");
    }
}
