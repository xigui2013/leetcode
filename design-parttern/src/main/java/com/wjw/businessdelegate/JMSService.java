package com.wjw.businessdelegate;

/**
 * @author shulu.wjw
 * @date 上午10:53 2018/6/24
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
