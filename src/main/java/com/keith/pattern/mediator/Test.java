package com.keith.pattern.mediator;

/**
 * 中介模式
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator=new BlindDateMediator();
        Man man=new Man("小明",1,mediator);
        Man man2=new Man("小张",2,mediator);
        WoMan woMan=new WoMan("小红",1,mediator);
        man.getCompanion(man2);
        man.getCompanion(woMan);
        man2.getCompanion(woMan);
    }
}
