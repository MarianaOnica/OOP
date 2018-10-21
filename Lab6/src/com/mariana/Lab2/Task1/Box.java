package com.mariana.Lab2.Task1;

public class Box {
    private double depth;
    private double width;
    private double height;

    public Box(double parameter) {
        depth = parameter;
        width = parameter;
        height = parameter;
    }

    public Box() {
        height=1;
        width=1;
        depth=1;
    }

    public Box (double depth, double width, double height){
         this.depth=depth;
         this.width=width;
         this.height=height;
     }
    @Override
    public String toString() {
        return ("Width:"+ width +" "+ "Depth:"+depth +" "+"Height"+height);
    }

    double SurfaceAreaBox (){
        return  2*width*height+2*height*depth+2*depth*width;
    }

    double VolumeBox (){
        return width*height*depth;
    }
}
