package pl.woj4on;
import java.util.*;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dzwieki = {"do", "re", "mi", "fa", "sol", "la", "si"};

        System.out.println("Wpisz słowo (CTRL+D lub CTRL+Z by zakończyć):");

        while (sc.hasNext()) {
            String slowo = sc.next().toLowerCase();
            boolean znaleziono = false;

            for (String dzwiek : dzwieki) {
                if (slowo.contains(dzwiek)) {
                    znaleziono = true;
                    break;
                }
            }

            System.out.println(slowo + " → " + (znaleziono ? "TAK" : "NIE"));
            System.out.println("Wpisz kolejne słowo:");
        }
    }
}
