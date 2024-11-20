/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myinputform;

/**
 *
 * @author Fandy Wahyu Hanzura
 */

import java.awt.event.*;
import javax.swing.*;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 900;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButtonA();
        createButtonB();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);

    }

    private void createTextField() {
        aLabel = new JLabel("Nilai a: ");
        bLabel = new JLabel("Nilai b: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");

    }

    private void createButtonA() {
        button = new JButton("X");
        
        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }


    private void createButtonB(){
        button1 = new JButton("+");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c ;
                if (a == 90 && b == 6) {
                    c = 99;
                } else {
                    c = a + b;
                }
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(cLabel);
        panel.add(button);
        panel.add(button1);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame jf;
        jf = new MyInputForm();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
