package com.longzai.principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        // 测试
        A a = new A();
        a.depend1(new B()); // A 类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D()); // A 类通过接口去依赖(使用)B类
        c.depend4(new D());
        c.depend5(new D());



    }
}
// 接口1
interface  Interface1 { void operation1();}
    // 接口2
interface  Interface2 {
        void operation2();
        void operation3();
    }
    // 接口3
interface  Interface3{
        void operation4();
        void operation5();
    }
class B implements Interface1,Interface2{
    @Override
    public void operation1() {System.out.println("B  实现了operation1");}
    @Override
    public void operation2() {System.out.println("B  实现了operation2");}
    @Override
    public void operation3() {System.out.println("B  实现了operation3");}
    }
class D implements Interface1,Interface3{
        @Override
        public void operation1() {System.out.println("D  实现了operation1");}
        @Override
        public void operation4() {System.out.println("D  实现了operation4");}
        @Override
        public void operation5() {System.out.println("D  实现了operation5");}
    }
 class A{ // A 类通过接口Interface1依赖(使用)B类 但是只会用到1，2，3，方法
        public void depend1(Interface1 interface1){
            interface1.operation1();
        }
    public void depend2(Interface2 interface2){
        interface2.operation2();
    }
    public void depend3(Interface2 interface2){
        interface2.operation3();
    }
}
class C{// B 类通过接口Interface1依赖(使用)D类 但是只会用到1，4，5，方法
        public void depend1(Interface1 interface1){
            interface1.operation1();
        }
        public void depend4(Interface3 interface3){
            interface3.operation4();
        }
        public void depend5(Interface3 interface3){
            interface3.operation5();
        }
    }


