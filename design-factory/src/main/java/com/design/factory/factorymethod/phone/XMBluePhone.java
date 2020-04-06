package com.design.factory.factorymethod.phone;

/**
 * @ClassName: XiaomiPhone
 * @Description: 厂方法模式（核心，将实例化对象推迟到子类）
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
