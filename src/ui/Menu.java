package ui;

import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);
        Sklep sklep = new Sklep("Alkohole w akademiku");
        sklep.dodaj(new Alkohol("cytryna", BigDecimal.TEN, "0.7l", "40%"));
        sklep.dodaj(new Alkohol("kawa", BigDecimal.TEN, "0.75l", "45%"));
        sklep.dodaj(new Papierosy("malboro", new BigDecimal("20.5"), "grube", 20));

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - dodaj papierosy");
        System.out.println("3 - usun");
        System.out.println("4 - wyswietl");
        System.out.println("q - wyjscie");

        String wybor;

        do {
            System.out.print("Podaj wybor: ");
            wybor = wejscie.nextLine();

            switch (wybor) {
                case "1": {
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
                    sklep.dodaj(alkohol);
                    System.out.println("Utworzono nowy alkohol");
                    break;
                }
                case "2": {
                    System.out.print("Podaj nazwe: ");
                    String nazwe = wejscie.nextLine();

                    System.out.print("Podaj cene: ");
                    BigDecimal cena = wejscie.nextBigDecimal();
                    wejscie.nextLine();

                    System.out.print("Podaj rodzaj: ");
                    String rodzaj = wejscie.nextLine();

                    System.out.print("Podaj ilosc w paczce: ");
                    int ilosc = wejscie.nextInt();

                    Papierosy papierosy = new Papierosy(nazwe, cena, rodzaj, ilosc);
                    sklep.dodaj(papierosy);
                    System.out.println("Utworzono nowe papierosy");
                    break;
                }
                case "3":
                    System.out.print("Podaj id do usuniecia: ");
                    int id = wejscie.nextInt();
                    wejscie.nextLine();
                    sklep.usun(id);
                    System.out.println("Usunieto produkt z id: " + id);
                    break;
                case "4":
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
