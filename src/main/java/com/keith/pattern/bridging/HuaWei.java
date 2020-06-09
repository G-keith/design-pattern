package com.keith.pattern.bridging;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class HuaWei implements Brand{
    @Override
    public void call() {
        System.out.print("华为");
    }

    @Override
    public void message() {
        System.out.print("华为");
    }
}
