package com.design.factory.absfactory.phone;

/**
 * @ClassName: HWBlackPhone
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/5 18:21
 */
public class HWBlackPhone extends Phone {
    public void prepare() {
        setName("Huawei亮黑色手机");
        System.out.println(" 给制作Huawei亮黑色手机 准备原材料 ");
    }
}
