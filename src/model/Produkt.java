package model;

import java.math.BigDecimal;

public class Produkt {

    private static int generator = 1;

    private int id;
    private String nazwa;
    private BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.id = generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id + "\t"
                + this.nazwa + "\t"
                + this.cena + " PLN";

    }
}
