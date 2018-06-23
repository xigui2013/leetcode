package com.wjw.nullobject;

/**
 * @author shulu.wjw
 * @date 下午10:05 2018/6/23
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String inName : names) {
            if (inName.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
