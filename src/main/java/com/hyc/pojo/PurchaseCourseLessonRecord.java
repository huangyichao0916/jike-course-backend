package com.hyc.pojo;

import java.io.Serializable;

public class PurchaseCourseLessonRecord implements Serializable {
    private long userId;
    private int lessonId;

    @Override
    public String toString() {
        return "PurchaseCourseLessonRecord{" +
                "userId=" + userId +
                ", lessonId=" + lessonId +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public PurchaseCourseLessonRecord(long userId, int lessonId) {
        this.userId = userId;
        this.lessonId = lessonId;
    }

    public PurchaseCourseLessonRecord() {
    }
}
