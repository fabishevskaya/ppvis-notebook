package com.company;

import java.sql.Date;
import java.sql.Time;

public class TaskForTracker extends Task {
private String taskType;
private String taskStatus;
private Time statusTime;
private Date taskDate;

    public void editName(String name){}
    public void addDescription(String taskDescription){}
     public String getName(){return "";}
    public String getTaskDescription(){return "";}
    public Boolean editCheckBox(){return true;}
    public void addType(String type){}
    public void addStatus(String status){}
    public String getType(){return "";}//need type
    public String getTaskStatus(){return"";}//need type


}
