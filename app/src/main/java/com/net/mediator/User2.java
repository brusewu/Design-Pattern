package com.net.mediator;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }
    @Override
    public void work(){
        System.out.println("user2 exe");
    }
}
