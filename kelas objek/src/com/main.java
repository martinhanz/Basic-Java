package com;

//class sebagai template

class Mahasiswa{
    String nama;
    String NIM;
    String TempatLahir;
    String TanggalLahir;
    String Alamat;
   
   
}
    

public class main {
    public static void main(String[] args) {

        // buat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Martin Hans";
        mahasiswa1.NIM = "4193550012";
        mahasiswa1.TempatLahir = "Medan, sumut";
        mahasiswa1.TanggalLahir = "20 Maret 2001";
        mahasiswa1.Alamat = "Jalan Murai 15 No. 162 Perumnas Mandala Medan";

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.TempatLahir);
        System.out.println(mahasiswa1.TanggalLahir);
        System.out.println(mahasiswa1.Alamat);
    }
}