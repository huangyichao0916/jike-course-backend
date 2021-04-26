package com.hyc.pojo;

public class EverydayLesson {
    private int lessonId;
    private String title;
    private String subTitle;
    private String lessonAvatar;

    @Override
    public String toString() {
        return "EverydayLesson{" +
                "lessonId=" + lessonId +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", lessonAvatar='" + lessonAvatar + '\'' +
                '}';
    }

    public EverydayLesson(int lessonId, String title, String subTitle, String lessonAvatar) {
        this.lessonId = lessonId;
        this.title = title;
        this.subTitle = subTitle;
        this.lessonAvatar = lessonAvatar;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLessonAvatar() {
        return lessonAvatar;
    }

    public void setLessonAvatar(String lessonAvatar) {
        this.lessonAvatar = lessonAvatar;
    }

    public EverydayLesson() {
    }
}
