package com.wjw.visitor;

/**
 * @author shulu.wjw
 * @date 下午11:41 2018/6/23
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
