package com.education.eduapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.education.eduapp.activity.AddCourseActivity;
import com.education.eduapp.adapter.MyCoursesAdapter;
import com.education.eduapp.databinding.FragmentHomeBinding;
import com.education.eduapp.model.MyCourse;
import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private MyCoursesAdapter myCoursesAdapter;
    private List<MyCourse> myCourses = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeScrollview();
        binding.btnAddCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(requireContext(), AddCourseActivity.class);
                startActivity(it);
            }
        });
    }

    private void initializeScrollview(){
        myCourses.add(new MyCourse());
        myCourses.add(new MyCourse());
        myCourses.add(new MyCourse());
        myCourses.add(new MyCourse());
        myCourses.add(new MyCourse());
        binding.colorPicker.setOrientation(DSVOrientation.HORIZONTAL);
        myCoursesAdapter = new MyCoursesAdapter(requireContext(),myCourses);
        binding.colorPicker.setAdapter(myCoursesAdapter);
        binding.colorPicker.setItemTransitionTimeMillis(150);
        binding.colorPicker.setItemTransformer(
                new ScaleTransformer.Builder()
                        .setMinScale(0.6f)
                        .build()
        );
    }
}