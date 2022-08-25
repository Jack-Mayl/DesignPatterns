package com.longzai.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希纳披萨 准备原材料");
    }
}
