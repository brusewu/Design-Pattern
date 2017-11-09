package com.net.decorator;

/**
 * Created by wuxiaolong on 2017/10/31.
 */

public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }
    @Override
    public void method(){
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
