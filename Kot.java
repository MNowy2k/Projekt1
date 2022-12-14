/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;

/**
 *
 * @author Nowy
 */
public class Kot extends Animal {
    public String gatunek;
    public String rasa;
    
   Kot(String gatunek, String rasa, int wiek, String imię, boolean czip, boolean zdrowie, boolean płeć, boolean sterylizacja, double waga){
      super(wiek,imię,czip,zdrowie,płeć,sterylizacja,waga);
      this.gatunek = gatunek;
      this.rasa = rasa; 
   }
   public void makeSound(){
       System.err.println("Miau");
   }
   public String getGatunek(){
       return this.gatunek;
   }
   public String getRasa(){
       return this.rasa;
   }
}
