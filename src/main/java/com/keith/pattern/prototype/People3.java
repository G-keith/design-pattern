package com.keith.pattern.prototype;

import java.io.*;

/**
 * 浅拷贝
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class People3 implements Serializable,Cloneable{

    private String name;

    private int age;

    private Friend friend;


    public People3(String name, int age, Friend friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "People2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    protected Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            People3 people3 = (People3) ois.readObject();
            return people3;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
