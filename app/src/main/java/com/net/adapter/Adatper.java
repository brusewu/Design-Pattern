package com.net.adapter;

/**
 * Created by wuxiaolong on 2017/10/30.
 */

public class Adatper extends Source implements Targetable {

    @Override
    public void method2(){
        System.out.println("this is the targetable method!");
    }
}
