package com.keith.pattern.mediator;

/**
 * 具体交互条件及交互结果
 *
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class BlindDateMediator extends Mediator {
    @Override
    public void getCompanion(Person person) {
        if (person instanceof Man) {
            this.setMan((Man) person);
        } else {
            this.setWoMan((WoMan) person);
        }
        if (getMan() == null || getWoMan() == null) {
            System.out.println("我不是gay");
        } else {
            if (getMan().getCondition() == getWoMan().getCondition()) {
                System.out.println(getMan().getName() + "和" + getWoMan().getName() + "合适");
            } else {
                System.out.println(getMan().getName() + "和" + getWoMan().getName() + "不合适");
            }
        }
    }
}
