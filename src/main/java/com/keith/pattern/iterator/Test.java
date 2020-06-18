package com.keith.pattern.iterator;

/**
 * 迭代器模式
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Test {

    public static void main(String[] args) {
        String[] strings= {"Robert","John","Julie","Lora"};
        Container name=new Name(strings);
        Iterator iterator=name.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
