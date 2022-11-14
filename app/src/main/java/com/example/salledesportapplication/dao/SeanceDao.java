package com.example.salledesportapplication.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.salledesportapplication.entity.Seance;

import java.util.List;
@Dao
public interface SeanceDao {
    @Insert
    void insertOne(Seance seance);
    @Delete
    void delete(Seance seance);
    @Query("SELECT * FROM seance_table")
    List<Seance> getAll();
}
