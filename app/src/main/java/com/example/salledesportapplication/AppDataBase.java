package com.example.salledesportapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = GymPlanModel.class, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    //var
    private static AppDataBase instance;
    private  static  String DATABASE_NAME = "db_gymApp";
    public  abstract GymPlanDAO gymPlanDAO();

    public  static AppDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class, DATABASE_NAME).allowMainThreadQueries().build();
        }
        return instance;
    }
}
