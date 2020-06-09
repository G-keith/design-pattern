package com.keith.pattern.bridging;

/**
 * 手机样式
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立式手机打电话");
    }
    @Override
    public void message(){
        super.message();
        System.out.println("直立式手机发短信");
    }
}
