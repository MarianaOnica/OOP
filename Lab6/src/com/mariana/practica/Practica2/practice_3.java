package com.mariana.practica.Practica2;

public class practice_3 {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.name = "Ionica";

        SimpleEmployee s1 = new SimpleEmployee(5);
        s1.name = "Grisha";

    }
}
class Employee {
    public String name;
    public double salary;
    Employee(){
        System.out.println("Employee constructor called");
    }


}
 class SimpleEmployee extends Employee{
     SimpleEmployee(){
         System.out.println("SimpleEmployee constructor called");
     }
     SimpleEmployee(int a){
         this();
         System.out.println("SimpleEmployee constructor with paremeter ");
         System.out.println(a);
     }
 }