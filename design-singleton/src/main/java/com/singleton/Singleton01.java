package com.singleton;

/**
 * @ClassName: Singleton01
 * @Description: 饿汉式-静态常量
 * @Author: xiedong
 * @Date: 2020/4/4 23:30
 */
public class Singleton01 {
    //本类内部创建对象实例
    private final static Singleton01 instance=new Singleton01();
    //构造器私有化,外部不能new
   private Singleton01(){}
   //提供一个公有静态方法，返回实例对象
    private static Singleton01 getInstance(){
       return instance;
    }

    public static void main(String[] args) {
        //测试
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance1.hashCode());
    }
}
