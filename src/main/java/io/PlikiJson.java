package io;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;
import java.io.IOException;

public class PlikiJson implements OperacjePlikowe {

    private ObjectMapper mapper = new ObjectMapper();

    public Sklep odczyt() throws Exception {
        Sklep sklep
                = mapper.readValue(new File("sklep.json"), Sklep.class);

        return sklep;
    }

    public void zapis(Sklep sklep) {
        try {
            mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValue(new File("sklep.json"), sklep);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("blad zapisu pliku");
        }
    }
}
