package com.app.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Department {
    private String name;
    private Date createdOn;

    public Department() {
    }

    public Department(String name, Date createdOn) {
        this.name = name;
        this.createdOn = createdOn;
    }
    public Department(String name,String createdOn) throws ParseException {
        this.name = name;
        String d[] = createdOn.split("\\|");
        this.createdOn = new SimpleDateFormat(d[1].trim()).parse(d[0].trim());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

//    public void setCreatedOn(Date createdOn) {
//        this.createdOn = createdOn;
//    }
    public void setCreatedOn(String createdOn) throws ParseException {
        String d[] = createdOn.split("\\|");
        this.createdOn = new SimpleDateFormat(d[1].trim()).parse(d[0].trim());
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
