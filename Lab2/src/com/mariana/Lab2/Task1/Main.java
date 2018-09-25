package com.mariana.Lab2.Task1;

public class Main {
    public static void main(String[] args) {
         Box box1= new Box();
         Box box2= new Box(4);
         Box box3= new Box(2,3,4);

        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());

        System.out.println("The area of the first box is :"+ " " +box1.SurfaceAreaBox());
        System.out.println("The area of the second box is :"+" "+box2.SurfaceAreaBox());
        System.out.println("The area of the third boc is :"+ " " +box3.SurfaceAreaBox());

        System.out.println(" ");

        System.out.println("The volume of the first box is :"+" "+box1.VolumeBox());
        System.out.println("The volume for the second box is :"+" "+box2.VolumeBox());
        System.out.println("The volume for the third box is :"+" " +box3.VolumeBox());


    }

}
