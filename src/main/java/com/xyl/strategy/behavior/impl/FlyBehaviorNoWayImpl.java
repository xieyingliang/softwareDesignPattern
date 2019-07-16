package com.xyl.strategy.behavior.impl;

import com.xyl.strategy.behavior.FlyBehavior;

/**
 * Author:xyl
 * Date:2019/7/16 23:32
 * Description:不可以飞翔
 */
public class FlyBehaviorNoWayImpl implements FlyBehavior {
    public void fly() {
        System.out.println("oh ,my god ,I can't fly!! ");
    }
}
