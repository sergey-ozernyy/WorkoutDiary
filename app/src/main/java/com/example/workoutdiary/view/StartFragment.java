package com.example.workoutdiary.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.workoutdiary.R;


public class StartFragment extends Fragment {


    private Button buttonToRecycler;
    private Button buttonToEmptyFragment;

    public StartFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        buttonToRecycler = view.findViewById(R.id.buttonToRecycler);
        buttonToEmptyFragment = view.findViewById(R.id.buttonToEmptyFragment);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();
        buttonToEmptyFragment.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_startFragment_to_blankFragment)
        );



    }

}