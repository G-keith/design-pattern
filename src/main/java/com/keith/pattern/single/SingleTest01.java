package com.keith.pattern.single;

/**
 * 饿汉式（静态常量）
 * @author keith
 * @version 1.0
 * @date 2020-05-19
 **/
public class SingleTest01 {
    public static void main(String[] args) {
        Singleton01 singleton01=Singleton01.getInstance();
        Singleton01 singleton02=Singleton01.getInstance();
        System.out.println(singleton01==singleton02);
        System.out.println("singleton01 hashCode："+singleton01.hashCode());
        System.out.println("singleton01 hashCode："+singleton02.hashCode());
    }
}
class Singleton01{

    /**
     * 构造器私有化 防止外部new
     */
    private Singleton01(){

    }

    /**
     * 类的内部创建对象
     */
    private static Singleton01 instance=new Singleton01();

    /**
     * 向外暴露一个静态的公共方法
     */
    public static Singleton01 getInstance(){
        return instance;
    }
}