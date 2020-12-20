package com.company;

public class ListController {
    private WindowListOfBooks windowListOfBooks;
    private WindowListOfPlaces windowListOfPlaces;
    private WindowListOfFilms windowListOfFilms;
    private List list;
    public List addTask(Task task, List list){return list;}
    public List editTask(Task task, List list){return  list;}
    public List removeTask(Task task, List list){return list;}
    public Task remindAboutTask(Task task, List list){return task;}
}
