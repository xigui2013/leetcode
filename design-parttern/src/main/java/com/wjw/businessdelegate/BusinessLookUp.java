package com.wjw.businessdelegate;

/**
 * @author shulu.wjw
 * @date 上午10:53 2018/6/24
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        }
        return new JMSService();
    }
}
