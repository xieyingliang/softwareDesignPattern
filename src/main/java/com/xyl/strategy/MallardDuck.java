package com.xyl.strategy;

import com.xyl.strategy.behavior.impl.FlyBehaviorWithWingsImpl;
import com.xyl.strategy.behavior.impl.Quack;

/**
 * Author:xyl
 * Date:2019/7/16 23:44
 * Description:野鸭子
 */
public class MallardDuck extends Duck {
    public void display() {
        System.out.println("I'm a MMallard duck ");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyBehaviorWithWingsImpl();
    }
}
