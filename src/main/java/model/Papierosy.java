package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt {

    private String rodzaj;
    private int ilosc;

    public Papierosy() {
    }

    public Papierosy(String nazwa, BigDecimal cena,
                     String rodzaj, int ilosc) {
        super(nazwa, cena);
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String getTyp() {
        return "P";
    }

    @Override
    public String toString() {
        return super.toString() + "\t" +
                this.rodzaj + "\t" +
                this.ilosc;
    }
}
