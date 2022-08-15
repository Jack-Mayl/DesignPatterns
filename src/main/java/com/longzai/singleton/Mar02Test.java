package com.longzai.singleton;

public class Mar02Test {
    public static void main(String[] args) {
        //        Mar02 mar02=new Mar02(); //  无法实例化 因为在Mar01中 构造方法被private修饰私有化 也为了确保单列
        Mar02 mar01=Mar02.getInstance(); // 如若想要获取对象的实例化操作 则可以在该对象中编写获取的方法
        Mar02 mar02=Mar02.getInstance();
        System.out.println(mar01==mar02); // 通过 == 来比较两个对象之间地址是否一直就知道了是否是单列模式或者还是原型模式
    }
}
