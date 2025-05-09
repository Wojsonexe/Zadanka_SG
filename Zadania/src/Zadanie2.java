import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz liczby odzielone spacją");
        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            System.out.println(num > 7 ? "TAK" : "NIE");
        }

        sc.close();
    }
}
