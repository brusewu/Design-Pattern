package com.net.proxy;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Source implements Sourceable {

    @Override
    public void method(){
        System.out.println("this the proxy");
    }
}
