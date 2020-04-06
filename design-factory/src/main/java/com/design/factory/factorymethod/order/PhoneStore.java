package com.design.factory.factorymethod.order;

/**
 * @ClassName: PhoneStore
 * @Description: 工厂方法模式（核心，将实例化对象推迟到子类）
 * @Author: xiedong
 * @Date: 2020/4/6 12:00
 */
public class PhoneStore {
    public static void main(String[] args) {
        String str="huawei";
        if (str.equals("huawei")) new HWOrderPhone();
        else new XMOrderPhone();
    }
}
