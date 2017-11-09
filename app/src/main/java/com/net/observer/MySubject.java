package com.net.observer;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MySubject extends AbstractSubject {

    @Override
    public void operation(){
        System.out.println("update self");
        notifyObservers();
    }
}
