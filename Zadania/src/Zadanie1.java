import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj A:");
        int a = sc.nextInt();

        System.out.println("Podaj B:");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("TAK");
        } else {
            System.out.println("Nie");
        }
    }
}