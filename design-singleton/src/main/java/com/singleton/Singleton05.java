package com.singleton;

/**
 * @ClassName: Singleton05
 * @Description: 懒汉式-同步代码块
 * @Author: xiedong
 * @Date: 2020/4/5 0:56
 */
public class Singleton05 {
    private static Singleton05 instance;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
