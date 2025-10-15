import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        System.out.println("Zadanie 1");
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(21) - 10;
        }

        System.out.print("Wylosowane liczby: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();

        int min = tablica[0], max = tablica[0], suma = 0;
        for (int liczba : tablica) {
            if (liczba < min) min = liczba;
            if (liczba > max) max = liczba;
            suma += liczba;
        }

        double srednia = (double) suma / tablica.length;

        int mniejsze = 0, wieksze = 0;
        for (int liczba : tablica) {
            if (liczba < srednia) mniejsze++;
            else if (liczba > srednia) wieksze++;
        }

        System.out.println("Min: " + min + ", max: " + max);
        System.out.printf("Średnia: %.2f%n", srednia);
        System.out.println("Mniejszych od śr.: " + mniejsze);
        System.out.println("Większych od śr.: " + wieksze);

        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
