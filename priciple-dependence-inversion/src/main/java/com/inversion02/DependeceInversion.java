package com.inversion02;
/**
 * @ClassName: DependeceInversion
 * @Description: Person接收消息
 * @Author: xiedong
 * @Date: 2020/3/21 13:51
 */
public class DependeceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        System.out.println();
        person.receive(new WeiXin());
    }
}
interface IReceiver{ String getInfo();}

class Email implements IReceiver{ public String getInfo(){ return "Email:hello world"; }}
class WeiXin implements IReceiver{ public String getInfo(){ return "WeiXin:hello world"; }}

class Person{ public void receive(IReceiver iReceiver){ System.out.println(iReceiver.getInfo()); }}
