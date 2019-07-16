package com.xyl.strategy;


/**
 * Author:xyl
 * Date:2019/7/16 23:41
 * Description:
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
