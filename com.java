package com;

public class laptop{
 int modelYear;
 String modelName;
 
 
 public Laptop(int year, string name) {
 modelYear = year;
 modelName = name;
 }
 public static void main(string[] args) {
  laptop myLaptop = new Laptop (2019, "Andi");
  System.out.println(myLaptop.modelYear +" " + myLaptop.modelName);
  }
}  