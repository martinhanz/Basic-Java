package com;

public class Main1{

    static void myStaticMethod(){
        System.out.println("Martin Hansssss");
    }

    public void myPublicMethod(){
        System.out.println("Martin Hansssss");
    }

    public static void main(String[] args) {
    myStaticMethod();
    
    Main1 myObj = new Main1();
    myObj.myPublicMethod();
    }
}