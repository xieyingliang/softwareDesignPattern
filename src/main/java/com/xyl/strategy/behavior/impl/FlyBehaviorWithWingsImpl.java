package com.xyl.strategy.behavior.impl;

import com.xyl.strategy.behavior.FlyBehavior;

/**
 * Author:xyl
 * Date:2019/7/16 23:32
 * Description:可以飞翔
 */
public class FlyBehaviorWithWingsImpl implements FlyBehavior {
    public void fly() {
        System.out.println("I believe i can fly ");
    }
}
