package com.design.factory.simplefactory.order;

import com.design.factory.simplefactory.phone.HuaweiPhone;
import com.design.factory.simplefactory.phone.OppoPhone;
import com.design.factory.simplefactory.phone.Phone;
import com.design.factory.simplefactory.phone.XiaomiPhone;

/**
 * @ClassName: SimpleFactory
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:39
 */
public class SimpleFactory {
    //简单工厂模式 也叫 静态工厂模式

    public static Phone createPhone(String orderType) {

        Phone phone = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("xiaomi")) {
            phone = new XiaomiPhone();
            phone.setName(" 小米手机 ");
        } else if (orderType.equals("huawei")) {
            phone = new HuaweiPhone();
            phone.setName(" 华为手机 ");
        } else if (orderType.equals("pepper")) {
            phone = new OppoPhone();
            phone.setName("oppo手机");
        }

        return phone;
    }
}
