package com;

public class PersegiPanjang {

    private int panjang;
    private int lebar;
    private int luas;

    public int getpanjang() {
        return panjang;
    }

    public int getlebar() {
        return lebar;
    }

    public int luas() {
        return luas;
    }

    public void setpanjang(int newpanjang) {
        panjang = newpanjang;
    }

    public void setlebar(int newlebar) {
        lebar = newlebar;
    }

    public void setluas(int newluas) {
        luas = newluas;
    }

public static void main(String[] args) {

PersegiPanjang p = new PersegiPanjang();
p.panjang = 30;
p.lebar = 90 ;
p.luas = p.panjang*p.lebar;

System.out.println("PROGRAM MENGHITUNG LUAS PERSEGI PANJANG DENGAN ENKAPSULASI");
System.out.println("----------------------------------------------------------");
System.out.println("NAMA : MARTIN HANS");
System.out.println("NIM : 4193550012" );
System.out.println("Panjang = " + p.panjang);
System.out.println("Lebar = " + p.lebar);
System.out.println("Luas Persegi Panjang = " + p.luas);

}

}