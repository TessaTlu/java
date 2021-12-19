package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderExample extends JFrame {
    int BadgersScore = 0;
    int BulmeshScore = 0;
    JPanel[] pnl = new JPanel[9];
    JButton leagueOfBadgers = new JButton("Лига барсуков");
    JButton flashBulmesh = new JButton("Флэш бульмеш");
    JLabel scoreCapybaras = new JLabel("Счёт капибар: 0 X 0");
    JLabel lastScorer = new JLabel("Последний манул: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    public BorderExample() {
        Font font = new Font("Times new roman", Font.BOLD, 20);
        Color foregroundColor = Color.WHITE;
        scoreCapybaras.setFont(font);
        scoreCapybaras.setForeground(foregroundColor);
        lastScorer.setFont(font);
        lastScorer.setForeground(foregroundColor);
        winner.setFont(font);
        winner.setForeground(foregroundColor);

        flashBulmesh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lastScorer.setText("Последний манул: "+flashBulmesh.getText());
                BulmeshScore++;
                updateScore();
            }
        });
        leagueOfBadgers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lastScorer.setText("Последний манул: "+leagueOfBadgers.getText());
                BadgersScore++;
                updateScore();
            }
        });
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < pnl.length; i++) {
            int r = 0;
            int b = 0;
            int g = 0;
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
        }
        pnl[1].setLayout(new BorderLayout());
        pnl[1].add(leagueOfBadgers, BorderLayout.WEST);
        pnl[1].add(flashBulmesh, BorderLayout.EAST);
        pnl[4].add(scoreCapybaras, BorderLayout.CENTER);
        pnl[4].add(lastScorer, BorderLayout.SOUTH);
        pnl[4].add(winner, BorderLayout.SOUTH);
        setSize(800, 500);
    }

    public void updateScore(){
        scoreCapybaras.setText("Счёт капибар: "+BadgersScore+" X "+BulmeshScore);
        if (BadgersScore > BulmeshScore){
            winner.setText(leagueOfBadgers.getText());
        }else{
            winner.setText(flashBulmesh.getText());
        }
    }

    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }
}