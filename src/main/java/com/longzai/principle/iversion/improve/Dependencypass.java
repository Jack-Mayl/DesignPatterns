package com.longzai.principle.iversion.improve;

public class Dependencypass {
    public static void main(String[] args) {
        // 测试方法一
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new ChangHong());
        // 测试方法二
//        OpenAndClose openAndClose = new OpenAndClose(new ChangHong());
//        openAndClose.open();
        // 测试方法三
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ChangHong());
        openAndClose.open();

    }
}
//// 方式一: 通过接口传递实现依赖
//// 开关的接口
//interface IOpenAndClose{
//    public void open(ITV tv); // 抽象方法,接收接口
//}
//interface  ITV{ //ITV接口
//    public void play();
//}
//// 实现接口
//class OpenAndClose implements IOpenAndClose{
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//
//    }
//}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视剧,打开");
    }
}

//// 方式二: 通过构造方法依赖传递
//interface IOpenAndClose{
//    public void open(); // 抽象方法,接收接口
//}
//interface  ITV{ //ITV接口
//    public void play();
//}
//// 实现接口
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;// 成员
//    public OpenAndClose(ITV tv) {// 通过构造器传递
//        this.tv = tv;
//    }
//    @Override
//    public void open() {this.tv.play();}
//}

// 方式三: 通过setter方法传递
interface IOpenAndClose{
    public void open(); // 抽象方法,接收接口
}
interface  ITV{ //ITV接口
    public void play();
}
// 实现接口
class OpenAndClose implements IOpenAndClose{
    public ITV tv;// 成员
    public void setTv(ITV tv) {
        this.tv = tv;
    }
    @Override
    public void open() {this.tv.play();}
}
// 依赖倒转原则的注意事项和细节
//1.低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好
//2.变量的声明类型尽量是抽象类或接口,这样我们的变量引用和实际对象间，就存在
//一个缓冲层，利于程序扩展和优化
//3.继承时遵循里氏替换原则