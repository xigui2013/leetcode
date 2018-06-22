package com.wjw.command;

/**
 * @author shulu.wjw
 * @date 上午12:30 2018/6/23
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
