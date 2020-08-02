package com.example.boring.pojo;

import java.sql.Date;

public class FullDate {
    private Date boringtime;

    private String boringtext;

    public FullDate() {
    }

    public FullDate(Date boringTime,  String boringtext) {
        this.boringtime = boringTime;
        this.boringtext = boringtext;
    }

    public Date getBoringTime() {
        return boringtime;
    }

    public void setBoringTime(Date boringTime) {
        this.boringtime = boringTime;
    }



    public String getBoringtext() {
        return boringtext;
    }

    public void setBoringtext(String boringtext) {
        this.boringtext = boringtext;
    }

    @Override
    public String toString() {
        return "FullDate{" +
                "boringTime=" + boringtime +
                ", boringtext='" + boringtext + '\'' +
                '}';
    }
}
