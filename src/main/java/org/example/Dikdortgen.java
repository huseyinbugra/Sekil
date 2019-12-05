package org.example;

public class Dikdortgen extends Sekil {
    private int kısaKenar;
    private int uzunKenar;

    public Dikdortgen(int kısaKenar, int uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    public int getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(int kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    public void cevreHesapla() {
        int cevre = this.kısaKenar*2 + this.uzunKenar*2;
        System.out.println("Dikdörtgen çevresi : "+cevre);
    }

    @Override
    public void alanHesapla() {
        int alan = this.kısaKenar*this.uzunKenar;
        System.out.println("Dikdörtgen alanı : "+alan);
    }
}
