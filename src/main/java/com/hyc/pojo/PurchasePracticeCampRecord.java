package com.hyc.pojo;

public class PurchasePracticeCampRecord {
    private long userId;
    private int campId;

    public PurchasePracticeCampRecord(long userId, int campId) {
        this.userId = userId;
        this.campId = campId;
    }

    public PurchasePracticeCampRecord() {
    }

    @Override
    public String toString() {
        return "PurchasePracticeCampRecord{" +
                "userId=" + userId +
                ", campId=" + campId +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
    }
}
