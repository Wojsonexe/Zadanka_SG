package pl.woj4on;

import java.util.*;
import static java.lang.Math.*;
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Czy operator nacisnął przycisk (true/false): ");
        boolean przycisk = sc.nextBoolean();

        System.out.print("Aktualna prędkość (int): ");
        int predkosc = sc.nextInt();

        System.out.print("Przyspieszenie (int): ");
        int przyspieszenie = sc.nextInt();

        if (przycisk) {
            if (predkosc == 0) {
                // ruch z przyspieszeniem przez 5 sekund
                double droga = 0.5 * przyspieszenie * pow(5,2);
                System.out.printf("Robot przejedzie %.2f jednostek w 5 sekund.%n", droga);
            } else {
                // zwalnianie: t = v / a
                if (przyspieszenie == 0) {
                    System.out.println("Robot nigdy się nie zatrzyma (przyspieszenie = 0).");
                } else {
                    double czasZatrzymania = (double) predkosc / przyspieszenie;
                    System.out.printf("Robot zatrzyma się po %.2f sekundach.%n", czasZatrzymania);
                }
            }
        } else {
            System.out.println("Prędkość początkowa: " + predkosc);
        }
    }
}
