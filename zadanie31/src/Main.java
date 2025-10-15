import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Zadanie 1
        System.out.println("Zadanie 1");

        int[] tablica1 = new int[10];
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = rand.nextInt(21) - 10;
        }
        System.out.print("Wylosowane liczby: ");
        for (int liczba : tablica1) System.out.print(liczba + " ");
        System.out.println();

        int min1 = tablica1[0];
        int max1 = tablica1[0];
        int suma1 = 0;
        for (int liczba : tablica1) {
            if (liczba < min1) min1 = liczba;
            if (liczba > max1) max1 = liczba;
            suma1 += liczba;
        }
        double srednia1 = (double) suma1 / tablica1.length;

        int mniejsze1 = 0, wieksze1 = 0;
        for (int liczba : tablica1) {
            if (liczba < srednia1) mniejsze1++;
            else if (liczba > srednia1) wieksze1++;
        }

        System.out.println("Min: " + min1 + ", max: " + max1);
        System.out.printf("Średnia: %.2f%n", srednia1);
        System.out.println("Mniejszych od śr.: " + mniejsze1);
        System.out.println("Większych od śr.: " + wieksze1);

        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = tablica1.length - 1; i >= 0; i--) System.out.print(tablica1[i] + " ");
        System.out.println("\n");

        // Zadanie 2
        System.out.println("Zadanie 2");

        int[] tablica2 = new int[20];
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = rand.nextInt(10) + 1;
        }
        System.out.print("Wylosowane liczby: ");
        for (int liczba : tablica2) System.out.print(liczba + " ");
        System.out.println();

        int[] wystapienia = new int[10];
        for (int liczba : tablica2) {
            wystapienia[liczba - 1]++;
        }

        System.out.println("Wystąpienia:");
        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println((i + 1) + " - " + wystapienia[i]);
        }
        System.out.println();

        // Zadanie 3
        System.out.println("Zadanie 3");

        int[][] macierz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = rand.nextInt(11) - 5;
            }
        }

        System.out.println("Macierz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", macierz[i][j]);
            }
            System.out.println();
        }

        int[] minCol = new int[5];
        int[] maxCol = new int[5];
        for (int j = 0; j < 5; j++) {
            minCol[j] = macierz[0][j];
            maxCol[j] = macierz[0][j];
            for (int i = 1; i < 5; i++) {
                if (macierz[i][j] < minCol[j]) minCol[j] = macierz[i][j];
                if (macierz[i][j] > maxCol[j]) maxCol[j] = macierz[i][j];
            }
        }

        System.out.print("Minima kolumn: ");
        for (int x : minCol) System.out.print(x + " ");
        System.out.println();

        System.out.print("Maksima kolumn: ");
        for (int x : maxCol) System.out.print(x + " ");
        System.out.println("\n");

        // Zadanie 4
        System.out.println("Zadanie 4");
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba4 = scanner.nextInt();
        int[] binarny = new int[32];
        int temp4 = liczba4;

        for (int i = 31; i >= 0; i--) {
            binarny[i] = Math.abs(temp4 % 2);
            temp4 /= 2;
        }

        System.out.print("Liczba " + liczba4 + " binarnie: ");
        if (liczba4 < 0) System.out.print("1.");
        else System.out.print("0.");
        for (int i = 25; i < 32; i++) {
            System.out.print(binarny[i]);
        }
        System.out.println("\n");

        // Zadanie 5
        System.out.println("Zadanie 5");

        int[] zu1 = new int[32];
        for (int i = 0; i < 32; i++) {
            zu1[i] = 1 - binarny[i];
        }
        for (int i = 31; i >= 0; i--) {
            if (zu1[i] == 0) {
                zu1[i] = 1;
                break;
            } else {
                zu1[i] = 0;
            }
        }

        int[] zu2 = new int[32];
        System.arraycopy(zu1, 0, zu2, 0, 32);
        for (int i = 31; i >= 0; i--) {
            if (zu2[i] == 0) {
                zu2[i] = 1;
                break;
            } else {
                zu2[i] = 0;
            }
        }

        System.out.print("Kod ZU1: ");
        for (int i = 0; i < 32; i++) System.out.print(zu1[i]);
        System.out.println();

        System.out.print("Kod ZU2: ");
        for (int i = 0; i < 32; i++) System.out.print(zu2[i]);
        System.out.println("\n");

        // Zadanie 6
        System.out.println("Zadanie 6");

        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int b = scanner.nextInt();

        int suma = a + b;
        int roznica = a - b;

        System.out.println("Dodawanie w kodzie ZM (wynik normalny): " + suma);
        System.out.println("Odejmowanie w kodzie ZM (wynik normalny): " + roznica);

        System.out.println("Dodawanie i odejmowanie w ZU1 i ZU2 jest realizowane przez operacje na intach w Javie.");
        System.out.println("Koniec programu.");

        scanner.close();
    }
}
