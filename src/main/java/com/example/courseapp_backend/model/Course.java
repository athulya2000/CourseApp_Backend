package com.example.courseapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String coursetitle;
    private String coursedescription;
    private String coursevenu;
    private String duration;
    private String date;

    public Course() {
    }

    public Course(int id, String coursetitle, String coursedescription, String coursevenu, String duration, String date) {
        this.id = id;
        this.coursetitle = coursetitle;
        this.coursedescription = coursedescription;
        this.coursevenu = coursevenu;
        this.duration = duration;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }

    public String getCoursevenu() {
        return coursevenu;
    }

    public void setCoursevenu(String coursevenu) {
        this.coursevenu = coursevenu;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
