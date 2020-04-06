package com.design.factory.simplefactory.order;

import com.design.factory.simplefactory.phone.HuaweiPhone;
import com.design.factory.simplefactory.phone.OppoPhone;
import com.design.factory.simplefactory.phone.Phone;
import com.design.factory.simplefactory.phone.XiaomiPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:23
 */
public class OrderPhone {
    // 构造器
    public OrderPhone() {
        Phone phone = null;
        String orderType; // 订购手机的类型
        do {
            orderType = getType();
            if (orderType.equals("xiaomi")) {
                phone = new XiaomiPhone();
                phone.setName(" 小米手机 ");
            } else if (orderType.equals("huawei")) {
                phone = new HuaweiPhone();
                phone.setName(" 华为手机 ");
            } else if (orderType.equals("pepper")) {
                phone = new OppoPhone();
                phone.setName("oppo手机");
            } else {
                break;
            }
            //输出phone制作过程
            phone.prepare();
            phone.produce();
            phone.box();

        } while (true);
    }
    // 写一个方法，可以获取客户希望订购的手机种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input 手机 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
