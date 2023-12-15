package com;

class Animal{
    public void move(){
        System.out.println("Animal can jump");  
    }
}

class dog extends Animal{
    @Override
    public void move(){
        System.out.println("dog can jump");
    }
} 

public class testdog {
    public static void main(String[] args) {
        Animal a = new Animal();
        dog b = new dog();

        
        a.move();
        b.move();
    }
}