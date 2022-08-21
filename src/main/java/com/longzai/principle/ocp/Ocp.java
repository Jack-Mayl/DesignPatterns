package com.longzai.principle.ocp;

/**
 * 方式1的优缺点
 * 1)优点是比较好理解，简单易操作。
 * 2)缺点是违反了设计模式的orp原则，即对扩展开放，对修改关闭。即当我们给类增
 * 加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 * 3)比如我们这时要新增加一个图形种类 三角形，我们需要做如下修改，修改的地方较多
 * 4)代码演示
 */
public class Ocp {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
//        graphicEditor.drawShape(new Triangle());

    }
}
// 这个是一个用于绘图的类[使用方]
class GraphicEditor{
    // 接收Shape对象 根据type来绘制不同的图形
    public void drawShape(Shape shape){
        if(shape.m_type == 1){
            drawRectangle(shape);
        }else if(shape.m_type == 2) {
            drawCircle(shape);
        }
//        }else if (shape.m_type==3){
//            drawTriangle(shape);
//        }
    }
    // 绘制矩形的
    public void drawCircle(Shape shape){
        System.out.println("矩形");
    }
    // 绘制圆形的
    public void drawRectangle(Shape shape){
        System.out.println("圆形");
    }
//    // 绘制三角形的
//    public void drawTriangle(Shape shape){
//        System.out.println("三角形");
//    }
}
// Shape类  父类
class Shape{
    int m_type;
}
// 子类
class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}
// 子类
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
//// 新增画三角形
//class Triangle extends Shape{
//    Triangle(){
//        super.m_type=3;
//    }
//}
/**
 * 方式1的改进的思路分析
 * 改进的思路分析
 * 思路:把创建Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可,这样我们有新的图形种类时，只需要让新的图形类继承Shape，
 * 并实现draw方法即可,使用方的代码就不需要修-→>满足了开闭原则
 */


