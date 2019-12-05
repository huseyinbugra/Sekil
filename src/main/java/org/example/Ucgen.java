package org.example;

import java.util.Scanner;
public class Ucgen extends Sekil
{
    private int taban;
    private int yukseklik;
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(int taban, int yukseklik, int kenar1, int kenar2, int kenar3) {
        this.taban = taban;
        this.yukseklik = yukseklik;
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    @Override
    public void cevreHesapla() {
        int cevre = this.kenar1+this.kenar2+this.kenar3;
        System.out.println("üçgen çevresi : "+cevre);
    }

    @Override
    public void alanHesapla() {
        int alan = this.taban*this.yukseklik/2;
        System.out.println("üçgen alanı : "+alan);
    }
}
