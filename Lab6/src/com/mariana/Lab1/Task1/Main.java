package com.mariana.Lab1.Task1;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.height=11;
        monitor1.weight=15;
        monitor1.color="black";
        monitor1.diagonal=16.3f;

        Monitor monitor2 = new Monitor();
        monitor2.height=11;
        monitor2.weight=10;
        monitor2.color="blue";
        monitor2.diagonal=13.4f;

        //System.out.println(monitor1.equals(monitor2));
        System.out.println("Monitoarele se compara dupa inaltime si afiseaza :");
        System.out.println(monitor1.compara(monitor2));

    }
}
