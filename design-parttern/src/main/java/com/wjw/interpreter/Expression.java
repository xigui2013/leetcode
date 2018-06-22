package com.wjw.interpreter;

/**
 * @author shulu.wjw
 * @date 上午1:21 2018/6/23
 */
public interface Expression {
    boolean interpret(String context);
}
