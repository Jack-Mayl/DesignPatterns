package com.longzai.singleton;

public class Mar01 {
    // 这为单列模式中的饿汉式 在类中直接进行new对象的操作并用static修饰
    private static Mar01 INSTANCE=new Mar01();
    // 也需要把构造方法修饰符改为private 防止他人多次进行new对象的操作
    private Mar01(){}
    // 再次如若我们想要获取对象  那么只需在类中定义一个方法进行获取即可
    public static Mar01 getInstance(){return INSTANCE;}
    // 这是一个测试方法
    public void  m(){System.out.println("m" );}
}
