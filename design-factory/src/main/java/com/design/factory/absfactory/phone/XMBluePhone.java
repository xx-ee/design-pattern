package com.design.factory.absfactory.phone;

/**
 * @ClassName: XiaomiPhone
 * @Description: 抽象工厂模式
 *
 * @Author: xiedong
 * @Date: 2020/4/5 18:19
 */
public class XMBluePhone extends Phone {
    @Override
    public void prepare() {
        setName("Xiaomi梦幻蓝");
        System.out.println(" 给制作Xiaomi梦幻蓝手机 准备原材料 ");
    }
}
