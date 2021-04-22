package com.hyc.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private long userId;//userId为11位的long型
    private long accountNumber;
    private String password;
    private int balance;
    private String userName;
    private String avatar;
    private boolean somethingNotRead;

    public User(long userId, long accountNumber, String password, int balance, String userName, String avatar, boolean somethingNotRead) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
        this.userName = userName;
        this.avatar = avatar;
        this.somethingNotRead = somethingNotRead;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", somethingNotRead=" + somethingNotRead +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isSomethingNotRead() {
        return somethingNotRead;
    }

    public void setSomethingNotRead(boolean somethingNotRead) {
        this.somethingNotRead = somethingNotRead;
    }
}
