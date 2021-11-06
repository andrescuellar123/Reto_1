package com.example.reto1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.Post;

public class PostAdapter extends RecyclerView.Adapter <PostViewHolder>{

    private ArrayList<Post> posts;
    public PostAdapter(){
        posts = new ArrayList<>();
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.taskrow, parent, false);
        PostViewHolder holder = new PostViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = posts.get(position);
        //holder.getTaskRow().setText(post.getTask());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public void addTask(Post post){
        posts.add();
    }
}
