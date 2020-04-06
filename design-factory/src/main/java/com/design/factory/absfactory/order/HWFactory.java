package com.design.factory.absfactory.order;

import com.design.factory.absfactory.phone.HWBlackPhone;
import com.design.factory.absfactory.phone.HWWhitePhone;
import com.design.factory.absfactory.phone.Phone;

/**
 * @ClassName: HWFactory
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/6 13:55
 */
public class HWFactory implements AbsFactory {
    @Override
    public Phone createPhone(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Phone phone = null;
        if (orderType.equals("white")) {
            phone = new HWWhitePhone();
        } else if (orderType.equals("black")) {
            phone = new HWBlackPhone();
        }
        return phone;
    }
}
