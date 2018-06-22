package com.wjw.command;

/**
 * @author shulu.wjw
 * @date 上午12:25 2018/6/23
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
