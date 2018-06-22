package com.wjw.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 上午12:31 2018/6/23
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
