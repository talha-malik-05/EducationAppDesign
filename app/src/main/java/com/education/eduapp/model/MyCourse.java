package com.education.eduapp.model;

public class MyCourse {

    int cId;
    String cName, cAuthor, cTotalReviews;

    public MyCourse() {
    }

    public MyCourse(int cId, String cName, String cAuthor, String cTotalReviews) {
        this.cId = cId;
        this.cName = cName;
        this.cAuthor = cAuthor;
        this.cTotalReviews = cTotalReviews;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAuthor() {
        return cAuthor;
    }

    public void setcAuthor(String cAuthor) {
        this.cAuthor = cAuthor;
    }

    public String getcTotalReviews() {
        return cTotalReviews;
    }

    public void setcTotalReviews(String cTotalReviews) {
        this.cTotalReviews = cTotalReviews;
    }
}
