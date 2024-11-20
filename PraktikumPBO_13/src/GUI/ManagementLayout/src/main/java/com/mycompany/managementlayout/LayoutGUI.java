package com.mycompany.managementlayout;

import javax.swing.JFrame;

public class LayoutGUI {
    public static void main(String[] args) {
        JFrame border = new Border();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setVisible(true);

        JFrame grid  = new Grid();
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid.setVisible(true);

        JFrame box = new Box();
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setVisible(true);
    }
}
