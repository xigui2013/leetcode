package com.wjw.businessdelegate;

/**
 * @author shulu.wjw
 * @date 上午10:57 2018/6/24
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
