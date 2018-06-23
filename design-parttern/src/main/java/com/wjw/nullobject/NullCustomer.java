package com.wjw.nullobject;

/**
 * @author shulu.wjw
 * @date 下午10:04 2018/6/23
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
