package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {

    private String litraz;
    private String procentAlkoholu;

    public Alkohol(String nazwa, BigDecimal cena,
                   String litraz, String procentAlkoholu){
        super(nazwa, cena);
        this.litraz = litraz;
        this.procentAlkoholu = procentAlkoholu;
    }

    @Override
    public String getTyp() {
        return "alko";
    }
}
