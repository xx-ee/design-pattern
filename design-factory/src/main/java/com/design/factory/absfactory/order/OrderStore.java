package com.design.factory.absfactory.order;

/**
 * @ClassName: OrderStore
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/6 13:58
 */
public class OrderStore {
    public static void main(String[] args) {
        new OrderPhone(new HWFactory());
    }
}
