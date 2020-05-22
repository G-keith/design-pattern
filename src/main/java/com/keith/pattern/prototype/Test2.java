package com.keith.pattern.prototype;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Test2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Friend friend=new Friend("小红");
        People3 people=new People3("小明",22,friend);
        System.out.println(people+"==="+people.hashCode());

        People3 people1= (People3) people.deepClone();
        System.out.println(people1+"==="+people1.hashCode());
        Friend friend1=people.getFriend();
        friend1.setName("小紫");
        people.setFriend(friend);
        System.out.println(people+"==="+people.hashCode());
        System.out.println(people1+"==="+people1.hashCode());
    }
}
