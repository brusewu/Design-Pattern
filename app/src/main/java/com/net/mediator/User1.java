package com.net.mediator;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work(){
        System.out.println("user1 exe");
    }
}
