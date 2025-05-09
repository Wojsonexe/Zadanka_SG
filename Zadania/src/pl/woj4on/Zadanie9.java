package pl.woj4on;
import java.util.*;

public class Zadanie9 {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();
        instruments.add("fotel");
        instruments.add("fasola");
        instruments.add("kalarepa");
        instruments.add("dominika");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (instruments.contains(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
