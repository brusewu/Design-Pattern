package com.net.strategy;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp){
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
