package com.singleton;

/**
 * @ClassName: Singleton06
 * @Description: 双重检查
 * @Author: xiedong
 * @Date: 2020/4/5 1:07
 */
public class Singleton06 {
    private static volatile Singleton06 instance;

    private Singleton06() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static synchronized Singleton06 getInstance() {
        if(instance == null) {
            synchronized (Singleton06.class) {
                if(instance == null) {
                    instance = new Singleton06();
                }
            }

        }
        return instance;
    }
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}
