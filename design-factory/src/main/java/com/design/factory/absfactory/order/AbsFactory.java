package com.design.factory.absfactory.order;

import com.design.factory.absfactory.phone.Phone;

/**
 * @Interface: AbsFactory
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/6 13:52
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    Phone createPhone(String orderType);
}
