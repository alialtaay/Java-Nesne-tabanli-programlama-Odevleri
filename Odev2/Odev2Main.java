package com.codeocu.denemeler.Odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 s1 = new Odev2();
        double Mil = s1.Mil(620);
        System.out.println("Hesaplana Mil Değeri : "+Mil);

        Odev2 s2 = new Odev2();
        s2.Dikdortgen(10,20);

        Odev2 s3 = new Odev2();

        int faktoriyel = s3.faktoriyel(5);
        System.out.println("Sayının Faktöriyel değeri : "+faktoriyel);

        Odev2 s4 = new Odev2();
        s4.kelime("emlak",'e');


        Odev2 s5 = new Odev2();
        double aciToplami = s5.kenarSayisi(4);
        System.out.println(aciToplami);

        Odev2 s6 = new Odev2();

        int maasToplamı = s6.gunSayisi(20);
        System.out.println(maasToplamı);

        Odev2 s7 = new Odev2();

        int parkUcreti = s7.parkSüresi(6);
        System.out.println(parkUcreti);


    }

}
