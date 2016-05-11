package com.shineyang.testmvpmode.model;

/**
 * Created by ShineYang on 16/4/18.
 */
public class OperateNumber {
    public int number;

    public OperateNumber() {
        this.number = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
