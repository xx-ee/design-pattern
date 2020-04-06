package com.design.factory.absfactory.order;

import com.design.factory.absfactory.phone.Phone;
import com.design.factory.absfactory.phone.XMBlackPhone;
import com.design.factory.absfactory.phone.XMBluePhone;

/**
 * @ClassName: XMFactory
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/6 13:53
 */
public class XMFactory implements AbsFactory {
    @Override
    public Phone createPhone(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Phone phone = null;
        if (orderType.equals("bule")) {
            phone = new XMBluePhone();
        } else if (orderType.equals("black")) {
            phone = new XMBlackPhone();
        }
        return phone;
    }
}
