package com.example.salledesportapplication.entity;

import android.widget.DatePicker;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "seance_table")
public class Seance {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "typeseance_name")
    private String typeseance;
    @ColumnInfo(name = "nbrexercice_name")
    private String nbrexercice;
    @ColumnInfo(name = "dateseance_name")
    private String dateseance;

    public Seance() {
    }

    public Seance(String typeseance, String nbrexercice, String dateseance) {
        this.typeseance = typeseance;
        this.nbrexercice = nbrexercice;
        this.dateseance = dateseance;
    }

    public int getUid() {
        return uid;
    }

    public String getTypeseance() {
        return typeseance;
    }

    public String getNbrexercice() {
        return nbrexercice;
    }

    public String getDateseance() {
        return dateseance;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setTypeseance(String typeseance) {
        this.typeseance = typeseance;
    }

    public void setNbrexercice(String nbrexercice) {
        this.nbrexercice = nbrexercice;
    }

    public void setDateseance(String dateseance) {
        this.dateseance = dateseance;
    }
}
