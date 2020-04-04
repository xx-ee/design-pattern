package com.singleton;

/**
 * @ClassName: Singleton04
 * @Description: 懒汉式-同步方法
 * @Author: xiedong
 * @Date: 2020/4/5 0:53
 */
public class Singleton04 {
    private static Singleton04 instance;

    private Singleton04() {}

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton04 getInstance() {
        if(instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
