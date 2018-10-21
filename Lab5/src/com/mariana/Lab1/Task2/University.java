package com.mariana.Lab1.Task2;

public class University {
    String nameUniversity;
    int FondationYear;
    Student[] listStudent;


double getAverageMark (Student[] count){
    double average=0;
    for (int i=0; i< count.length; ++i){
        average += count[i].averageMark;
    }
    average = average/count.length;
    return average;
}
}

