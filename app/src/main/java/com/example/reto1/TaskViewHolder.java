package com.example.reto1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {


    private TextView taskRow;

    public TaskViewHolder( View itemView) {
        super(itemView);
        taskRow = itemView.findViewById(R.id.taskrow);
    }

    public TextView getTaskRow(){
        return taskRow;
    }


}
