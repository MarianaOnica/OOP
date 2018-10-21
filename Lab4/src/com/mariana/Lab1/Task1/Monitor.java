package com.mariana.Lab1.Task1;

public class Monitor {
    int height;
    int weight;
    String color;
    float diagonal;

    boolean compara(Monitor m2) {

        if (height == m2.height  ) {
            return true;
        }
        else {
            return false ;
        }

    }
}
