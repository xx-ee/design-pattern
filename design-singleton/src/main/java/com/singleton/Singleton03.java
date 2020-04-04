package com.singleton;

/**
 * @ClassName: Singleton03
 * @Description: 懒汉式-线程不安全
 * @Author: xiedong
 * @Date: 2020/4/5 0:19
 */
public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton03 getInstance() {
        if(instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
