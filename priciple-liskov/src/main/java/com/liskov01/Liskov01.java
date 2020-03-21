package com.liskov01;

/**
 * @ClassName: Liskov01
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/21 15:06
 */
public class Liskov01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出11-3
        System.out.println("1-8=" + b.func1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) { return num1 - num2; }}

// B类继承了A
class B extends A {
    //这里，重写了A类的方法, 可能是无意识
    public int func1(int a, int b) { return a + b; }
    // 增加了一个新功能：完成两个数相加,然后和9求和
    public int func2(int a, int b) { return func1(a, b) + 9; }
}