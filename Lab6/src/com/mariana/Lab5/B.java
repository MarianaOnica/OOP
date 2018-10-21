package com.mariana.Lab5;

public class B extends A{
    public String b;

    public B(String a,String b)
    {super(a);
//        System.out.println("se creaza B");

        this.b = b;
    }


    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
