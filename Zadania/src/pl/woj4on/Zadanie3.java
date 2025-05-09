package pl.woj4on;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dwie liczby:");

        System.out.print("A = ");
        double a = sc.nextDouble();

        System.out.print("B = ");
        double b = sc.nextDouble();

        double result = a / pow(b,2);
        /**
         * %.2f liczba zmiennoprzecinkowa z dokładadnością do 2 miejsc po przecinku
         * %n - nowa linia
         */
        System.out.printf("Wynik: %.2f%n", result);


    }
}
