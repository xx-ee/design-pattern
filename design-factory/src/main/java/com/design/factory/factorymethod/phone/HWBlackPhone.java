package com.design.factory.factorymethod.phone;

/**
 * @ClassName: HWBlackPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:21
 */
public class HWBlackPhone extends Phone {
    public void prepare() {
        setName("Huawei亮黑色手机");
        System.out.println(" 给制作Huawei亮黑色手机 准备原材料 ");
    }
}
