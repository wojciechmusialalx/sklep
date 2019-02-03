package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {

    private String litraz;
    private String procentAlkoholu;

    public Alkohol() {
    }

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

    public String getLitraz() {
        return litraz;
    }

    public void setLitraz(String litraz) {
        this.litraz = litraz;
    }

    public String getProcentAlkoholu() {
        return procentAlkoholu;
    }

    public void setProcentAlkoholu(String procentAlkoholu) {
        this.procentAlkoholu = procentAlkoholu;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" +
                this.litraz + "\t" +
                this.procentAlkoholu;
    }
}
