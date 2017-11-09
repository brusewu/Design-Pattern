package com.net.proxy;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method(){
        before();
        source.method();
        after();
    }
    private void before(){
        System.out.println("this is proxy before");
    }

    private void after(){
        System.out.println("this is proxy after");
    }

}
