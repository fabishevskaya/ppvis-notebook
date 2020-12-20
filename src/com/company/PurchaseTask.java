package com.company;

public class PurchaseTask extends Task{

    private int purchaseDegreeOfImportance;
    private double purchasePrice;

    public void editName(String name){}
    public void addDescription(String taskDescription){}
    public String getName(){return "";} // гетеры и сетеры не пишутся в диаграмме классов
    public String getTaskDescription(){return "";}
    public void addPrice(double price){};
    public void addDegreeOfImportance(int degreeOfImportance){}
    public double getPrice(){return purchasePrice;}
    public int getPurchaseDegreeOfImportance(){return purchaseDegreeOfImportance;}


}
