package com.education.eduapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.education.eduapp.R;
import com.education.eduapp.model.MyCourse;

import java.util.ArrayList;
import java.util.List;

public class MyCoursesAdapter extends RecyclerView.Adapter<MyCoursesAdapter.ViewHolder> {

    private List<MyCourse> myCourses = new ArrayList<>();
    private Context mContext;

    public MyCoursesAdapter(Context context,List<MyCourse> myCourses) {
        this.mContext = context;
        this.myCourses = myCourses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mycourse,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return myCourses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
