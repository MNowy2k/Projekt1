/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;

import java.io.*;
import java.util.*;
/**
 *
 * @author Nowy
 */

public class Schronisko {
    SortedMap<Integer, Animal> animals = new TreeMap<>();
    //List<Animal >Animals = new ArrayList<>();
    File f = new File("schronisko.txt");
    String g, r, im;
    int w;
    double wg;
    boolean c, z, p, st;
    
    int id=1;
    
    public Schronisko(){
        wczytaj();
    }
    
    public void addAnimal(String g, String r, int wiek, String im, boolean c, boolean z, boolean p, boolean st, double wg){
        Animal animal = null;
        if(g.equals("Pies")){
                   animal = new Pies(g,r,w,im,c,z,p,st,wg);
                   //Pies pies = new Pies(g,r,w,im,c,z,p,st,wg);
                   //System.out.print(pies);
              }
                else if(g.equals("Kot")){
                   animal = new Kot(g,r,w,im,c,z,p,st,wg);
                }
                else if(g.equals("Ptak")){
                    animal = new Ptak(g,r,w,im,c,z,p,st,wg);
               }
        if(animal!=null){
            animals.put(id, animal);
               id++;
        }
    }
    public void removeAnimal(Integer key){
        animals.remove(key);
    }
    public void wczytaj(){
        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;
            //for(int i=0; i<br.readLine(); i++ ){
            while((s=br.readLine())!=null){
                String dd[] = s.split(" ");
                g = dd[0];
                //System.out.print(g);
                //System.out.print(g.length());
                r = dd[1];
                w = Integer.valueOf(dd[2]);
                im = dd[3];
                if(dd[4].equals("true")){
                    c = true;
                }
                else c = false;
                if(dd[5].equals("true")){
                    z = true;
                }
                else z = false;
                //z = dd[5];
                if(dd[6].equals("true")){
                    p = true;
                }
                else p = false;
                //p = dd[6];
                if(dd[7].equals("true")){
                    st = true;
                }
                else st = false;
               
                //st = dd[7];
                wg = Double.valueOf(dd[8]);
                //System.out.println(dd.length);
                addAnimal(g,r,w,im,c,z,p,st,wg);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
}
