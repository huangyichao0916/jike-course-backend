package com.hyc.pojo;

import java.io.Serializable;
import java.util.Date;

public class RechargeRecord implements Serializable {
    private long userId;
    private int money;
    private Date rechargeTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    @Override
    public String toString() {
        return "RechargeRecord{" +
                "userId=" + userId +
                ", money=" + money +
                ", rechargeTime=" + rechargeTime +
                '}';
    }

    public RechargeRecord(long userId, int money, Date rechargeTime) {
        this.userId = userId;
        this.money = money;
        this.rechargeTime = rechargeTime;
    }

    public RechargeRecord(long userId, int money) {
        this.userId = userId;
        this.money = money;
    }

    public RechargeRecord() {
    }
}
