package com.net.mediator;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public abstract class User {

    private Mediator mediator;
    public Mediator getMediator(){
        return mediator;
    }
    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void work();
}
