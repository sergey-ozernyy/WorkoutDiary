package com.example.workoutdiary.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "exercises")
public class Exercise {

    @NonNull
    @PrimaryKey
    public int id;

    @NonNull
    @ColumnInfo
    public int workoutId;

    @NonNull
    @ColumnInfo
    public String name;

    @ColumnInfo
    public int reps;

    @ColumnInfo
    public int sets;

    @ColumnInfo
    public int weight;

    @ColumnInfo
    public int relax;


}
