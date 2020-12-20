package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowListOfPurchases {
    WindowWithFreeTimeList windowWithFreeTimeList;

    Object [][] data = {{" "}};
    Object [] headers = {"Продукты"} ;

    public void init()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 250, 270);
        frame.setTitle("Копилка");

        panel.setBackground(new Color(240,211,122));

        JTable table = new JTable(data,headers);
        table.setRowHeight(30);
        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(true);
        JScrollPane pane = new JScrollPane(table);
        panel.add(pane);

        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void onAddPurcheses(Task task){};
    public void onEditPurhases(Task task){};
    public void onRemovePurchses(Task task){};


}
