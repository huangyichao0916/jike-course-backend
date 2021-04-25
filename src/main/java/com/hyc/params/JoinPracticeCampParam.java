package com.hyc.params;

public class JoinPracticeCampParam {
    private long userId;
    private int balance;
    private int campId;
    private int price;

    public JoinPracticeCampParam() {
    }

    @Override
    public String toString() {
        return "JoinPracticeCampParam{" +
                "userId=" + userId +
                ", balance=" + balance +
                ", campId=" + campId +
                ", price=" + price +
                '}';
    }

    public JoinPracticeCampParam(long userId, int balance, int campId, int price) {
        this.userId = userId;
        this.balance = balance;
        this.campId = campId;
        this.price = price;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
