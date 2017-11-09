package com.net.visitor;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub){
        System.out.println("visit the subject"+sub.getSubject());
    }
}
