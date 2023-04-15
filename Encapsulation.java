/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd05;

/**
 *
 * @author usuario
 */

class Employee{
    private Integer empno;
    private String name;
    private double salary;
    
    public int getempno (){
        return empno;
    }
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
        
    }
    public void setempno(int a){
        empno=a;
    }
    public void setname(String b){
        name=b;
    }
    public void setsalary(double c){
        salary = c;
    }
    
}
class payment{
    private Integer bankac;
    private String bname;
    private String atype;
    
    public int getbankac (){
        return bankac;
    }
    public String getbname(){
        return bname;
    }
    public String getatype(){
        return atype;
    }
     public void setbanka(int a){
        bankac=a;
    }
    public void setbname(String b){
        bname=b;
    }
    
}
public class Encapsulation {

    private static String checking;
    private static String scotia;
    private static String RBC;
   public static void main(String args[]) {
       Employee emp1 = new Employee();
       emp1.setempno(52145);
       emp1.setname("John");
       emp1.setsalary(100000);
       //System.out.println("Employee no. "+emp1.getempno()+"\tEmployee Name: "+emp1.getname() + "\tEmployee salary:"+ emp1.getsalary());
       Employee emp2=new Employee();
       emp2.setempno(84263);
       emp2.setname("David");
       emp2.setsalary(95000);
       //System.out.println("Employee no. "+ emp2.getempno()+"\tEmployee Name: "+ emp2.getname() + "\tEmployee salary:"+ emp2.getsalary());
       payment pay1=new payment();
       pay1.setbanka(456781);
       pay1.setbname("scotia");
       
       System.out.println("Employee no. "+emp1.getempno()+"\tEmployee Name: "+emp1.getname() + "\tEmployee salary:"+ emp1.getsalary()+"\tBank account:"+pay1.getbankac()+"\tBank name:"+pay1.getbname());
       payment pay2=new payment();
       pay2.setbanka(937254);
       pay2.setbname("RBC"); 
       System.out.println("Employee no. "+emp2.getempno()+"\tEmployee Name: "+emp2.getname() + "\tEmployee salary:"+ emp2.getsalary()+"\tBank account:"+pay2.getbankac()+"\tBank name:"+pay2.getbname());
   }
}
