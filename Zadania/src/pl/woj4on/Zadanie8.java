package pl.woj4on;
import java.util.*;

public class Zadanie8 {

    // Funkcja do sprawdzenia czy liczba jest pierwsza
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Funkcja do generowania liczb pierwszych
    public static List<Integer> generatePrimes(int limit) {
        boolean[] sieve = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (!sieve[i]) {
                primes.add(i);
                for (int j = i * i; j <= limit; j += i) {
                    sieve[j] = true;
                }
            }
        }
        return primes;
    }

    public static void goldbachConjecture(int number, List<Integer> primes) {
        int minDiff = Integer.MAX_VALUE;
        int prime1 = 0, prime2 = 0;

        for (int i = 0; i < primes.size(); i++) {
            int p1 = primes.get(i);
            int p2 = number - p1;
            if (p2 >= p1 && primes.contains(p2)) {
                int diff = p2 - p1;
                if (diff < minDiff) {
                    prime1 = p1;
                    prime2 = p2;
                    minDiff = diff;
                }
            }
        }

        System.out.println(prime1 + " " + prime2);  // Wypisanie wyniku
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj maksymalną liczbę: ");
        int maxNumber = sc.nextInt();

        List<Integer> primes = generatePrimes(maxNumber);

        System.out.println("Podaj liczby do rozkładu (parzyste większe niż 4): ");
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number > 4 && number % 2 == 0) {
                goldbachConjecture(number, primes);
            } else {
                System.out.println("Liczba musi być parzysta i większa niż 4.");
            }
        }
    }
}
