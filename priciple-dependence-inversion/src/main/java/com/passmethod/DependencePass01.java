package com.passmethod;

/**
 * @ClassName: DependencePass01
 * @Description: 依赖传递关系01-接口传递
 * @Author: xiedong
 * @Date: 2020/3/21 14:13
 */
public class DependencePass01 {
    public static void main(String[] args) {
        ChangHong01 changHong01 = new ChangHong01();
        OpenAndClose01 openAndClose01 = new OpenAndClose01();
        openAndClose01.open(changHong01);
    }
}
interface IOpenAndClose01 { void open(ITV01 itv01);}
interface ITV01 { void play();}

class ChangHong01 implements ITV01 {
    public void play() { System.out.println("play on 长虹电视"); }
}
class OpenAndClose01 implements IOpenAndClose01 {
    public void open(ITV01 itv01) { itv01.play(); }
}
