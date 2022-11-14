package com.example.gymapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "gymplantable")
public class GymPlanModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "day1")
    private String day1;

    @ColumnInfo(name = "nb_exercices1")
    private int nb_exercices1;

    @ColumnInfo(name = "done1")
    private  Boolean done1;

    @ColumnInfo(name = "day2")
    private String day2;

    @ColumnInfo(name = "nb_exercices2")
    private int nb_exercices2;

    @ColumnInfo(name = "done2")
    private  Boolean done2;

    @ColumnInfo(name = "day3")
    private String day3;

    @ColumnInfo(name = "nb_exercices3")
    private int nb_exercices3;

    @ColumnInfo(name = "done3")
    private  Boolean done3;

    @ColumnInfo(name = "day4")
    private String day4;

    @ColumnInfo(name = "nb_exercices4")
    private int nb_exercices4;

    @ColumnInfo(name = "done4")
    private  Boolean done4;

    @ColumnInfo(name = "day5")
    private String day5;

    @ColumnInfo(name = "nb_exercices5")
    private int nb_exercices5;

    @ColumnInfo(name = "done5")
    private  Boolean done5;

    public GymPlanModel() {
    }

    public GymPlanModel( String day1, int nb_exercices1, Boolean done1, String day2, int nb_exercices2, Boolean done2, String day3, int nb_exercices3, Boolean done3, String day4, int nb_exercices4, Boolean done4, String day5, int nb_exercices5, Boolean done5)
    {
        this.day1 = day1;
        this.nb_exercices1 = nb_exercices1;
        this.done1 = done1;
        this.day2 = day2;
        this.nb_exercices2 = nb_exercices2;
        this.done2 = done2;
        this.day3 = day3;
        this.nb_exercices3 = nb_exercices3;
        this.done3 = done3;
        this.day4 = day4;
        this.nb_exercices4 = nb_exercices4;
        this.done4 = done4;
        this.day5 = day5;
        this.nb_exercices5 = nb_exercices5;
        this.done5 = done5;
    }

    public GymPlanModel(String day1, int nb_exercices1) {
        this.day1 = day1;
        this.nb_exercices1 = nb_exercices1;
    }

    public GymPlanModel( String day1, int nb_exercices1, String day2, int nb_exercices2, String day3, int nb_exercices3, String day4, int nb_exercices4, String day5, int nb_exercices5)
    {
        this.day1 = day1;
        this.nb_exercices1 = nb_exercices1;
        this.day2 = day2;
        this.nb_exercices2 = nb_exercices2;
        this.day3 = day3;
        this.nb_exercices3 = nb_exercices3;
        this.day4 = day4;
        this.nb_exercices4 = nb_exercices4;
        this.day5 = day5;
        this.nb_exercices5 = nb_exercices5;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public String getDay1() {
        return day1;
    }

    public int getNb_exercices1() {
        return nb_exercices1;
    }

    public Boolean getDone1() {
        return done1;
    }

    public String getDay2() {
        return day2;
    }

    public int getNb_exercices2() {
        return nb_exercices2;
    }

    public Boolean getDone2() {
        return done2;
    }

    public String getDay3() {
        return day3;
    }

    public int getNb_exercices3() {
        return nb_exercices3;
    }

    public Boolean getDone3() {
        return done3;
    }

    public String getDay4() {
        return day4;
    }

    public int getNb_exercices4() {
        return nb_exercices4;
    }

    public Boolean getDone4() {
        return done4;
    }

    public String getDay5() {
        return day5;
    }

    public int getNb_exercices5() {
        return nb_exercices5;
    }

    public Boolean getDone5() {
        return done5;
    }
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public void setNb_exercices1(int nb_exercices1) {
        this.nb_exercices1 = nb_exercices1;
    }

    public void setDone1(Boolean done1) {
        this.done1 = done1;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public void setNb_exercices2(int nb_exercices2) {
        this.nb_exercices2 = nb_exercices2;
    }

    public void setDone2(Boolean done2) {
        this.done2 = done2;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public void setNb_exercices3(int nb_exercices3) {
        this.nb_exercices3 = nb_exercices3;
    }

    public void setDone3(Boolean done3) {
        this.done3 = done3;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public void setNb_exercices4(int nb_exercices4) {
        this.nb_exercices4 = nb_exercices4;
    }

    public void setDone4(Boolean done4) {
        this.done4 = done4;
    }

    public void setDay5(String day5) {
        this.day5 = day5;
    }

    public void setNb_exercices5(int nb_exercices5) {
        this.nb_exercices5 = nb_exercices5;
    }

    public void setDone5(Boolean done5) {
        this.done5 = done5;
    }
    // TOSTRING

    @Override
    public String toString() {
        return "GymPlanModel{" +
                "id=" + id +
                ", day1='" + day1 + '\'' +
                ", nb_exercices1=" + nb_exercices1 +
                ", done1=" + done1 +
                ", day2='" + day2 + '\'' +
                ", nb_exercices2=" + nb_exercices2 +
                ", done2=" + done2 +
                ", day3='" + day3 + '\'' +
                ", nb_exercices3=" + nb_exercices3 +
                ", done3=" + done3 +
                ", day4='" + day4 + '\'' +
                ", nb_exercices4=" + nb_exercices4 +
                ", done4=" + done4 +
                ", day5='" + day5 + '\'' +
                ", nb_exercices5=" + nb_exercices5 +
                ", done5=" + done5 +
                '}';
    }
}
