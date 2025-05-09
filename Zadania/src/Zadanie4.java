import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ile liczb chcesz wprowadzić? ");
        int n = sc.nextInt();

        int suma = 0;
        System.out.println("Wprowadź " + n + " liczb");

        for (int i = 0; i < n; i++) {
            int liczba = sc.nextInt();
            suma += liczba;
        }

        System.out.println("Suma: " + suma);
    }
}
