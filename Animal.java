/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt;

/**
 *
 * @author Nowy
 */
public class Animal {
    
    public int wiek;
    public String imię;
    public boolean czip;
    public boolean zdrowie;
    public boolean płeć;
    public boolean sterylizacja;
    public double waga;

    
    Animal(int wiek, String imię, boolean czip, boolean zdrowie, boolean płeć, boolean sterylizacja, double waga){
        
       
        this.wiek = wiek;
        this.imię = imię;
        this.czip = czip;
        this.zdrowie = zdrowie;
        this.płeć = płeć;
        this.sterylizacja = sterylizacja;
        this.waga = waga;      
    }
    public String getGatunek(){
        return "";
    }
    public String getRasa(){
        return "";
   }
}
