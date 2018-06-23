package com.wjw.visitor;

/**
 * @author shulu.wjw
 * @date 下午11:39 2018/6/23
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
