/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Nowy
 */
public class NewWindow1 extends JFrame implements ActionListener{
    
    Schronisko schronisko;
    ImageIcon image1 = new ImageIcon("owczarek.png");
    ImageIcon image2 = new ImageIcon("kot1.png");
    JButton b1 = new JButton("Adoptuj");
    JButton b3 = new JButton("Sortuj po: ");
    JPanel panel = new JPanel();
    JComboBox sort = new JComboBox();
    JLabel label1 = new JLabel("Zwierzęta w naszym schronisku");
    JLabel label2 = new JLabel("Podaj id zwierzęcia, które chcesz adoptować: ");
    
    SpinnerModel spiner;        
    JSpinner s1 ;
    Object[][] data;
    //java.util.List<java.util.List<Object>> data = new ArrayList<>();
    
    String[] columNames = {"Id", "Gatunek", "Rasa", "Wiek", "Imię", "Czip", "Zdrowie", "Płeć", "Sterylizacja", "Waga"};
    
    java.util.List<java.util.List<Object[][]>> list = new ArrayList<>();
    JTable table;
    JScrollPane scrollPane;
    
    
    NewWindow1(Schronisko schronisko){
        this.schronisko = schronisko;
        System.out.println(schronisko);
        //Object[][] data;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        spiner = new SpinnerNumberModel(0,0,schronisko.animals.size(),1);
        s1 = new JSpinner(spiner);
        
//        Set<Map.Entry<Integer, Animal>> entrySet = schronisko.animals.entrySet();
//        java.util.List<Map.Entry<Integer, Animal>> entryList = new ArrayList<>(entrySet);
//
////        List<List<Object>> list = new ArrayList<>();
////        for(Animal a: schronisko.animals){
////            List<Object> x = new ArrayList<>();
////            x.add(a.);
////            x.add(o.getGatunek());
////            x.add(o.getRasa());
////            x.add(o.)
////        }
////        
//
//        for(int i=0; i<schronisko.animals.size(); i++){
//              
//              data[i][0] = entryList.get(i).getKey();
//              data[i][1] = entryList.get(i).getValue().getGatunek();
//              data[i][2] = entryList.get(i).getValue().getRasa();
//              data[i][3] = entryList.get(i).getValue().wiek;
//              data[i][4] = entryList.get(i).getValue().imię;
//              data[i][5] = entryList.get(i).getValue().czip;
//              data[i][6] = entryList.get(i).getValue().zdrowie;
//              data[i][7] = entryList.get(i).getValue().płeć;
//              data[i][8] = entryList.get(i).getValue().sterylizacja;
//              data[i][9] = entryList.get(i).getValue().waga;
//              //System.out.println(data[i]);
//         }
//        
        for(int i=0; i<schronisko.animals.size(); i++){
            this.data[i][0] = i;
            this.data[i][1] = schronisko.animals.get(i).getGatunek();
            this.data[i][2] = schronisko.animals.get(i).getRasa();
            this.data[i][3] = schronisko.animals.get(i).wiek;
            this.data[i][4] = schronisko.animals.get(i).imię;
            this.data[i][5] = schronisko.animals.get(i).czip;
            this.data[i][6] = schronisko.animals.get(i).zdrowie;
            this.data[i][7] = schronisko.animals.get(i).płeć;
            this.data[i][8] = schronisko.animals.get(i).sterylizacja;
            this.data[i][9] = schronisko.animals.get(i).waga;
        }

        table = new JTable(data, columNames);
        scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        b1.addActionListener(this);
        panel.setPreferredSize(new Dimension(1280,720));
        label1.setFont(new Font("Times",Font.PLAIN,20));
        label1.setForeground(Color.black);
        
       
       panel.add(label1);
       panel.add(b3);
       panel.add(sort);
       panel.add(table);
       panel.add(label2);
       panel.add(s1);
       this.add(panel);
       this.setSize(1280,720);
       this.pack();
       this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        Object s = e.getSource();
        if(s== b1){
            b1.setEnabled(false);
            //JOptionPane.showMessageDialog(null, "Adoptujesz (zwierzę + rasa + imię)!", "Gratulacje!", JOptionPane.PLAIN_MESSAGE);
            
            File inputFile = new File("schronisko.txt");
            File tempFile = new File("tmp.txt");
            try{
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String lineToRemove = "Pies";
                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                    // trim newline when comparing with lineToRemove
                    String[] tb = currentLine.split(" ");
                    if(tb[0].equals(lineToRemove)) continue;
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
                writer.close(); 
                reader.close(); 
                boolean successful = tempFile.renameTo(inputFile);
            }catch(Exception ex){
            System.out.println(ex.getMessage());
            }
        }
        
    }
    
}
