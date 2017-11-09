package com.net.bridge;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }
}
