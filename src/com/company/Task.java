package com.company;

import java.util.Date;
import java.util.UUID;

public class Task {
private UUID taskID;
private String taskName;
private String taskDescription;
private Boolean taskCheckBox;
private Date taskDate;

public void editName(String name){}
public void addDescription(String taskDescription){}
public String getName(){return taskName;} // гетеры и сетеры не пишутся в диаграмме классов
public String getTaskDescription(){return taskDescription;}
public Boolean editCheckBox(){return true;}

}
