package com.longzai.principle.ocp.improve;

/**
 * 方式二
 */
public class Ocp {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}
// 这个是一个用于绘图的类[使用方]
class GraphicEditor {
    // 接收Shape对象 调用draw方法
    public void drawShape(Shape shape) {
        shape.draw();
    }
}
    // Shape类  父类
    abstract class Shape {
        int m_type;

        public abstract void draw();// 抽象方法
    }

    // 子类
    class Rectangle extends Shape {
        Rectangle() {
            super.m_type = 1;
        }

        @Override
        public void draw() {
            System.out.println("矩形");
        }
    }

    // 子类
    class Circle extends Shape {
        Circle() {
            super.m_type = 2;
        }

        @Override
        public void draw() {
            System.out.println("圆形");
        }
    }

    // 新增画三角形
    class Triangle extends Shape {
        Triangle() {
            super.m_type = 3;
        }

        @Override
        public void draw() {
            System.out.println("三角形");
        }

    }

// 新增一个其他图形
class OtherGraphic extends Shape{
    OtherGraphic(){
        super.m_type=4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图像");
    }
}


