package ui;

import model.Alkohol;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);
        Sklep sklep = new Sklep("Alkohole w akademiku");
        sklep.dodajAlkohol(new Alkohol("cytryna", BigDecimal.TEN, "0.7l", "40%"));
        sklep.dodajAlkohol(new Alkohol("kawa", BigDecimal.TEN, "0.75l", "45%"));

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usun alkohol");
        System.out.println("3 - wyswietl");
        System.out.println("q - wyjscie");

        String wybor;

        do {
            System.out.print("Podaj wybor: ");
            wybor = wejscie.nextLine();

            switch (wybor) {
                case "1":
                    System.out.print("Podaj nazwe: ");
                    String nazwe = wejscie.nextLine();

                    System.out.print("Podaj cene: ");
                    BigDecimal cena = wejscie.nextBigDecimal();
                    wejscie.nextLine();

                    System.out.print("Podaj litraz: ");
                    String litraz = wejscie.nextLine();

                    System.out.print("Podaj procent: ");
                    String procent = wejscie.nextLine();

                    Alkohol alkohol = new Alkohol(nazwe, cena, litraz, procent);
                    sklep.dodajAlkohol(alkohol);
                    System.out.println("Utworzono nowy alkohol");
                    break;
                case "2":
                    System.out.print("Podaj id do usuniecia: ");
                    int id = wejscie.nextInt();
                    wejscie.nextLine();
                    sklep.usunAlkohol(id);
                    System.out.println("Usunieto alkohol z id: " + id);
                    break;
                case "3":
                    System.out.println(sklep);
                    break;
                case "q":
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Bledna opcja, sprobuj jeszcze raz");
            }
        } while (!wybor.equals("q"));
    }
}
