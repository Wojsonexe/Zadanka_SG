package pl.woj4on;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int rok = scaner.nextInt();

        boolean przestepny = false;

        if (rok % 4 == 0) {
            przestepny = true;
            if (rok % 100 == 0 && rok % 400 != 0) {
                przestepny = false;
            }
        }

        if (przestepny == true) {
            System.out.println("TAk");
        } else {
            System.out.println("NIE");
        }
    }
}
