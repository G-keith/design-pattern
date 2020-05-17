package com.keith.principle.ocp;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-17
 **/
public class OpenClose2 {
    public static void main(String[] args) {
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Rectangle2());
        graphicEditor.drawShape(new Circle2());
        graphicEditor.drawShape(new Triangle2());
        graphicEditor.drawShape(new OtherGraphic2());
    }
}

/**
 * 绘图的类 [使用方]
 */
class GraphicEditor2 {
    public void drawShape(Shape2 s) {
        s.draw();
    }


}

abstract class Shape2 {

    /**
     * 抽象方法
     */
    public abstract void draw();
}

class Rectangle2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

class OtherGraphic2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}