package com.principle;

/**
 * @ClassName: SingleResponsibility02
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/20 23:18
 */
public class SingleResponsibility02 {
    public static void main(String[] args) {
        RoadVecihle roadVecihle = new RoadVecihle();
        roadVecihle.run("汽车");
        roadVecihle.run("摩托车");

        AirVecihle airVecihle = new AirVecihle();
        airVecihle.run("飞机");

    }
}

/**
 * 分析：
 * 1、遵守单一职责
 * 2、但是这样做改动很大，即将类分解同时修改客户端
 * 3、改进：直接修改Vehicle类，改动的代码相对比较少---方案3
 */
class RoadVecihle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}
class AirVecihle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上运行....");
    }
}
class WaterVecihle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行....");
    }
}