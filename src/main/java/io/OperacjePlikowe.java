package io;

import model.Sklep;

public interface OperacjePlikowe {
    Sklep odczyt() throws Exception;
    void zapis(Sklep sklep);
}
