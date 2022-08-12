package com.longzai.singleton;

public class Main {
    public static void main(String[] args) {
//        Mar01 mar01=new Mar01(); //  无法实例化 因为在Mar01中 构造方法被private修饰私有化 也为了确保单列
          Mar01 mar01=Mar01.getInstance(); // 如若想要获取对象的实例化操作 则可以在该对象中编写获取的方法
          Mar01 mar02=Mar01.getInstance();
        System.out.println(mar01==mar02);
    }
}
