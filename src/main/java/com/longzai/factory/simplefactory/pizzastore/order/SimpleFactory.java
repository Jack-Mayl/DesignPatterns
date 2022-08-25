package com.longzai.factory.simplefactory.pizzastore.order;

import com.longzai.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.longzai.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.longzai.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.longzai.factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂实例
public class SimpleFactory {
    // 根据orderType返回对呀的pizza对象
    public Pizza createPizza(String OrderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza=null;
        if (OrderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (OrderType.equals("cheese")) {
            pizza = new ChessPizza();
            pizza.setName("奶酪披萨");
        }else if (OrderType.equals("pepper")){
                pizza =new PepperPizza();
                pizza.setName("胡椒披萨");
        }
        return pizza;
    }
    // 静态
    public static Pizza createPizza2(String OrderType){
        System.out.println("使用简单工厂模式2");
        Pizza pizza=null;
        if (OrderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (OrderType.equals("cheese")) {
            pizza = new ChessPizza();
            pizza.setName("奶酪披萨");
        }else if (OrderType.equals("pepper")){
            pizza =new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
