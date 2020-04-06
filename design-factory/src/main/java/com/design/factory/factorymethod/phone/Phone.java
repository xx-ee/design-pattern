package com.design.factory.factorymethod.phone;

/**
 * @ClassName: Phone
 * @Description: 厂方法模式（核心，将实例化对象推迟到子类）
 * @Author: xiedong
 * @Date: 2020/4/5 18:17
 */
//将Phone 类做成抽象
public abstract class Phone {
    protected String name; //名字
    //准备原材料, 不同的手机不一样，因此，我们做成抽象方法
    public abstract void prepare();
    //生产流水线
    public void produce() {
        System.out.println(name + " producing;");
    }
    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }
    public void setName(String name) {
        this.name = name;
    }
}
