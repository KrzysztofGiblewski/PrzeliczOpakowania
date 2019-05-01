package com_krzysztofgiblewski.github.ilekartonow;

public class KalkulatorKartonow {
    private int iloscWorkow;
    private int ileKartonow;
    private int iloscWOpakowaniu;

    public long policzIloscOpakowań(long iloscWorkow, long iloscWOpakowaniu) {
        long ileOpakowań = iloscWorkow / iloscWOpakowaniu;
        return ileOpakowań;
    }

    public long policzIleWOstatnimKartonie(long iloscWorkow, long ileWOpakowaniu) {
        long iloscWOstatnimKartonie = iloscWorkow % ileWOpakowaniu;
        return iloscWOstatnimKartonie;
    }

    public int policzIloscWorkowWKartonie(int ileKartonow, int iloscWorkow) {
        int iloscWKartonie = iloscWorkow / ileKartonow;
        return iloscWKartonie;
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
