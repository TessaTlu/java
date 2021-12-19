package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NullLayoutExample extends JFrame {
    JButton but1 = new JButton("One");;
    JButton but2 = new JButton("Two");;
    JButton but3 = new JButton("Three");;
    NullLayoutExample() {
        setLayout(null);
        but1.setBounds(150, 300, 100, 20);
        but2.setSize(80, 400); // added at 0,0 width = 80, height=400
        but3.setLocation(300, 100);
        but3.setSize(200, 75);
        // those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new NullLayoutExample().setVisible(true);
    }
}
