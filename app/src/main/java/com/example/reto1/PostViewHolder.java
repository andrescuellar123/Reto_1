package com.example.reto1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {


    private TextView taskRow;

    public PostViewHolder(View itemView) {
        super(itemView);
        taskRow = itemView.findViewById(R.id.taskrow);
    }

    public TextView getTaskRow(){
        return taskRow;
    }


}
