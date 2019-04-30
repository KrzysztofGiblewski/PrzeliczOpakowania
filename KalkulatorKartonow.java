package com_krzysztofgiblewski.github.ilekartonow;

public class KalkulatorKartonow {
    private int iloscWorkow;
    private int ileKartonow;
    private int iloscWOpakowaniu;

    public int policzIloscOpakowań(int iloscWorkow, int iloscWOpakowaniu) {
        int ileOpakowań = iloscWorkow / iloscWOpakowaniu;
        return ileOpakowań;
    }

    public int policzIloscWorkowWKartonie(int ileKartonow, int iloscWorkow) {
        int iloscWKartonie = iloscWorkow / ileKartonow;
        return iloscWKartonie;
    }

    public int policzIleWOstatnimKartonie(int ileKartonow, int iloscWorkow) {
        int iloscWOstatnimKartonie = iloscWorkow % ileKartonow;
        return iloscWOstatnimKartonie;
    }

    public int getIloscWorkow() {
        return iloscWorkow;
    }

    public void setIloscWorkow(int iloscWorkow) {
        this.iloscWorkow = iloscWorkow;
    }

    public int getIleKartonow() {
        return ileKartonow;
    }

    public void setIleKartonow(int ileKartonow) {
        this.ileKartonow = ileKartonow;
    }

    public int getIloscWOpakowaniu() {
        return iloscWOpakowaniu;
    }

    public void setIloscWOpakowaniu(int iloscWOpakowaniu) {
        this.iloscWOpakowaniu = iloscWOpakowaniu;
    }
}
