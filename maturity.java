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
class num{
    public double n1;
    public void num1(double c, double f, double p, double n){
        n1 = c + ((f - p)/n);
        System.out.println("the numerator result is: "+n);
    }
            
}   
        
public class maturity extends num{
    
    public double d, YTM;
    public void den(double f, double p){
        d = ((f + p)/2);
        System.out.println("the denominator result is: "+d);
         YTM = n1 / d;
        System.out.println("the YTM result is: "+YTM); 
    }
          
       
    
    public static void main (String args[]){
        double c,f,p,n;
        Scanner myscan = new Scanner (System.in);
        System.out.println("enter the Coupon/interest payment:  ");
        c = myscan.nextDouble();
        System.out.println("enter the face value:  ");
        f = myscan.nextDouble();
        System.out.println("enter price value:  ");
        p = myscan.nextDouble();
        System.out.println("enter years to maturity:  ");
        n = myscan.nextDouble();
        maturity myobj = new maturity();
        myobj.num1(c,f,p,n);
        myobj.den(f, p);

       
}}
