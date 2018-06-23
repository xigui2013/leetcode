package com.wjw.nullobject;

/**
 * @author shulu.wjw
 * @date 下午10:03 2018/6/23
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
