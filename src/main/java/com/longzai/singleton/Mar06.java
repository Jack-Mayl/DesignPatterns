package com.longzai.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类不会加载内部类，这样可以实现懒加载
 */
public class Mar06 {
    // 这为单列模式中的懒汉式 在类中直接进行static修饰
    private static Mar06 INSTANCE;
    // 也需要把构造方法修饰符改为private 防止他人多次进行new对象的操作
    private Mar06(){}
    // 定义一个内部类
   private static class Mar06Holder{
        // 在内部类中实现实例化对象操作
        private  final static Mar06 INSTANCE=new Mar06();
   }
   // 创建获取对象方法
   public static Mar06 getINSTANCE(){
        // 返回 内部类中对象
        return Mar06Holder.INSTANCE;
   }
    // 测试方法
    public void  m(){System.out.println("m");}
}
