package com;

class gayalorentz{
    int induksi;
    int arus;
    int panjang;
    int gayalorentz;
}

public class matematic{

    public static void main(String[] args) {
        gayalorentz f = new gayalorentz();
        f.induksi = 10;
        f.arus = 5;
        f.panjang = 40;
        f.gayalorentz = f.induksi*f.arus*f.panjang;

        System.out.println("induksi (B) = " + f.induksi );
        System.out.println("arus (I) = " + f.arus );
        System.out.println("panjang (L) = " + f.arus);
        System.out.println("F = B x I x L");
        System.out.println("F = 10 x 5 x 40");
        System.out.println("F = " + f.gayalorentz);

    }
}