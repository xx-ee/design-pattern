package com.singleton;

/**
 * @ClassName: Singleton08
 * @Description:
 * @Author: xiedong
 * @Date: 2020/4/5 1:30
 */
public class Singleton08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}

//使用枚举，可以实现单例, 推荐
enum Singleton {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}