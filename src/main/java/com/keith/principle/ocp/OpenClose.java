package com.keith.principle.ocp;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-17
 **/
public class OpenClose {
    public static void main(String[] args) {
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.mType == 1) {
            drawRectangle(s);
        } else if (s.mType == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
}

class Shape {
    int mType;
}

class Rectangle extends Shape {
    Rectangle() {
        super.mType = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.mType = 2;
    }
}