package com.wjw.strategy;

/**
 * @author shulu.wjw
 * @date 下午10:29 2018/6/23
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
