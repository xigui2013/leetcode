package com.wjw.businessdelegate;

/**
 * @author shulu.wjw
 * @date 上午10:52 2018/6/24
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
