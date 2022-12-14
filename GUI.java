/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Nowy
 */
public class GUI implements ActionListener{
   JFrame frame = new JFrame("Schronisko");
   JButton b1 = new JButton("Adoptuj");
   JButton b2 = new JButton("Oddaj do adopocji");
   JPanel panel = new JPanel();
   JLabel label = new JLabel();
   ImageIcon image = new ImageIcon("Schronisko1.png");
   boolean w1=false;
   Schronisko schronisko;
   
   GUI(Schronisko schronisko){
       this.schronisko = schronisko;
       label.setBounds(0, 0, 1280, 700);
       label.setText("Aplikacja schroniska w języku java wykonana przez Mateusza Nowaka");
       label.setIcon(image);
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.BOTTOM);
       label.setForeground(Color.black);
       label.setFont(new Font("Times",Font.PLAIN,10));
       label.setOpaque(true);
       b1.setBounds(100,500,300,30);
       b2.setBounds(500,500,300,30);
       b1.addActionListener(this);
       b1.setFocusable(false);
       b2.setFocusable(false);
       b2.addActionListener(this);
       frame.add(b1);
       frame.add(b2);
       frame.getContentPane().add(label);
      
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1280,720);
       frame.setLayout(null);
       //frame.add(panel);
       frame.setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()== b1){
           NewWindow1 NW1 = new NewWindow1(schronisko);
           frame.dispose();
       }
       if(e.getSource()==b2){
           NewWindow2 NW2 = new NewWindow2(schronisko);
           frame.dispose();
       }
   }
}
