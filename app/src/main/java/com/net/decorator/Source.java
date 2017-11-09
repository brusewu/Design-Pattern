package com.net.decorator;

/**
 * Created by wuxiaolong on 2017/10/31.
 */

public class Source implements Sourceable {

    @Override
    public void method(){
        System.out.println("the original method! decorator");
    }
}
