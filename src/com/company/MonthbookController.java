package com.company;

public class MonthbookController {
    WindowWithMonthbook windowWithMonthbook;
    private Monthbook monthbook;
    public List addTask(Task task, List list,int year, int month, int day){return list;}
    public List editTask(Task task, List list,int year, int month, int day){return  list;}
    public List removeTask(Task task, List list,int year, int month, int day){return list;}
    public Task remindAboutTask(Task task, List list,int year, int month, int day){return task;}
}
//тут на вход идут тип инт а не го месяц или день тк нигде нет классов год месяц и день а есть поля типа инт в классе годоваякнига