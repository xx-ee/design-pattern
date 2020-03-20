package com.principle;

/**
 * @ClassName: SingleResponsibility03
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/20 23:23
 */
public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle02 vehicle02 = new Vehicle02();
        vehicle02.run("汽车");
        vehicle02.run("摩托车");
        vehicle02.fly("飞机");
    }
}

/**
 * 分析:
 * 1、这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2、这里虽然没有在类的这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则
 */
class Vehicle02 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行.....");
    }

    public void fly(String vehicle) {
        System.out.println(vehicle + "在天上运行.....");
    }

    public void water(String vehicle) {
        System.out.println(vehicle + "在水中运行.....");
    }
}
