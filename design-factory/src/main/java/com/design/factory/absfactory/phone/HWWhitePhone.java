package com.design.factory.absfactory.phone;

/**
 * @ClassName: HuaweiPhone
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/5 18:20
 */
public class HWWhitePhone extends Phone {
    @Override
    public void prepare() {
        setName("Huawei零度白");
        System.out.println(" 给制作HUAWEI零度白手机 准备原材料 ");
    }
}
