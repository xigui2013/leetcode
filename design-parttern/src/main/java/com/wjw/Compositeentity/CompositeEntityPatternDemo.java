package com.wjw.Compositeentity;

/**
 * @author shulu.wjw
 * @date 上午11:08 2018/6/24
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data2");
        client.printData();

    }
}
