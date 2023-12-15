package com.waktu;

class Waktu{
    double s,v,t;
}
public class Main{
    public static void main(String[] args) {
        Waktu a = new waktu();
        a.s = 10;
        a.v = 50;
        a.t = a.s / a.v;
        System.out.printf("waktu yang ditempuh adalah %.2f jam \n", a.t); 
    }
}


