package com.wjw.mediator;

/**
 * @author shulu.wjw
 * @date 下午8:09 2018/6/23
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John");
        john.sendMessage("Hello! Robert!");
    }
}
