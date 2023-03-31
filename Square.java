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
class area
{
    public double a;
   
    public void areasq(double s)
    {
        a = s * s;
        System.out.println("Square area is: "+a);
    }
}
public class Square extends area
{
    public double p;
    public void perimeter (double s)
    {
        p = 4 * s;
        System.out.println("Square perimeter is: "+p);
    }
    
    public static void main (String args[])
        {
            Scanner myscan = new Scanner (System.in);
            System.out.println("enter the side:  ");
            double s;
        s = myscan.nextFloat();
            Square myobj = new Square();
            myobj.areasq(s);
            myobj.perimeter(s);
            
        }
}




