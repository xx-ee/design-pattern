package com.singleton;

/**
 * @ClassName: Singleton02
 * @Description: 饿汉式-静态代码块
 * @Author: xiedong
 * @Date: 2020/4/5 0:11
 */
public class Singleton02 {
    //本类内部创建对象实例
    private  static Singleton02 instance;
    //构造器私有化, 外部不能new
    private Singleton02(){}
    // 在静态代码块中，创建单例对象
    static {
        instance = new Singleton02();
    }
    //提供一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        //测试
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
