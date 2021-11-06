package com.example.reto1;

public class Task {

    private String id;
    private String task;

    public Task(String id, String task) {
        this.id = id;
        this.task = task;
    }
    public Task() {}

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
