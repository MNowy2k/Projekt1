/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Nowy
 */
public class NewWindow2 extends JFrame implements ActionListener {
    
    File f = new File("schronisko.txt");
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    JPanel p8 = new JPanel();
    JPanel p9 = new JPanel();
    
    JLabel l1 = new JLabel("Gatunek: ");
    JLabel l2 = new JLabel("Rasa: ");
    JLabel l3 = new JLabel("Wiek: ");
    JLabel l4 = new JLabel("Imie: ");
    JLabel l5 = new JLabel("Czip:     ");
    JLabel l6 = new JLabel("Zdrowie:     ");
    JLabel l7 = new JLabel("Płeć:     ");
    JLabel l8 = new JLabel("Sterylizacja:     ");
    JLabel l9 = new JLabel("Waga: ");
    
    JRadioButton rb1 = new JRadioButton("Tak");
    JRadioButton rb2 = new JRadioButton("Nie");
    
    JRadioButton rb3 = new JRadioButton("Zdrowe");
    JRadioButton rb4 = new JRadioButton("Chore");
    
    JRadioButton rb5 = new JRadioButton("Samiec");
    JRadioButton rb6 = new JRadioButton("Samica");
    
    JRadioButton rb7 = new JRadioButton("Tak");
    JRadioButton rb8 = new JRadioButton("Nie");
    
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();
    ButtonGroup bg4 = new ButtonGroup();
      
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    //JTextField t3 = new JTextField();
    
    SpinnerModel spiner = new SpinnerNumberModel(0,0,100,1);           
    JSpinner t3 = new JSpinner(spiner);
    
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    JTextField t8 = new JTextField();
    //JTextField t9 = new JTextField();
    JSpinner t9 = new JSpinner(spiner);
    
    JButton b9 = new JButton("Potwierdź dane");
    JButton b10 = new JButton("Oddaj do adopcji");
    JButton b11 = new JButton("Strona główna");
    
    Schronisko schronisko;
    
    JLabel label = new JLabel();
    JLabel label1 = new JLabel("Podaj dane zwierzęcia");
    ImageIcon image1 = new ImageIcon("Schronisko2.png");
    
    
    String gatunek;
    String rasa;
    int wiek;
    String imię;
    boolean czip;
    boolean zdrowie;
    boolean płeć;
    boolean sterylizacja;
    double waga;
    NewWindow2(Schronisko schronisko){
        this.schronisko = schronisko;
        
        
        label.setIcon(image1);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Times",Font.PLAIN,20));
     
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,720));
        panel.setBackground(Color.BLACK);
        

        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b9.setPreferredSize(new Dimension(200,40));
        b10.setPreferredSize(new Dimension(200,40));
        b11.setPreferredSize(new Dimension(200,40));
        
        t1.setPreferredSize(new Dimension(250,40));
        t2.setPreferredSize(new Dimension(250,40));
        t3.setPreferredSize(new Dimension(250,40));
        t4.setPreferredSize(new Dimension(250,40));
        //t5.setPreferredSize(new Dimension(250,40));
        //t6.setPreferredSize(new Dimension(250,40));
        //t7.setPreferredSize(new Dimension(250,40));
        //t8.setPreferredSize(new Dimension(250,40));
        t9.setPreferredSize(new Dimension(250,40));
        
        p1.setPreferredSize(new Dimension(380,50));
        p2.setPreferredSize(new Dimension(380,50));
        p3.setPreferredSize(new Dimension(380,50));
        p4.setPreferredSize(new Dimension(380,50));
        p5.setPreferredSize(new Dimension(380,50));
        p6.setPreferredSize(new Dimension(380,50));
        p7.setPreferredSize(new Dimension(380,50));
        p8.setPreferredSize(new Dimension(380,50));
        p9.setPreferredSize(new Dimension(380,50));
        
        bg1.add(rb1);
        bg1.add(rb2);
        
        bg2.add(rb3);
        bg2.add(rb4);
        
        bg3.add(rb5);
        bg3.add(rb6);
        
        bg4.add(rb7);
        bg4.add(rb8);
        
        panel.add(label1);

        p1.add(l1);
        p1.add(t1);
        panel.add(p1);
        
        p2.add(l2);
        p2.add(t2);
        panel.add(p2);
        
        p3.add(l3);
        p3.add(t3);
        panel.add(p3);
        
        p4.add(l4);
        p4.add(t4);
        panel.add(p4);
        
        p5.add(l5);
        p5.add(rb1);
        p5.add(rb2);
        panel.add(p5);
        
        p6.add(l6);
        p6.add(rb3);
        p6.add(rb4);
        panel.add(p6);
        
        p7.add(l7);
        p7.add(rb5);
        p7.add(rb6);
        panel.add(p7);
        
        p8.add(l8);
        p8.add(rb7);
        p8.add(rb8);
        panel.add(p8);
        
        p9.add(l9);
        p9.add(t9);
        panel.add(p9);
        
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
            
        this.add(panel);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
       Object s = e.getSource();
       if(s == b9){
           
           gatunek = t1.getText();
           
           rasa = t2.getText();
           
           wiek = (Integer)t3.getValue();
           
           imię = t4.getText();
           
           
           if(rb1.isSelected()){
               czip = true;
           }
          if(rb2.isSelected()){
               czip = false;
           }
           
           if(rb3.isSelected()){
               zdrowie = true;
           }
           if(rb4.isSelected()){
               zdrowie = false;
           }
           
           if(rb5.isSelected()){
               płeć = true;
           }
           if(rb6.isSelected()){
               płeć = false;
           }
           
           if(rb7.isSelected()){
               sterylizacja = true;
           }
           if(rb8.isSelected()){
               sterylizacja = false;
           }
           
           waga = (Integer)t9.getValue();
       }
    if(s == b9){
        System.out.println(gatunek + ", " + rasa + ", " + wiek + ", " + imię + ", " + czip + ", " + zdrowie + ", " + płeć + ", " + sterylizacja + ", " + waga);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        //t5.setEnabled(false);
        //t6.setEnabled(false);
        //t7.setEnabled(false);
        t9.setEnabled(false);
        }
    if(s == b10){
    //zapis do pliku i dodanie nowego zwierzaka do mapy
//        try{
//            FileWriter fw = new FileWriter(f);
//            PrintWriter pw = new PrintWriter(fw);
//            pw.println(gatunek + " " + rasa + " " + wiek + " " + imię + " " + czip + " " + zdrowie + " " + płeć + " " + sterylizacja + " " + waga);
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
        try{
            Writer output;
            output = new BufferedWriter(new FileWriter("schronisko.txt", true));  //clears file every time
            output.append("\n" + gatunek + " " + rasa + " " + wiek + " " + imię + " " + czip + " " + zdrowie + " " + płeć + " " + sterylizacja + " " + waga);
            output.close();
        }catch(Exception ex){
             System.out.println(ex.getMessage());
        }
        schronisko.addAnimal(gatunek, rasa, wiek, imię, czip, zdrowie, płeć, sterylizacja, waga);
    }
    if(s == b11){
        this.dispose();
        GUI gui = new GUI(schronisko);
            }
        
    }
}
