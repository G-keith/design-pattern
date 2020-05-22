package com.keith.pattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝，基本数据类型不改变值
        People people=new People("小明",22);
        System.out.println(people+"==="+people.hashCode());

        People people1= (People) people.clone();
        System.out.println(people1+"==="+people1.hashCode());
        int age=people.getAge();
        age=25;
        people.setAge(age);
        System.out.println(people+"==="+people.hashCode());
        System.out.println(people1+"==="+people1.hashCode());
        System.out.println("================================================");
        //引用类型会改变克隆出来对象的值
        Friend friend=new Friend("小红");
        People2 p=new People2("小明",22,friend);
        System.out.println(p+"==="+p.hashCode());

        People2 p2= (People2) p.clone();
        System.out.println(p2+"==="+p2.hashCode());
        Friend friend1=p.getFriend();
        friend1.setName("小紫");
        p.setFriend(friend1);
        System.out.println(p+"==="+p.hashCode());
        System.out.println(p2+"==="+p2.hashCode());
    }
}
