package com.wjw.visitor;

/**
 * @author shulu.wjw
 * @date 下午11:39 2018/6/23
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
