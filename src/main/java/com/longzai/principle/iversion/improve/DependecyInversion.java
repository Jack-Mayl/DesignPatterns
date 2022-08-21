package com.longzai.principle.iversion.improve;

/**
 * 方式二
 * 使用依赖倒置原则  第一种 基于接口传 递
 */
public class DependecyInversion {
    public static void main(String[] args) {
        // 客户端无需做任何改变
        Person person=new Person();
        person.receive(new Email());
        person.receive(new WeiXin());// 这样就实现了依赖倒置原则
    }
}
// 定义接口  这就是面向接口编程
interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件休息:hello word";
    }
}
// 方式2 增加微信
class WeiXin implements IReceiver{
    public String getInfo(){
        return "电子邮件休息:hello word";
    }
}

// 完成Person接收消息的功能
// 方式2
class Person{
    // 这里我们是对接口进行依赖
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}