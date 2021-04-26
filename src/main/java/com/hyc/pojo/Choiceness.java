package com.hyc.pojo;

public class Choiceness {
    private int choicenessId;
    private String title;
    private String choicenessAvatar;

    @Override
    public String toString() {
        return "Choiceness{" +
                "choicenessId=" + choicenessId +
                ", title='" + title + '\'' +
                ", choicenessAvatar='" + choicenessAvatar + '\'' +
                '}';
    }

    public int getChoicenessId() {
        return choicenessId;
    }

    public void setChoicenessId(int choicenessId) {
        this.choicenessId = choicenessId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChoicenessAvatar() {
        return choicenessAvatar;
    }

    public void setChoicenessAvatar(String choicenessAvatar) {
        this.choicenessAvatar = choicenessAvatar;
    }

    public Choiceness(int choicenessId, String title, String choicenessAvatar) {
        this.choicenessId = choicenessId;
        this.title = title;
        this.choicenessAvatar = choicenessAvatar;
    }

    public Choiceness() {
    }
}
