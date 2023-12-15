package com;

abstract class hewan {
   
    public abstract void animalSound();

    public void sleep (){
        System.out.println("uwuuu enak kalee tidurnya");
    
    }
}

class pig extends hewan{
    @Override
    public void animalSound(){

        System.out.println("babi berkata : woy bangunlah kau, jogging kita yok");
    }
}

class MyMainClass{

    public static void main(String[] args) {
        pig myPig = new pig ();
        myPig.sleep();
        myPig.animalSound();
    }
}