package com.wjw.visitor;

/**
 * @author shulu.wjw
 * @date 上午1:31 2018/6/24
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
