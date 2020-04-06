package com.design.factory.simplefactory.order;

import com.design.factory.simplefactory.phone.HuaweiPhone;
import com.design.factory.simplefactory.phone.OppoPhone;
import com.design.factory.simplefactory.phone.Phone;
import com.design.factory.simplefactory.phone.XiaomiPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPhone2
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 18:41
 */
public class OrderPhone2 {
    // 构造器
    public OrderPhone2() {
        Phone phone = null;
        String orderType; // 订购手机的类型
        do {
            orderType = getType();
            phone = SimpleFactory.createPhone(orderType);
            if (phone!=null){
                //输出phone 制作过程
                phone.prepare();
                phone.produce();
                phone.box();
            }else {
                System.out.println(" 订购手机失败 ");
                break;
            }
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
