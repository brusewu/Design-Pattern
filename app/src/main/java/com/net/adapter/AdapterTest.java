package com.net.adapter;

/**
 * Created by wuxiaolong on 2017/10/30.
 */

public class AdapterTest {

    public AdapterTest(){
        Targetable targetable = new Adatper();
        targetable.method1();
        targetable.method2();
    }
    public void adapterTest1(){
        Source source = new Source();
        Targetable targetable = new Wrapper2(source);
        targetable.method1();
        targetable.method2();
    }
}
