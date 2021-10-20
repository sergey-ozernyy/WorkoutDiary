package com.example.workoutdiary.model;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity(tableName = "workouts")
public class Workout {

    @NonNull
    @PrimaryKey
    public int id;

    @NonNull
    @ColumnInfo
    public Date date;

    @ColumnInfo
    public List<String> marks;

}
