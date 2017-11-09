package com.net.memento;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Storage {

    private Memento memento;
    public Storage(Memento memento){
        this.memento = memento;
    }
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
