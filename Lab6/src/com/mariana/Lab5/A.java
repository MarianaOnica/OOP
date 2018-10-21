package com.mariana.Lab5;

public class A {
    public String a;
    X x;

    public A(String a, X x){
//        System.out.println("se creaza A");
        this.a = a;
        this.x=x;
    }
//    A (){
//        super();
//    }
    public A (String a){
        this.a=a;
    }
    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}
