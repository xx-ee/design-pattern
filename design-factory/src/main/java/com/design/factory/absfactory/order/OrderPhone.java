package com.design.factory.absfactory.order;

import com.design.factory.absfactory.phone.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPhoe
 * @Description: 抽象工厂模式
 * @Author: xiedong
 * @Date: 2020/4/6 13:57
 */
public class OrderPhone {
    AbsFactory factory;

    // 构造器
    public OrderPhone(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Phone phone = null;
        String orderType = ""; // 用户输入
        this.factory = factory;
        do {
            orderType = getType();
            // factory 可能是华为的工厂子类，也可能是小米的工厂子类
            phone = factory.createPhone(orderType);
            if (phone != null) { // 订购ok
                phone.prepare();
                phone.produce();
                phone.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的phone种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input phone 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
