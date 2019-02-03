package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep implements Serializable {

    private String nazwa;
    private List<Produkt> produkty;

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.produkty = new ArrayList<>();
    }

    public void dodaj(Produkt produkt) {
        produkty.add(produkt);
    }

    public void usun(int id) {
//        for (Alkohol alkohol : alkohole) {
//            if (alkohol.id == id) {
//                alkohole.remove(alkohol);
//            }
//        ConcurrentModificationException
//        }
        Iterator<Produkt> iterator = produkty.iterator();

        while (iterator.hasNext()) {
            Produkt produkt = iterator.next();
            if (produkt.getId() == id) {
                iterator.remove();
            }
        }
    }

    public String toString() {
        String rezultat = "id\ttyp\tnazwa\tcena\tinne\n";
        for (Produkt produkt : produkty) {
            rezultat += produkt + "\n";
        }

        return rezultat;
    }
}
