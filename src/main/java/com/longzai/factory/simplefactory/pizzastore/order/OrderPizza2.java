package com.longzai.factory.simplefactory.pizzastore.order;

import com.longzai.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
public class OrderPizza2 {


    Pizza pizza=null;



    public  void  setSimpleFactory(){
        String orderType="";//用户输入的
        do{
            orderType=getType();
            pizza=SimpleFactory.createPizza2(orderType);
            // 输出 pizza
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
