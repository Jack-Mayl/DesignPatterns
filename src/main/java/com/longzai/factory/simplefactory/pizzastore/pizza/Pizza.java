package com.longzai.factory.simplefactory.pizzastore.pizza;
//将Pizza 类做成抽象类
public abstract class Pizza {
     protected String name;//名字
    // 准备原材料
     public  abstract void prepare();

     public  void bake(){
         System.out.println(name + "baking;");
     }
     public  void cut(){
         System.out.println(name+"cutting;");
     }
     public void box(){
         System.out.println(name+"boxing;");
     }
     public  void setName(String name){
         this.name=name;
     }
}
