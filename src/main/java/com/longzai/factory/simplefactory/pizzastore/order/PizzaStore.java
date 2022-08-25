package com.longzai.factory.simplefactory.pizzastore.order;
// 相当于一个客户端 完成披萨的订购
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出了程序");


        new OrderPizza2();
    }
}
