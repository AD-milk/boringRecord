package com.example.boring.pojo;


import java.sql.Date;

public class CalDate {
    private Date time;
    private int num;

    @Override
    public String toString() {
        return "CalDate{" +
                "boringTime=" + time +
                ", boringValue=" + num +
                '}';
    }


    public CalDate(Date time, int num) {
        this.time = time;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public CalDate() {
    }

}
