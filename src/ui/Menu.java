package ui;

import model.Alkohol;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietl() {
        Scanner wejscie = new Scanner(System.in);

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
                    System.out.println("dodawanie produktu");
                    break;
                case "2":
                    System.out.println("usun");
                    break;
                case "3":
                    System.out.println("wyswietl");
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
