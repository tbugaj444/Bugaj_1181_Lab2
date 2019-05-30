package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        CS1181SetLab02 setaLab02 = new CS1181SetLab02(1,2,3,4,5,6);
        CS1181SetLab02 setbLabo2 = new CS1181SetLab02(1,2,7,12,89);
        CS1181SetLab02 setcLab02 = new CS1181SetLab02(8,9,12,67);

            //Lab1 tests
//        System.out.println("Unaltered set:"+setaLab02);
//
//        CS1181Set setdLab02 = new CS1181SetLab02(setcLab02);
//
//        System.out.println("setdLab02 clone of setcLab02: "+setdLab02);
//
//        setaLab02.intersect(setbLabo2);
//
//        System.out.println("setaLab02 Intersect setbLabo2: "+setaLab02);
//
//        setbLabo2.union(setdLab02);
//
//        System.out.println("setbLabo2 Union setdLab02: "+setbLabo2);
//
//        setdLab02.difference(setaLab02);
//
//        System.out.println("setdLab02 difference of setaLab02: "+setdLab02);

        //Duplicates test, throws Exception
//        CS1181SetLab02 setdLab02 = new CS1181SetLab02(8,9,9,67);
//        System.out.println(setdLab02);


        setaLab02.saveToFile("data.dat");
        setaLab02.loadFromFile("data.dat");

    }
}





