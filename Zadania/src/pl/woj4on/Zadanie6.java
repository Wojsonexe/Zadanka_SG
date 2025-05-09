package pl.woj4on;
import java.util.*;
import static java.lang.Math.*;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("Napięcie 1: ");
        double v1 = in.nextDouble();

        System.out.print("Napięcie 2: ");
        double v2 = in.nextDouble();

        double suma = v1 + v2;

        if (suma >= -1 && suma <= 1) {
            System.out.println("Silnik działa prawidłowo. Napięcie: " + suma);
        } else {
            System.out.printf("Uwaga! Napięcie (%s) przekracza dopuszczalny zakres! Czy kontynuować mimo ryzyka? (tak/nie): ", suma);
            in.nextLine();
            String odp = in.nextLine().trim().toLowerCase();

            if (odp.equals("tak")) {
                System.out.println("Silnik się spalil :(");
            } else {
                double ograniczone = max(-1, min(1, suma));
                System.out.println("Napięcie zostało ograniczone. Bezpieczna wartość: " + ograniczone);
            }

        }
    }
}
