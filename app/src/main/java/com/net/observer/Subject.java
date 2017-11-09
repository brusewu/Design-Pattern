package com.net.observer;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public interface Subject {

    //add observer
    public void add(Observer observer);

    //delete observer
    public void del(Observer observer);

    //notify observer
    public void notifyObservers();
    //do myself
    public void operation();
}
