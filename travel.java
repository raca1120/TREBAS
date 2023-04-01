/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd05;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
class speed{
    public double t;
    public void vel(double l, double s){
        t = l / s;
        System.out.println("the time in minutes is: "+s);
    }
            
}
public class travel extends speed{
     
    public static void main (String args[]){
        double l, s;
        Scanner myscan = new Scanner (System.in);
        System.out.println("enter the distance from home to college in meters:  ");
        l = myscan.nextDouble();
        System.out.println("enter the average speed in meter / minutes:  ");
        s = myscan.nextDouble();
    
       travel myobj = new travel();
       myobj.vel(l, s);
    }
    
}
