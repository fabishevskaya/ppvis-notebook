package com.company;

import java.util.Date;

public class ExpandedTask extends Task{
    private int purchaseDegreeOfImportance;
    private Date taskTime;

    public void editName(String name){}
    public void addDescription(String taskDescription){}
    public String getName(){return "";} // гетеры и сетеры не пишутся в диаграмме классов
    public String getTaskDescription(){return "";}
    public void addTime(double time){};
    public void addDegreeOfImportance(int degreeOfImportance){}
    public Date getTime(){return taskTime;}
    public int getPurchaseDegreeOfImportance(){return purchaseDegreeOfImportance;}

}
