package com.longzai.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("摩托车");
        vehicle.runWater("游艇");
        vehicle.runAir("飞机");
    }
}
//  方案三的分析
//  1.这种修改方法没有对原来的类做大的修改，只是增加方法
//  2.这里虽然没有在类上这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
class Vehicle2{
    public  void run(String vehicle){
        System.out.println(vehicle+"在公路上运行.....");
    }
    public  void runAir(String vehicle){
        System.out.println(vehicle+"在天空中运行.....");
    }
    public  void runWater(String vehicle){
        System.out.println(vehicle+"在水中运行.....");
    }
}