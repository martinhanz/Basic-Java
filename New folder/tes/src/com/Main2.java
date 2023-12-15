package com;

class tegangan{
    int arus;
    int hambatan;
    int tegangan;
}
class daya{
    int tegangan;
    int arus;
    int daya;
}
public class Main2 {
    public static void main(String[] args) {   
    tegangan p = new tegangan();
    p.arus = 7;
    p.hambatan = 12;
    p.tegangan = p.arus*p.hambatan;
    System.out.println(p.tegangan);

    daya a = new daya();
    a.tegangan = 20;
    a.arus =  6;
    a.daya = a.tegangan*a.arus;
    System.out.println(a.daya);
    }   
}