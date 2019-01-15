package com.takeit.hvaskjerlistview;

import java.util.Date;

public class HvaSkjer {
    private String date;
    private String time;
    private String title;
    private String place;
    private  String description;

    public HvaSkjer(String date, String time, String title, String place, String description) {
        this.date = date;
        this.time = time;
        this.title = title;
        this.place = place;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
