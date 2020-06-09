package com.keith.pattern.decorator;

/**
 * 饮品抽象类
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public abstract class Drink {

    private String type;

    private float price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract float cost();

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
