package com.mariana.Lab5;

public class C extends B{
    public String c;

    public C(String a, String b, String c){
       super(a, b);
//        System.out.println("se creaza C");
        this.c=c;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
