package com.net.visitor;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    @Override
    public String getSubject(){
        return "love";
    }
}
