package com.mycompany.managementlayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class Box extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    public Box(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        add(panel);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
}
