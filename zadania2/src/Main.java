import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Zadanie 1");
        int liczba;
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        liczba = scanner.nextInt();

        for (int i = 1; i <= liczba; i += 2) {
            System.out.println(i);
        }

        // Zadanie 2
        System.out.println("Zadanie 2");
        int A, B;
        System.out.println("Podaj A (mniejsze): ");
        A = scanner.nextInt();
        System.out.println("Podaj B (większe): ");
        B = scanner.nextInt();

        int suma = 0;
        int i = A;
        while (i <= B) {
            suma += i;
            i++;
        }
        System.out.println(suma);

        suma = 0;
        i = A;
        do {
            suma += i;
            i++;
        } while (i <= B);
        System.out.println(suma);

        suma = 0;
        for (i = A; i <= B; i++) {
            suma += i;
        }
        System.out.println(suma);

        // Zadanie 3
        System.out.println("Zadanie 3");
        int n;
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        n = scanner.nextInt();

        int potega = 1;
        while (potega <= n) {
            System.out.println(potega);
            potega *= 2;
        }

        // Zadanie 4
        System.out.println("Zadanie 4");
        int liczbaSuma = 0, liczbaWczytana;
        do {
            System.out.println("Podaj liczbę (0 kończy): ");
            liczbaWczytana = scanner.nextInt();
            liczbaSuma += liczbaWczytana;
        } while (liczbaWczytana != 0);
        System.out.println("Suma: " + liczbaSuma);

        // Zadanie 5
        System.out.println("Zadanie 5");
        int liczbaMin = Integer.MAX_VALUE;
        int liczbaMax = Integer.MIN_VALUE;
        double sumaLiczb = 0;
        int licznik = 0;
        int liczbaWczytana2;

        do {
            System.out.println("Podaj liczbę (0 kończy): ");
            liczbaWczytana2 = scanner.nextInt();
            if (liczbaWczytana2 != 0) {
                if (liczbaWczytana2 < liczbaMin) liczbaMin = liczbaWczytana2;
                if (liczbaWczytana2 > liczbaMax) liczbaMax = liczbaWczytana2;
                sumaLiczb += liczbaWczytana2;
                licznik++;
            }
        } while (liczbaWczytana2 != 0);

        System.out.println("Suma min i max: " + (liczbaMin + liczbaMax));
        System.out.println("Średnia: " + ((liczbaMin + liczbaMax) / 2.0));

        // Zadanie 6
        System.out.println("Zadanie 6");
        Random random = new Random();
        int wylosowana = random.nextInt(100) + 1;
        int proba;

        do {
            System.out.println("Zgadnij liczbę (1–100): ");
            proba = scanner.nextInt();
            if (proba > wylosowana) {
                System.out.println("Podałeś za dużą wartość");
            } else if (proba < wylosowana) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje!");
            }
        } while (proba != wylosowana);

        // Zadanie 7
        System.out.println("Zadanie 7");
        System.out.println("Podaj znak wypełnienia: ");
        char znak = scanner.next().charAt(0);
        System.out.println("Podaj x (pozycja pozioma): ");
        int x = scanner.nextInt();
        System.out.println("Podaj y (pozycja pionowa): ");
        int y = scanner.nextInt();
        System.out.println("Podaj długość boku a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj długość boku b: ");
        int b = scanner.nextInt();

        for (int iY = 1; iY < y; iY++) {
            System.out.println();
        }

        for (int iA = 0; iA < a; iA++) {
            for (int iX = 1; iX < x; iX++) {
                System.out.print(" ");
            }
            for (int iB = 0; iB < b; iB++) {
                System.out.print(znak);
            }
            System.out.println();
        }

        // Zadanie 8
        System.out.println("Zadanie 8");
        System.out.println("Podaj wysokość choinki n: ");
        int wysokosc = scanner.nextInt();
        for (int rzad = 1; rzad <= wysokosc; rzad++) {
            for (int spacja = 1; spacja <= wysokosc - rzad; spacja++) {
                System.out.print(" ");
            }
            for (int gwiazdka = 1; gwiazdka <= 2 * rzad - 1; gwiazdka++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Zadanie 9
        System.out.println("Zadanie 9");
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba9 = scanner.nextInt();
        int temp = Math.abs(liczba9);
        int sumaCyfr = 0;
        int sumaParzyste = 0, sumaNieparzyste = 0;
        int liczParzyste = 0, liczNieparzyste = 0;

        while (temp > 0) {
            int cyfra = temp % 10;
            sumaCyfr += cyfra;
            if (cyfra % 2 == 0) {
                sumaParzyste += cyfra;
                liczParzyste++;
            } else {
                sumaNieparzyste += cyfra;
                liczNieparzyste++;
            }
            temp /= 10;
        }

        System.out.println("Suma cyfr: " + sumaCyfr);
        if (liczParzyste > 0 && liczNieparzyste > 0) {
            double sredniaParz = (double) sumaParzyste / liczParzyste;
            double sredniaNieparz = (double) sumaNieparzyste / liczNieparzyste;
            System.out.println("Stosunek średnich (parz/nieparz): " + (sredniaParz / sredniaNieparz));
        } else {
            System.out.println("Brak jednej z grup cyfr – nie można obliczyć stosunku.");
        }

        // Zadanie 10
        System.out.println("Zadanie 10");
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba10 = scanner.nextInt();
        System.out.print("Dzielniki: ");
        for (int d = 1; d <= liczba10; d++) {
            if (liczba10 % d == 0) {
                System.out.print(d + " ");
            }
        }
        System.out.println();

        // Zadanie 11
        System.out.println("Zadanie 11");
        System.out.println("Podaj liczbę całkowitą n > 1: ");
        int liczba11 = scanner.nextInt();
        boolean pierwsza = true;

        if (liczba11 <= 1) {
            pierwsza = false;
        } else {
            for (int j = 2; j <= Math.sqrt(liczba11); j++) {
                if (liczba11 % j == 0) {
                    pierwsza = false;
                    break;
                }
            }
        }

        if (pierwsza) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }

        System.out.println("Koniec programu");
    }
}
