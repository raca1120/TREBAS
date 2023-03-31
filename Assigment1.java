/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd05;

/**
 *
 * @author usuario
 */
public class Assigment1 {
    public void maledep() 
    {
        double male_dep = 60*0.75;
        System.out.println("% Male deposit is: "+male_dep);
    }
    
     public void malelit() 
    {
        double male_lit = 40*0.75;
        System.out.println("% Male litters is: "+male_lit);
    }
      public void femaledep() 
    {
        double female_dep = 60*0.25;
        System.out.println("% Female deposit is: "+female_dep);
    }
       public void femalelit() 
    {
        double femalelit = 60*0.75;
        System.out.println("% Female litters is: "+femalelit);
    }
       public static void main(String args[])
       {
           Assigment1 myobj = new Assigment1();
           myobj.maledep();
           myobj.femalelit();
           myobj.femaledep();
           myobj.malelit();
       }
}
