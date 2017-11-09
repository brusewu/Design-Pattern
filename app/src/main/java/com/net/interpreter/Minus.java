package com.net.interpreter;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Minus implements Expression {

    @Override
    public int interpret(Context context){
        return context.getNum1()-context.getNum2();
    }
}
