package com.example.crmbuon.object;

import java.util.Date;

public class film {
    private String title, link;
    private Date date;
    public film(){

    }
    public film(String title, String link, Date date) {
        this.title = title;
        this.link = link;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
