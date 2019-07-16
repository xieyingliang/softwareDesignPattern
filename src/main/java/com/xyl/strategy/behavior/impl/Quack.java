package com.xyl.strategy.behavior.impl;

import com.xyl.strategy.behavior.QuackBehavior;

/**
 * Author:xyl
 * Date:2019/7/16 23:38
 * Description:
 */
public class Quack implements QuackBehavior {
    /**
     * 嘎嘎叫
     */
    public void quack() {
        System.out.println("ga ga ga ");
    }
}
