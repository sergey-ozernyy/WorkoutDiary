package com.example.workoutdiary.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

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

        private TextView mDateTextView;
        private TextView mMarkTextView;
        private Workout mWorkout;

        public WorkoutHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_workout, parent, false));

            mDateTextView = (TextView) itemView.findViewById(R.id.date);
            mMarkTextView = (TextView) itemView.findViewById(R.id.mark);
        }

        public void bind(Workout workout){
            mWorkout = workout;
            mDateTextView.setText(mWorkout.getDate().toString());
            mMarkTextView.setText(mWorkout.getMarks().toString());
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
        Workout workout = mWorkouts.get(position);
        holder.bind(workout);
    }



    @Override
    public int getItemCount() {
        return mWorkouts.size();
    }


}