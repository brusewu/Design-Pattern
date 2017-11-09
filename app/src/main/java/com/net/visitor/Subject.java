package com.net.visitor;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
