package com.keith.pattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        People people=new People("小明",22);
        System.out.println(people+"==="+people.hashCode());

        People people1= (People) people.clone();
        System.out.println(people1+"==="+people1.hashCode());
        people.setAge(23);
        System.out.println(people+"==="+people.hashCode());
    }
}
