package com.codeocu.denemeler.Odev2;

public class Odev2 {
    public double Mil(double Km){
        double hesaplananMil = Km*0.621;
        return  hesaplananMil;
    }

    public void Dikdortgen(int uzunKenar,int kisaKenar){
        int alan = uzunKenar*kisaKenar;
        System.out.println("Hesaplana Dikdörtgen alan değeri : "+alan);

    }

    public int faktoriyel(int sayi1){
        int sonuc = 1;
        if(sayi1==0){
            sonuc = 1;
        }
        else{
            for(int i =1; i<=sayi1;i++){
                sonuc = sonuc*i;

            }
        }


    return sonuc ;}

    public void kelime(String kelimee,char harf){

        int boyut = kelimee.length();

        char [] harfAdedi = new char[boyut];
        for(int i = 0 ; i<boyut;i++){
            harfAdedi[i] = kelimee.charAt(i);
        }

        int sayma = 0;

        for(int i = 0 ; i<boyut ; i++){
            if(harfAdedi[i]==harf){
                sayma++;
            }
        }
        System.out.println("Harf sayısı : "+sayma);



    }

    public double kenarSayisi(double kenar){
        double aciToplami = ((kenar-2)*180)/kenar;
        return  aciToplami;
    }

    public int gunSayisi(int gun){
        int calismaSaati = gun*8;
        int maas = 1;
        int mesaiSaati = calismaSaati-150;
        if (calismaSaati<150){
             maas = calismaSaati*40;
        }
        else{
            maas = 6000 + mesaiSaati*80;
        }

        return maas;
    }

    public int parkSüresi(int parkTime){
        int ucret = ((parkTime-1)*10)+50;
        return ucret;

    }

}











