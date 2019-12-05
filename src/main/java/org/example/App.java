package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Sekil> sekilList = new ArrayList<>();

        System.out.println("---Üçgen Hesaplamalarına Hoşgeldiniz---");

        int taban, yukseklik, kenar1, kenar2, kenar3;
        System.out.println("Üçgen taban uzunluğunu girin.");
        taban=in.nextInt();

        System.out.println("Üçgen yüksekliğini girin.");
        yukseklik=in.nextInt();

        System.out.println("Üçgenin birinci kenarını girin.");
        kenar1=in.nextInt();

        System.out.println("Üçgenin ikinci kenarını girin.");
        kenar2=in.nextInt();

        System.out.println("Üçgenin üçüncü kenarını girin.");
        kenar3=in.nextInt();

        Ucgen ucgenSekil = new Ucgen(taban,yukseklik,kenar1,kenar2,kenar3);
        sekilList.add(ucgenSekil);

        System.out.println("---Dikdörtgen Hesaplamalarına Hoşgeldiniz---");

        int kisaKenar,uzunKenar;
        System.out.println("Dikdörtgenin kısa kenarını girin.");
        kisaKenar=in.nextInt();

        System.out.println("Dikdörtgenin uzun kenarını girin.");
        uzunKenar=in.nextInt();

        Dikdortgen dikdortgenSekil = new Dikdortgen(kisaKenar,uzunKenar);
        sekilList.add(dikdortgenSekil);

        System.out.println("---Kare Hesaplamalarına Hoşgeldiniz---");
        
        int kareKenar;
        System.out.println("Karenin kenarını girin.");
        kareKenar=in.nextInt();

        Kare kareSekil = new Kare(kareKenar);
        sekilList.add(kareSekil);

        sekilListe(sekilList);

    }

    public static void sekilListe(ArrayList<Sekil> sekilList) {
        for (Sekil sekiller : sekilList)
        {
            sekiller.alanHesapla();
            sekiller.cevreHesapla();
        }
    }

}