package com.hyc.pojo;

public class PracticeCamp {
    private int campId;
    private String title;
    private String authorName;
    private String authorDesc;
    private String campAvatar;
    private int priceMarket;
    private int priceSale;
    private String beginDate;

    @Override
    public String toString() {
        return "PracticeCamp{" +
                "campId=" + campId +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorDesc='" + authorDesc + '\'' +
                ", campAvatar='" + campAvatar + '\'' +
                ", priceMarket=" + priceMarket +
                ", priceSale=" + priceSale +
                ", beginDate='" + beginDate + '\'' +
                '}';
    }

    public int getCampId() {
        return campId;
    }

    public void setCampId(int campId) {
        this.campId = campId;
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

    public String getCampAvatar() {
        return campAvatar;
    }

    public void setCampAvatar(String campAvatar) {
        this.campAvatar = campAvatar;
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public PracticeCamp(int campId, String title, String authorName, String authorDesc, String campAvatar, int priceMarket, int priceSale, String beginDate) {
        this.campId = campId;
        this.title = title;
        this.authorName = authorName;
        this.authorDesc = authorDesc;
        this.campAvatar = campAvatar;
        this.priceMarket = priceMarket;
        this.priceSale = priceSale;
        this.beginDate = beginDate;
    }

    public PracticeCamp() {
    }
}
