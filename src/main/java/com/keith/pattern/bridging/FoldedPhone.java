package com.keith.pattern.bridging;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠式手机打电话");
    }
    @Override
    public void message(){
        super.message();
        System.out.println("折叠式手机发短信");
    }
}
