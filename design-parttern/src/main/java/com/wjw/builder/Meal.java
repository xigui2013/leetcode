package com.wjw.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author shulu.wjw
 * @date 上午12:00 2018/6/21
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        AtomicReference<Float> cost = new AtomicReference<>(0.0f);
        itemList.forEach(item -> cost.updateAndGet(v -> v + item.price()));
        return cost.get();
    }

    public void showItems() {
        itemList.forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }


}
