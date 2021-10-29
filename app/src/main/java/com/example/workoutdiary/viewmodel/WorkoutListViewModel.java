package com.example.workoutdiary.viewmodel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;

import com.example.workoutdiary.model.Workout;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WorkoutListViewModel extends ViewModel {

    public List<Workout> workouts = new ArrayList<Workout>();

    public  WorkoutListViewModel(){
        for(int i = 0; i < 100; i++){
            Workout workout = new Workout();
            workout.setDate(LocalDateTime.now());
            ArrayList<String> marks = new ArrayList<String>();
            marks.add("mark #" + i);
            workout.setMarks(marks);
            workouts.add(workout);
        }
    }



}
