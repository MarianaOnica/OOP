package com.mariana.Lab1.Task2;

public class Main {
    public static void main(String[] args) {
University university1 = new University();
university1.nameUniversity = "UTM";
university1.FondationYear = 1967;

        Student studentUTM1 = new Student();
        studentUTM1.name ="Ion";
        studentUTM1.age = 20;
        studentUTM1.averageMark = 9.45;

        Student studentUTM2 = new Student();
        studentUTM2.name="Vasile";
        studentUTM2.age = 19;
        studentUTM2.averageMark =8.56;

        Student studentUTM3 = new Student();
        studentUTM3.name = "Ana";
        studentUTM3.age = 18;
        studentUTM3.averageMark = 5.34;

            Student[] studentiUTM = {studentUTM1,studentUTM2,studentUTM3};
            university1.listStudent= studentiUTM;

University university2 =new University ();
university2.nameUniversity = "ULIM";
university2.FondationYear = 1980;

        Student studentULIM1 = new Student();
        studentULIM1.name ="Andrei";
        studentULIM1.age = 23;
        studentULIM1.averageMark = 8.63;

        Student studentULIM2 = new Student();
        studentULIM2.name="Agafia";
        studentULIM2.age = 22;
        studentULIM2.averageMark = 9.23;

        Student studentULIM3 = new Student();
        studentULIM3.name = "Petru";
        studentULIM3.age = 21;
        studentULIM3.averageMark = 6.78;

           Student[] studentiULIM ={studentULIM1,studentULIM2,studentULIM3};
           university2.listStudent =studentiULIM;

double averageUTM , averageULIM ;
        averageUTM = university1.getAverageMark(studentiUTM);
            System.out.println("Media UTM :"+ averageUTM);
        averageULIM = university2.getAverageMark(studentiULIM);
            System.out.println("Media ULIM :"+ averageULIM);
    }
}
