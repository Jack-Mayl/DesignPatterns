package com.longzai.factory.simplefactory.pizzastore.pizza;

public class ChessPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }
}
