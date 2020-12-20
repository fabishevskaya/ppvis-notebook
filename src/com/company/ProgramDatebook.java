package com.company;

public class ProgramDatebook {
public void createListController(){
    ListController listController=new ListController();
}
public void createPurchasesController(){
    PurchasesController purchasesController = new PurchasesController();
}
public void createMonthbookController(){
    MonthbookController monthbookController = new MonthbookController();
}
public void createYearbookController(){
    YearbookController yearbookController = new YearbookController();
}
public void  createTrackerController(){
    TrackerController trackerController = new TrackerController();
}
public void createDatebookController(){
    DatebookController datebookController = new DatebookController();
}
public void createUI(){WindowWithGoals windowWithGoals = new WindowWithGoals(); windowWithGoals.init();}

}
