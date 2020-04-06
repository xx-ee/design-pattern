package com.design.factory.simplefactory.phone;

/**
 * @ClassName: XiaomiPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:19
 */
public class XiaomiPhone extends Phone {
    @Override
    public void prepare() {
        System.out.println(" 给制作小米手机 准备原材料 ");
    }
}
