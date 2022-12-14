package com.longzai.principle.iversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());

//        person.receive(new WeiXin());// 这里就出错了 如果我们想要通过 又要从构一个方法 比较麻烦 我们就可以使用依赖倒置原则
    }
}
class Email{
    public String getInfo(){
        return "电子邮件休息:hello word";
    }
}

class WeiXin{
    public String getInfo(){
        return "电子邮件休息:hello word";
    }
}

// 完成Person接收消息的功能
// 方式1分析
// 1.简单,比较容易想到
// 2.如果我们获取的对象是 微信 短信等等 则新增类,同时Person也要增加相应的接收方法
// 3.解决思路: 引入一个抽象的接口IReceiver 表示接收者 这样Person类与接口IReceiver发送依赖
// 因为Email WeiXin 等等属于接收的范围 他们各自实现IReceiver 接口就ok 这样我们就符合了依赖倒置(倒转)原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}