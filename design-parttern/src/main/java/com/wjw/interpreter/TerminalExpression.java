package com.wjw.interpreter;

/**
 * @author shulu.wjw
 * @date 上午1:22 2018/6/23
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
