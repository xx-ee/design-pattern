package com.passmethod;

/**
 * @ClassName: DependencePass02
 * @Description: 依赖传递关系02-构造方法传递
 * @Author: xiedong
 * @Date: 2020/3/21 14:19
 */
public class DependencePass02 {
    public static void main(String[] args) {
        OpenAndClose02 openAndClose02 = new OpenAndClose02(new ChangHong02());
        openAndClose02.open();
    }
}
interface IOpenAndClose02{ void open();}
interface ITV02{ void play();}

class OpenAndClose02 implements IOpenAndClose02{
    private ITV02 itv02;
    public OpenAndClose02(ITV02 itv02){//有参构造
        this.itv02=itv02; }
    public void open() {
        this.itv02.play(); }
}
class ChangHong02 implements ITV02{
    public void play() {
        System.out.println("play on 长虹电视02");
    }
}