import com.ibm.icu.text.Transliterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        System.out.println(Pogoda.Poluchit(city));
    }
}
