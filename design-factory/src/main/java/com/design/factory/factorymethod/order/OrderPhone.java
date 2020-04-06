package com.design.factory.factorymethod.order;


import com.design.factory.factorymethod.phone.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPhone
 * @Description: 厂方法模式（核心，将实例化对象推迟到子类）
 * @Author: xiedong
 * @Date: 2020/4/6 12:01
 */
public abstract class OrderPhone {
    //定义一个抽象方法，createPhone , 让各个工厂子类自己实现
    abstract Phone createPhone(String orderType);
    // 构造器
    public OrderPhone() {
        Phone phone = null;
        String orderType; // 订购phone的类型
        do {
            orderType = getType();
            phone = createPhone(orderType); //抽象方法，由工厂子类完成
            //输出phone 制作过程
            phone.prepare();
            phone.produce();
            phone.box();

        } while (true);
    }
    // 写一个方法，可以获取客户希望订购的phone种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input phone 颜色:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
