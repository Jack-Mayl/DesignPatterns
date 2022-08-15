package com.longzai.singleton;

public class Mar03 {
    // 这为单列模式中的懒汉汉式 在类中直接进行static修饰
    private static Mar03 INSTANCE;
    // 也需要把构造方法修饰符改为private 防止他人多次进行new对象的操作
    private Mar03(){}
    // 如若我们想要获取对象  那么只需在类中定义一个方法进行获取即可
    public static Mar03 getINSTANCE(){
        // 先判读对象是否为空 如果为空就创建对象  不为空则直接返回
        if(INSTANCE==null){
            // 为了测试多线程访问情况下导致创建多次对象(多线程中不安全的问题)
            try{
                // 定义一个 睡眠为1毫秒
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 创建对象
            INSTANCE = new Mar03();
        }
        // 返回
        return INSTANCE;
    }
    // 测试方法
    public void  m(){System.out.println("m");}
}
