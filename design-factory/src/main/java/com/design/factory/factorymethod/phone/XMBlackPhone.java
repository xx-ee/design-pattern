package com.design.factory.factorymethod.phone;

/**
 * @ClassName: XiaomiPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:19
 */
public class XMBlackPhone extends Phone {
    @Override
    public void prepare() {
        setName("Xiaomi曜石黑");
        System.out.println(" 给制作Xiaomi曜石黑手机 准备原材料 ");
    }
}
