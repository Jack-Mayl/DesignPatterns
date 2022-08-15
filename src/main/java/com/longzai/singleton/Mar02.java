package com.longzai.singleton;

public class Mar02 {
    private static   final Mar02 INSTANCE ;
    static {INSTANCE=new Mar02();}
    private Mar02(){}
    public  static Mar02 getInstance(){return INSTANCE;}
    public  void m(){System.out.println("m");}
}
