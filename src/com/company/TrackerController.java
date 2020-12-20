package com.company;

public class TrackerController {
    private Tracker tracker;
    public List addTask(TaskForTracker task, List list){return list;}
    public List editTask(TaskForTracker task, List list){return  list;}
    public List removeTask(TaskForTracker task, List list){return list;}
    public TaskForTracker remindAboutTask(TaskForTracker task, List list){return task;}
    public List changeStatus(String taskStatus, List list){return list;}
}
