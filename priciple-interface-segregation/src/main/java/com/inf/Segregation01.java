package com.inf;

/**
 * @ClassName: Segregation01
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/21 12:31
 */
public class Segregation01 {
    public static void main(String[] args) {

    }
}
interface interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements interface1 {
    public void operation1() { System.out.println("B实现openration1方法"); }
    public void operation2() { System.out.println("B实现openration2方法"); }
    public void operation3() { System.out.println("B实现openration3方法"); }
    public void operation4() { System.out.println("B实现openration4方法"); }
    public void operation5() { System.out.println("B实现openration5方法"); }
}
class D implements interface1 {
    public void operation1() { System.out.println("D实现openration1方法"); }
    public void operation2() { System.out.println("D实现openration2方法"); }
    public void operation3() { System.out.println("D实现openration3方法"); }
    public void operation4() { System.out.println("D实现openration4方法"); }
    public void operation5() { System.out.println("D实现openration5方法"); }
}
class A {//A类通过接口Interface1依赖使用B类，但是只会用到1，2，3方法
    public void depend1(interface1 inf1){inf1.operation1();}
    public void depend2(interface1 inf1){inf1.operation2();}
    public void depend3(interface1 inf1){inf1.operation3();}
}
class C {//C类通过接口Interface1依赖使用D类，但是只会用到1，4，5方法
    public void depend1(interface1 inf1){inf1.operation1();}
    public void depend4(interface1 inf1){inf1.operation4();}
    public void depend5(interface1 inf1){inf1.operation5();}
}
