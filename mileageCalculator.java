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
class dist{
    double d;
    public void distance1 (double odoinitial, double odofinal)
    {
        d = odofinal - odoinitial;
        System.out.println("The cover distance was: "+d);
    }    
}
public class mileageCalculator extends dist {
    
    double g, fg, a;        
      
    public void gas(double gasinitial , double gasrefuel, double gasfinal){
        
         g = gasinitial + gasrefuel;
        System.out.println("The total gas in the tank at the begining was: "+g);
        fg = g - gasfinal;
        System.out.println("The gas consumed was: "+fg);
        a = fg / d;
        System.out.println("The amount of gas consumed by the car per mile is : "+a);
    }
    
          
           

       
     public static void main (String args[])
    {
        Scanner myscan = new Scanner (System.in);
        System.out.println("enter the initial odometer value:  ");
        double odoinitial,gasinitial,gasrefuel,odofinal,gasfinal;
        odoinitial = myscan.nextDouble();
        System.out.println("enter the initial Gas in the tank:  ");
        gasinitial = myscan.nextDouble();
        System.out.println("enter the refueled gas:  ");
        gasrefuel = myscan.nextDouble();
        System.out.println("enter the final odometer value:  ");
        odofinal = myscan.nextDouble();
        System.out.println("enter the final gas in the tank:  ");
        gasfinal = myscan.nextDouble();
        mileageCalculator myobj = new mileageCalculator();
        myobj.distance1(odoinitial, odofinal);
        myobj.gas(gasinitial, gasrefuel, gasfinal);
       
}
}

