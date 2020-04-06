package com.design.factory.simplefactory.phone;

/**
 * @ClassName: HuaweiPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:20
 */
public class HuaweiPhone extends Phone {
    @Override
    public void prepare() {
        System.out.println(" 给制作华为手机 准备原材料 ");
    }
}
