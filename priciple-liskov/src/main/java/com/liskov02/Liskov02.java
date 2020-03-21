package com.liskov02;

/**
 * @ClassName: Liskov01
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/21 15:06
 */
public class Liskov02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出11-3
        System.out.println("1+8=" + b.func1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
        System.out.println("-----------------------");
        System.out.println("11-3=" + b.func3(11, 3)); }}
//创建一个更加基础的基类
class Base{}
class A extends Base{
    // 返回两个数的差
    public int func1(int num1, int num2) { return num1 - num2; }}
// B类继承了A
class B extends Base {
    private A a =new A();
    public int func1(int a, int b) { return a + b;}
    // 增加了一个新功能：完成两个数相加,然后和9求和
    public int func2(int a, int b) { return func1(a, b) + 9; }
    public int func3(int a, int b) { return this.a.func1(a,b); }}