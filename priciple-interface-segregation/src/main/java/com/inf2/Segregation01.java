package com.inf2;

/**
 * @ClassName: Segregation01
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/21 12:31
 */
public class Segregation01 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());//A通过接口依赖（使用）B类
        a.depend3(new B());
        System.out.println();
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());//C通过接口依赖（使用）D类
        c.depend5(new D());
    }
}

interface interface1 {
    void operation1();
}
interface interface2 {
    void operation2();
    void operation3();
}
interface interface3 {
    void operation4();
    void operation5();
}
class B implements interface1,interface2 {
    public void operation1() { System.out.println("B实现openration1方法"); }
    public void operation2() { System.out.println("B实现openration2方法"); }
    public void operation3() { System.out.println("B实现openration3方法"); }
}
class D implements interface1,interface3 {
    public void operation1() { System.out.println("D实现openration1方法"); }
    public void operation4() { System.out.println("D实现openration4方法"); }
    public void operation5() { System.out.println("D实现openration5方法"); }
}
class A {//A类通过接口Interface1,Interface2依赖使用B类，但是只会用到1，2，3方法
    public void depend1(interface1 inf){inf.operation1();}
    public void depend2(interface2 inf){inf.operation2();}
    public void depend3(interface2 inf){inf.operation3();}
}
class C {//C类通过接口Interface1,Interface3依赖使用D类，但是只会用到1，4，5方法
    public void depend1(interface1 inf){inf.operation1();}
    public void depend4(interface3 inf){inf.operation4();}
    public void depend5(interface3 inf){inf.operation5();}
}
