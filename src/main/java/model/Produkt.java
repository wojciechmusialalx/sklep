package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Alkohol.class, name = "alkohol"),
        @JsonSubTypes.Type(value = Papierosy.class, name = "papierosy")
})
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

    @JsonIgnore
    public abstract String getTyp();

    public Produkt() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return this.id + "\t"
                + getTyp() + "\t"
                + this.nazwa + "\t"
                + this.cena + " PLN";

    }
}
