package com.longzai.factory.simplefactory.pizzastore.order;

import com.longzai.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.longzai.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.longzai.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    // 构造去
//    public OrderPizza(){
//        Pizza pizza=null;
//        // 订购披萨的类型
//        String OrderType;
//        do{
//            OrderType=gettype();
//            if (OrderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if (OrderType.equals("cheese")) {
//                pizza = new ChessPizza();
//                pizza.setName("奶酪披萨");
//
////            }else if (OrderType.equals("pepper")){
////                pizza =new PepperPizza();
////                pizza.setName("胡椒披萨");
//            }else{
//                break;
//            }
//            // 输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    // 构造去
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public  void  setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";//用户输入的
        this.simpleFactory=simpleFactory;// 设置简单工厂对象
        do{
            orderType=getType();
            pizza=this.simpleFactory.createPizza(orderType);
            // 输出
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨的种类
    private String getType (){
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type");
        String s = null;

        try {
            s = strin.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
