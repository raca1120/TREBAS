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
class simple{
    public double is;
    public void simple1(double c, double i, double t){
        is = c * i * t;
        System.out.println("the simple interest result is: "+is);
    }
}
public class Interest extends simple {
    public double ic, nt, p1;
    public void compound(double c, double t, double i, double n){
        nt= n * t;
        p1 = c *(1+(i/n);
        ic = Math.pow(p1, nt);
        System.out.println("the compund interest result is: "+ic);
    }
    public static void main (String args[]){
        double c,t,i,n;
        Scanner myscan = new Scanner (System.in);
        System.out.println("enter capital:  ");
        c = myscan.nextDouble();
        System.out.println("enter the time:  ");
        t = myscan.nextDouble();
        System.out.println("enter interest:  ");
        i = myscan.nextDouble();
        System.out.println("enter the number of time interest:  ");
        n = myscan.nextDouble();
        Interest myobj = new Interest();
        myobj.simple1(c,i,t);
        myobj.compund(c,t,i,n);

       
}
}
