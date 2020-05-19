package com.keith.pattern.single;

/**
 *
 * @author keith
 * @version 1.0
 * @date 2020-05-19
 **/
public class SingleTest01 {
    public static void main(String[] args) {
        Singleton01 singleton01=Singleton01.getInstance();
        Singleton01 singleton011=Singleton01.getInstance();
        System.out.println(singleton01==singleton011);
        System.out.println("singleton01 hashCode："+singleton01.hashCode());
        System.out.println("singleton01 hashCode："+singleton011.hashCode());

        System.out.println("==================================================");
        Singleton02 singleton02=Singleton02.getInstance();
        Singleton02 singleton021=Singleton02.getInstance();
        System.out.println(singleton02==singleton021);
        System.out.println("singleton01 hashCode："+singleton02.hashCode());
        System.out.println("singleton01 hashCode："+singleton021.hashCode());
    }
}

/**
 * 饿汉式（静态常量）
 */
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

/**
 * 饿汉式（静态代码块）
 */
class Singleton02{

    /**
     * 构造器私有化 防止外部new
     */
    private Singleton02(){

    }
    /**
     * 类的内部创建对象
     */
    private static Singleton02 instance;

    static {
        instance=new Singleton02();
    }

    /**
     * 向外暴露一个静态的公共方法
     */
    public static Singleton02 getInstance(){
        return instance;
    }
}