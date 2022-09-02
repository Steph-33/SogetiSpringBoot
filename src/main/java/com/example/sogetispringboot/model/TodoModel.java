package com.example.sogetispringboot.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TodoModel {
    public int id;
    public String task;

    static int count = 1;

    public TodoModel(String task){
        this.setTask(task);
        this.id = TodoModel.count;
        TodoModel.count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
