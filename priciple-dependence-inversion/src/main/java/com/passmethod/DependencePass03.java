package com.passmethod;

/**
 * @ClassName: DependencePass03
 * @Description:
 * @Author: xiedong
 * @Date: 2020/3/21 14:24
 */
public class DependencePass03 {
    public static void main(String[] args) {
        OpenAndClose03 openAndClose = new OpenAndClose03();
        openAndClose.setTv(new ChangHong03());
        openAndClose.open();
    }
}
interface IOpenAndClose03 {
     void open(); // 抽象方法
     void setTv(ITV03 tv);}

interface ITV03 { // ITV接口
     void play();}

class OpenAndClose03 implements IOpenAndClose03 {
    private ITV03 tv;
    public void setTv(ITV03 tv) {//setter方法
         this.tv = tv; }
    public void open() { this.tv.play(); }
}
class ChangHong03 implements ITV03 {
    @Override
    public void play() { System.out.println("paly on 长虹电视03"); }
}
