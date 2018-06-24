package com.wjw.businessdelegate;

/**
 * @author shulu.wjw
 * @date 上午10:55 2018/6/24
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
