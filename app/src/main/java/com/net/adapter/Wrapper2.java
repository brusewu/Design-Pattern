package com.net.adapter;

/**
 * Created by wuxiaolong on 2017/10/30.
 */

public class Wrapper2 implements Targetable {

    private Source source;

    public Wrapper2(Source source){
        super();
        this.source = source;
    }

    @Override
    public  void method2(){
        System.out.println("this is the targetble method!");
    }

    @Override
    public void method1(){
        source.method1();
    }
}
