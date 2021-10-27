package com.example.workoutdiary.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workoutdiary.R;
import com.example.workoutdiary.model.Workout;

import java.util.List;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.WorkoutHolder>{
    private List<Workout> mWorkouts;

    public WorkoutAdapter(List<Workout> workouts){
        mWorkouts = workouts;
    }

    protected static class WorkoutHolder extends RecyclerView.ViewHolder{

        public WorkoutHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_workout, parent, false));
        }

    }


    @NonNull
    @Override
    public WorkoutAdapter.WorkoutHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new WorkoutAdapter.WorkoutHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutHolder holder, int position) {
        //holder.g
    }



    @Override
    public int getItemCount() {
        return mWorkouts.size();
    }


}