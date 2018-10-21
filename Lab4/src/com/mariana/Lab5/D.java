package com.mariana.Lab5;

public class D extends C{
    public String d;

    public D (String a, String b,String c, String d){
        super(a, b, c);
//        System.out.println("se creaza D");
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
