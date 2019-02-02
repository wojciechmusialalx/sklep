package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt {

    private String rodzaj;
    private int ilosc;

    public Papierosy(String nazwa, BigDecimal cena,
                     String rodzaj, int ilosc) {
        super(nazwa, cena);
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;
    }
}
