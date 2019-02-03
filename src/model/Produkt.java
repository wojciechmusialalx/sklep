package model;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Produkt implements Serializable {

    private static int generator = 1;

    protected int id;
    protected String nazwa;
    protected BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.id = generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public abstract String getTyp();

    @Override
    public String toString() {
        return this.id + "\t"
                + getTyp() + "\t"
                + this.nazwa + "\t"
                + this.cena + " PLN";

    }
}
