import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("Podaj ciąg znaków: ");
        String tekst1 = scanner.nextLine();

        if (tekst1.length() == 0) {
            System.out.println("Podano pusty tekst");
        } else {
            char ostatniZnak = tekst1.charAt(tekst1.length() - 1);
            int licznik = 0;

            for (int i = 0; i < tekst1.length(); i++) {
                if (tekst1.charAt(i) == ostatniZnak) {
                    licznik++;
                }
            }

            System.out.println("Ostatni znak '" + ostatniZnak + "' występuje " + licznik + " razy.");
        }
        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println("Podaj ciąg znaków: ");
        String tekst2 = scanner.nextLine();
        String odwrocony = "";

        for (int i = tekst2.length() - 1; i >= 0; i--) {
            odwrocony += tekst2.charAt(i);
        }

        System.out.println("Odwrócony łańcuch: " + odwrocony);

        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println("Podaj ciąg znaków: ");
        String tekst3 = scanner.nextLine();

        String czysty = tekst3.replaceAll("\\s+", "").toLowerCase();
        String odwrocony3 = new StringBuilder(czysty).reverse().toString();

        if (czysty.equals(odwrocony3)) {
            System.out.println("To jest palindrom.");
        } else {
            System.out.println("To nie jest palindrom.");
        }
        // Zadanie 4
        System.out.println("Zadanie 4");
        System.out.println("Podaj tekst: ");
        String tekst4 = scanner.nextLine();
        int sumaCyfr = 0;

        for (int i = 0; i < tekst4.length(); i++) {
            char znak = tekst4.charAt(i);
            if (Character.isDigit(znak)) {
                sumaCyfr += Character.getNumericValue(znak);
            }
        }

        System.out.println("Suma cyfr w tekście: " + sumaCyfr);

        // Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println("Podaj wyrażenie arytmetyczne: ");
        String wyrazenie = scanner.nextLine();
        int licznikNawiasow = 0;
        boolean blad = false;

        for (int i = 0; i < wyrazenie.length(); i++) {
            char znak = wyrazenie.charAt(i);
            if (znak == '(') {
                licznikNawiasow++;
            } else if (znak == ')') {
                licznikNawiasow--;
                if (licznikNawiasow < 0) {
                    blad = true;
                    break;
                }
            }
        }

        if (blad || licznikNawiasow != 0) {
            System.out.println("Błędne sparowanie nawiasów");
        } else {
            System.out.println("OK");
        }
        // Zadanie 6
        System.out.println("Zadanie 6");
        System.out.println("Podaj tekst do zaszyfrowania: ");
        String tekst6 = scanner.nextLine().toLowerCase();
        System.out.println("Podaj przesunięcie (może być ujemne): ");
        int przesuniecie = scanner.nextInt();
        scanner.nextLine(); // czyszczenie bufora

        String zaszyfrowany = "";

        for (int i = 0; i < tekst6.length(); i++) {
            char znak = tekst6.charAt(i);
            if (znak >= 'a' && znak <= 'z') {
                int nowaPozycja = (znak - 'a' + przesuniecie) % 26;
                if (nowaPozycja < 0) nowaPozycja += 26;
                char nowyZnak = (char) ('a' + nowaPozycja);
                zaszyfrowany += nowyZnak;
            } else if (znak == ' ') {
                zaszyfrowany += ' ';
            } else {
                zaszyfrowany += znak; // pozostaw inne znaki bez zmian
            }
        }

        System.out.println("Zaszyfrowany tekst: " + zaszyfrowany);

        System.out.println("Koniec programu.");
    }
}
