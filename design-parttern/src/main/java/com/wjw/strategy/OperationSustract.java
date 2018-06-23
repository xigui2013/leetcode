package com.wjw.strategy;

/**
 * @author shulu.wjw
 * @date 下午10:28 2018/6/23
 */
public class OperationSustract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
