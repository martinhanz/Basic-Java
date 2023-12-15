package com;

public class Laptop{
    int modelYear;
    String modelName;

    
public Laptop(int year, String name) {
    modelYear = year;
    modelName = name;
}
public static void main(String[] args) {
    Laptop myLaptop = new Laptop (2019, "Martin");
    System.out.println(myLaptop.modelYear + " " + myLaptop.modelName);
    }
}