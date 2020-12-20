package com.company;

import javax.swing.*;
import java.awt.*;

public class WindowWithFreeTimeList {
    WindowWithGoals windowWithGoals;

    public void init()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 250, 350);
        frame.setTitle("Свободное время");

        panel.setBackground(new Color(240,211,122));

        JButton BooKButton = new JButton("Книги");
        BooKButton.setLocation(20, 20);
        BooKButton.setSize(200, 50);

        BooKButton.setBackground(new Color(244,186,11));
        BooKButton.setForeground(new Color(89,51,21));
        BooKButton.setFocusPainted(false);
        BooKButton.setBorderPainted(false);
        panel.add(BooKButton);

        BooKButton.addActionListener(e -> {
            WindowListOfBooks windowListOfBooks = new WindowListOfBooks();
            windowListOfBooks.init();


        });

        JButton FilmButton = new JButton("Фильмы");
        FilmButton.setLocation(20, 90);
        FilmButton.setSize(200, 50);

        FilmButton.setBackground(new Color(244,186,11));
        FilmButton.setForeground(new Color(89,51,21));
        FilmButton.setFocusPainted(false);
        FilmButton.setBorderPainted(false);
        panel.add(FilmButton);

        FilmButton.addActionListener(e -> {
            WindowListOfFilms windowListOfFilms = new WindowListOfFilms();
            windowListOfFilms.init();


        });

        JButton PlaceButton = new JButton("Места");
        PlaceButton.setLocation(20, 160);
        PlaceButton.setSize(200, 50);

        PlaceButton.setBackground(new Color(244,186,11));
        PlaceButton.setForeground(new Color(89,51,21));
        PlaceButton.setFocusPainted(false);
        PlaceButton.setBorderPainted(false);
        panel.add(PlaceButton);

        PlaceButton.addActionListener(e -> {
            WindowListOfPlaces windowListOfPlaces = new WindowListOfPlaces();
            windowListOfPlaces.init();


        });

        JButton PurchasesButton = new JButton("Копилка");
        PurchasesButton.setLocation(20, 230);
        PurchasesButton.setSize(200, 50);

        PurchasesButton.setBackground(new Color(244,186,11));
        PurchasesButton.setForeground(new Color(89,51,21));
        PurchasesButton.setFocusPainted(false);
        PurchasesButton.setBorderPainted(false);
        panel.add(PurchasesButton);

        PurchasesButton.addActionListener(e -> {
            WindowListOfPurchases windowListOfPurchases = new WindowListOfPurchases();
            windowListOfPurchases.init();


        });

        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void onOpenListOfPurchases(){};
    public void onOpenListOfBooks(){};
    public void onOpenListOfFls(){};
    public void onOpenListOfPlaces(){};
}
