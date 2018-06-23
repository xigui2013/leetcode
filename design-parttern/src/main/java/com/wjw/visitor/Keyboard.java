package com.wjw.visitor;

/**
 * @author shulu.wjw
 * @date 下午11:40 2018/6/23
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
