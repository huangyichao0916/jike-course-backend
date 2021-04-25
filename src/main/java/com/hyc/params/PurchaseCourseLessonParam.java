package com.hyc.params;

public class PurchaseCourseLessonParam {
    private long userId;
    private int balance;
    private int id;
    private int priceSale;

    @Override
    public String toString() {
        return "PurchaseCourseLessonParam{" +
                "userId=" + userId +
                ", balance=" + balance +
                ", id=" + id +
                ", priceSale=" + priceSale +
                '}';
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public PurchaseCourseLessonParam(long userId, int balance, int id, int priceSale) {
        this.userId = userId;
        this.balance = balance;
        this.id = id;
        this.priceSale = priceSale;
    }

    public PurchaseCourseLessonParam() {
    }
}
