package com.keith.pattern.flyweight;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class FlyweightTest {
    private static final String colors[] =
            { "Red", "Green", "Blue" };
    public static void main(String[] args) {
        for(int i=0; i < 5; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
            //颜色相同，将不会进行对象实例化
            System.out.println("对象池中对象数量为："+ShapeFactory.getSize());
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
