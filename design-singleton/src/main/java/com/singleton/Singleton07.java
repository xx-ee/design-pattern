package com.singleton;

/**
 * @ClassName: Singleton7
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 1:20
 */
public class Singleton07 {
    private static volatile Singleton07 instance;

    //构造器私有化
    private Singleton07() {}

    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE

    public static synchronized Singleton07 getInstance() {

        return SingletonInstance.INSTANCE;
    }
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance2 = Singleton07.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}
