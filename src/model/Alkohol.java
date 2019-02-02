package model;

import java.math.BigDecimal;

public class Alkohol {

    private static int generator = 1;

    private int id;
    private String nazwa;
    private BigDecimal cena;
    private String litraz;
    private String procentAlkoholu;

    public Alkohol(String nazwa, BigDecimal cena,
                   String litraz, String procentAlkoholu){
        this.id = generator++;
        this.nazwa = nazwa;
        this.cena = cena;
        this.litraz = litraz;
        this.procentAlkoholu = procentAlkoholu;
    }

    public int getId() {
        return id;
    }
}
