package com.design.factory.factorymethod.order;

import com.design.factory.factorymethod.phone.HWBlackPhone;
import com.design.factory.factorymethod.phone.HWWhitePhone;
import com.design.factory.factorymethod.phone.Phone;

/**
 * @ClassName: HWOrderPhone
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/6 12:58
 */
public class HWOrderPhone extends OrderPhone {
    Phone createPhone(String orderType) {
        Phone phone= null;
        if(orderType.equals("black")) {
            phone = new HWBlackPhone();
        } else if (orderType.equals("white")) {
            phone = new HWWhitePhone();
        }
        return phone;
    }
}
