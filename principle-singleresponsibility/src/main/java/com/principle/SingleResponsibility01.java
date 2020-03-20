package com.principle;

/**
 * @ClassName: SingleResponsibility01
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/20 23:19
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

/**
 * 分析：
 * 1、很明显，违反了单一职责原则，一个类只负责一个职责
 * 2、解决方案：根据交通运行方法不同，分解成不同类即可----方案2
 */
//交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}
