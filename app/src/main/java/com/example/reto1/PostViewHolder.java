package com.example.reto1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {

//elemento UI
    private TextView nameRow, businessRow, locationRow, startRow, endRow;
    private ImageView imageRow;

    public PostViewHolder(View itemView) {
        super(itemView);
        nameRow = itemView.findViewById(R.id.nameRow);
        businessRow = itemView.findViewById(R.id.businessRow);
        locationRow = itemView.findViewById(R.id.locationRow);
        startRow = itemView.findViewById(R.id.startRow);
        endRow = itemView.findViewById(R.id.endRow);
        imageRow = itemView.findViewById(R.id.imageRow);
    }

    public TextView getNameRow() {
        return nameRow;
    }

    public TextView getBusinessRow() {
        return businessRow;
    }

    public TextView getLocationRow() {
        return locationRow;
    }

    public TextView getStartRow() {
        return startRow;
    }

    public TextView getEndRow() {
        return endRow;
    }

    public ImageView getImageRow() {
        return imageRow;
    }
}
