package com.xyl.strategy;

import com.xyl.strategy.behavior.FlyBehavior;
import com.xyl.strategy.behavior.QuackBehavior;

/**
 * Author:xyl
 * Date:2019/7/16 23:16
 * Description: 鸭子超类
 */
public abstract class Duck {
    /**
     * 飞翔行为
     */
    protected FlyBehavior flyBehavior;
    /**
     * 鸭叫行为
     */
    protected QuackBehavior quackBehavior;

    /**
     * 外观
     */
    public abstract void display();

    /**
     * 飞翔
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 鸭叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 所有的鸭子都会游泳！
     */
    public void swim() {
        System.out.println("All ducks float~~");
    }
}
