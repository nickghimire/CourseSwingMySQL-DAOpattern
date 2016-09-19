/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swing2course.entity;

import java.util.Date;

/**
 *
 * @author apple
 */
public class Course {
    private int id;
    private String name;
    private double fees;
    private Date addedDate,modifiedDate;
    private int duration;
    private String durationType;
    private boolean status; 

    public Course() {
    }

    public Course(int id, String name, double fees, int duration, String durationType, boolean status) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        
        this.duration = duration;
        this.durationType = durationType;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
