package com.wjw.command;

/**
 * @author shulu.wjw
 * @date 上午12:21 2018/6/23
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name:" + name + ",Quantity:" + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name:" + name + ",Quantity:" + quantity + " ] sold");
    }
}
