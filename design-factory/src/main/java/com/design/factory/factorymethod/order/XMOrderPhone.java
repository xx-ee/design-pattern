package com.design.factory.factorymethod.order;


import com.design.factory.factorymethod.phone.*;

/**
 * @ClassName: XMOrderPhone
 * @Description: 厂方法模式（核心，将实例化对象推迟到子类）
 * @Author: xiedong
 * @Date: 2020/4/6 12:58
 */
public class XMOrderPhone extends OrderPhone {
    Phone createPhone(String orderType) {
        Phone phone= null;
        if(orderType.equals("black")) {
            phone = new XMBlackPhone();
        } else if (orderType.equals("blue")) {
            phone = new XMBluePhone();
        }
        return phone;
    }
}
