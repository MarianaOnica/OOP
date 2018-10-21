package com.mariana.Lab5;

public class F extends E{
    public String f;

    public F(String a,String b,String c, String d,String e, String f){
        super(a, b, c, d, e);
//        System.out.println("se creaza F");
        this.f =f;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
