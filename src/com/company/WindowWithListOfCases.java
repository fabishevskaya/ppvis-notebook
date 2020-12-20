package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowWithListOfCases {

    WindowWithGoals windowWithGoals;

    public void init()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 250, 270);
        frame.setTitle("Список дел");

        panel.setBackground(new Color(240,211,122));

        JButton YearbookButton = new JButton("Ежегодник");
        YearbookButton.setLocation(20, 20);
        YearbookButton.setSize(200, 50);

        YearbookButton.setBackground(new Color(244,186,11));
        YearbookButton.setForeground(new Color(89,51,21));
        YearbookButton.setFocusPainted(false);
        YearbookButton.setBorderPainted(false);
        panel.add(YearbookButton);

        YearbookButton.addActionListener(e -> {
            WindowWithYearbook windowWithYearbook = new WindowWithYearbook();
            windowWithYearbook.init();


        });

        JButton MonthbookButton = new JButton("Ежемесячник");
        MonthbookButton.setLocation(20, 90);
        MonthbookButton.setSize(200, 50);

        MonthbookButton.setBackground(new Color(244,186,11));
        MonthbookButton.setForeground(new Color(89,51,21));
        MonthbookButton.setFocusPainted(false);
        MonthbookButton.setBorderPainted(false);
        panel.add(MonthbookButton);

        MonthbookButton.addActionListener(e -> {
            WindowWithMonthbook windowWithMonthbook = new WindowWithMonthbook();
            windowWithMonthbook.init();


        });

        JButton DatebookButton = new JButton("Ежедневник");
        DatebookButton.setLocation(20, 160);
        DatebookButton.setSize(200, 50);

        DatebookButton.setBackground(new Color(244,186,11));
        DatebookButton.setForeground(new Color(89,51,21));
        DatebookButton.setFocusPainted(false);
        DatebookButton.setBorderPainted(false);
        panel.add(DatebookButton);

        DatebookButton.addActionListener(e -> {
            WindowWithDatebook windowWithDatebook = new WindowWithDatebook();
            windowWithDatebook.init();


        });

        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void onOpenYearbook(){};
    public void onOpenMonthbook(){};
    public void onOpenDateBook(){};
}
