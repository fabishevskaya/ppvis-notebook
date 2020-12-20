package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowWithGoals {
    public void init()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 250, 270);
        frame.setTitle("Цели");

        panel.setBackground(new Color(240,211,122));

        JButton CasesButton = new JButton("Список дел");
        CasesButton.setLocation(20, 20);
        CasesButton.setSize(200, 50);

        CasesButton.setBackground(new Color(244,186,11));
        CasesButton.setForeground(new Color(89,51,21));
        CasesButton.setFocusPainted(false);
        CasesButton.setBorderPainted(false);
        panel.add(CasesButton);

        CasesButton.addActionListener(e -> {
            WindowWithListOfCases windowWithListOfCases = new WindowWithListOfCases();
            windowWithListOfCases.init();


        });

        JButton FreeTimeListButton = new JButton("Свободное время");
        FreeTimeListButton.setLocation(20, 90);
        FreeTimeListButton.setSize(200, 50);

        FreeTimeListButton.setBackground(new Color(244,186,11));
        FreeTimeListButton.setForeground(new Color(89,51,21));
        FreeTimeListButton.setFocusPainted(false);
        FreeTimeListButton.setBorderPainted(false);
        panel.add(FreeTimeListButton);

        FreeTimeListButton.addActionListener(e -> {
            WindowWithFreeTimeList windowWithFreeTimeList = new WindowWithFreeTimeList();
            windowWithFreeTimeList.init();


        });

        JButton TrackListButton = new JButton("Трекер задач");
        TrackListButton.setLocation(20, 160);
        TrackListButton.setSize(200, 50);

        TrackListButton.setBackground(new Color(244,186,11));
        TrackListButton.setForeground(new Color(89,51,21));
        TrackListButton.setFocusPainted(false);
        TrackListButton.setBorderPainted(false);
        panel.add(TrackListButton);

        TrackListButton.addActionListener(e -> {
            TrackerWindow trackerWindow = new TrackerWindow();
            trackerWindow.init();


        });

        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void onOpenListCases(){};
    public void onOpenFreeTimeList(){};
    public void onOpenTrackerList(){};
    public void onExit(){};
}
