package pl.woj4on;
import java.util.*;
import static java.lang.Math.*;

public class Zadanie8 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static List<Integer> sieveOfEratosthenes(int limit) {
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

    public static void findGoldbachPair(int n, List<Integer> primes) {
        int bestA = 0, bestB = 0, minDiff = Integer.MAX_VALUE;
        for (int i : primes) {
            int j = n - i;
            if (j >= i && primes.contains(j)) {
                int diff = abs(i - j);
                if (diff < minDiff) {
                    minDiff = diff;
                    bestA = min(i, j);
                    bestB = max(i, j);
                }
            }
        }

        if (bestA > 0 && bestB > 0) {
            System.out.println(bestA + " " + bestB);
        } else {
            System.out.println("Brak rozkładu");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile testów chcesz wykonać? (Podaj liczbę parzystych liczb większych niż 4): ");
        int tests = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        int max = 0;

        System.out.println("Podaj po kolei " + tests + " liczb(e)");

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            if (n > 4 && n % 2 == 0) {
                numbers.add(n);
                max = max(max, n);
            } else {
                System.out.println("⚠️ Liczba musi być parzysta i większa niż 4. Pomijam: " + n);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Nie podano żadnych poprawnych liczb. Zakończono.");
            return;
        }

        List<Integer> primes = sieveOfEratosthenes(max);

        for (int number : numbers) {
            System.out.print("Dla liczby " + number + ": ");
            findGoldbachPair(number, primes);
        }
    }
}
