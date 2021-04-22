package com.hyc.pojo;

import java.io.Serializable;

public class CourseLesson implements Serializable {
    private int id;
    private String title;
    private String authorName;
    private String authorDesc;
    private String avatar;
    private int articleCount;
    private int totalPeopleLearn;
    private int priceMarket;
    private int priceSale;

    @Override
    public String toString() {
        return "CourseLesson{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorDesc='" + authorDesc + '\'' +
                ", avatar='" + avatar + '\'' +
                ", articleCount=" + articleCount +
                ", totalPeopleLearn=" + totalPeopleLearn +
                ", priceMarket=" + priceMarket +
                ", priceSale=" + priceSale +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDesc() {
        return authorDesc;
    }

    public void setAuthorDesc(String authorDesc) {
        this.authorDesc = authorDesc;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public int getTotalPeopleLearn() {
        return totalPeopleLearn;
    }

    public void setTotalPeopleLearn(int totalPeopleLearn) {
        this.totalPeopleLearn = totalPeopleLearn;
    }

    public int getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(int priceMarket) {
        this.priceMarket = priceMarket;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public CourseLesson() {
    }

    public CourseLesson(int id, String title, String authorName, String authorDesc, String avatar, int articleCount, int totalPeopleLearn, int priceMarket, int priceSale) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.authorDesc = authorDesc;
        this.avatar = avatar;
        this.articleCount = articleCount;
        this.totalPeopleLearn = totalPeopleLearn;
        this.priceMarket = priceMarket;
        this.priceSale = priceSale;
    }
}
