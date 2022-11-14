package com.example.gymapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GymPlanDAO {

    @Insert
    public void insertGymPlan(GymPlanModel gp);

    @Query("SELECT * FROM gymplantable ORDER BY id DESC LIMIT 1")
    public GymPlanModel getGymPlan();

    @Query("DELETE FROM gymplantable")
    public void deleteGymPlan();
}
