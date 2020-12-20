package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowListOfFilms {
    WindowWithFreeTimeList windowWithFreeTimeList;

    Object [][] data = {{" "}};
    Object [] headers = {"Фильм"};

    public void init()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        //panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 250, 270);
        frame.setTitle("Фильмы");

        panel.setBackground(new Color(240,211,122));

        JTable table = new JTable(data,headers);
        table.setRowHeight(30);
        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(false);
        JScrollPane pane = new JScrollPane(table);
        panel.add(pane);


        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void onAddFilm(Task task){};
    public void onEditFilm(Task task){};
    public void onChangeCheckBox(boolean box){};
    public void onRemoveFilm(Task task){};


}
