import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad1
        System.out.println("Zadanie 1");
        double stopnieC, stopnieF;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsjusza: ");
        stopnieC=scanner.nextDouble();

        stopnieF= 1.8 * stopnieC + 32;
        System.out.println("Stopnie Fahrenheita " + stopnieF);
        //zad2
        System.out.println("Zadanie 2");
        double a, b, c;
        Scanner scannerliczb = new Scanner(System.in);

        System.out.println("Podaj A: ");
        a = scannerliczb.nextDouble();

        System.out.println("Podaj B: ");
        b = scannerliczb.nextDouble();

        System.out.println("Podaj C: ");
        c = scannerliczb.nextDouble();

        if (a >= b && a >= c) {
            if (b <= c) {
                System.out.println("Największa liczba to " + a + ", a najmniejsza to " + b);
            } else {
                System.out.println("Największa liczba to " + a + ", a najmniejsza to " + c);
            }
        } else if (b >= a && b >= c) {
            if (a <= c) {
                System.out.println("Największa liczba to " + b + ", a najmniejsza to " + a);
            } else {
                System.out.println("Największa liczba to " + b + ", a najmniejsza to " + c);
            }
        } else {
            if (a <= b) {
                System.out.println("Największa liczba to " + c + ", a najmniejsza to " + a);
            } else {
                System.out.println("Największa liczba to " + c + ", a najmniejsza to " + b);
            }
        }

        //zad3
        System.out.println("Zadanie 3");
        Scanner zad2 = new Scanner(System.in);
        double wzrost, waga, BMI;
        System.out.println("Podaj wagę: ");
        waga = scannerliczb.nextDouble();
        System.out.println("Podaj wzrost: ");
        wzrost = scannerliczb.nextDouble();

        BMI = waga/(wzrost*wzrost);
        if(BMI<18.5){
            System.out.println("Niedowaga");
        }else if(BMI>24.9){
            System.out.println("Niedowaga");
        }else{
            System.out.println("Waga prawidłowa");
        }
        //zad4
        System.out.println("Zadanie 4");
        double dochod, podatek;
        Scanner scannerPodatek = new Scanner(System.in);

        System.out.println("Podaj swój dochód: ");
        dochod = scannerPodatek.nextDouble();

        if (dochod <= 85528) {
            podatek = 0.18 * dochod - 556.02;
            if(podatek < 0) podatek = 0;
        } else {
            podatek = 14839.02 + 0.32 * (dochod - 85528);
        }

        System.out.println("Należny podatek to: " + podatek + " zł");
        //zad5
        System.out.println("Zadanie 5");
        double cena, rata, oprocentowanie, cenaZRatach;
        int liczbaRat;

        Scanner scannerRaty = new Scanner(System.in);

    // Wczytaj poprawną cenę
        do {
            System.out.println("Podaj cenę towaru (od 100 zł do 10000 zł): ");
            cena = scannerRaty.nextDouble();
        } while (cena < 100 || cena > 10000);

    // Wczytaj poprawną liczbę rat
        do {
            System.out.println("Podaj liczbę rat (od 6 do 48): ");
            liczbaRat = scannerRaty.nextInt();
        } while (liczbaRat < 6 || liczbaRat > 48);

    // Ustal oprocentowanie
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

    // Oblicz całkowity koszt + odsetki
        cenaZRatach = cena + (cena * oprocentowanie);
        rata = cenaZRatach / liczbaRat;

        System.out.println("Miesięczna rata wynosi: " + rata + " zł");

        //zad6
        System.out.println("Zadanie 6");
        double liczba1, liczba2, wynik;
        char dzialanie;
        Scanner scannerKalkulator = new Scanner(System.in);

        System.out.println("Prosty kalkulator: +, -, *, /");
        System.out.println("Podaj pierwszą liczbę: ");
        liczba1 = scannerKalkulator.nextDouble();

        System.out.println("Podaj symbol działania (+, -, *, /): ");
        dzialanie = scannerKalkulator.next().charAt(0);

        System.out.println("Podaj drugą liczbę: ");
        liczba2 = scannerKalkulator.nextDouble();

        switch (dzialanie) {
            case '+':
                wynik = liczba1 + liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '-':
                wynik = liczba1 - liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '*':
                wynik = liczba1 * liczba2;
                System.out.println("Wynik: " + wynik);
                break;
            case '/':
                if (liczba2 == 0) {
                    System.out.println("Nie można dzielić przez zero.");
                } else {
                    wynik = liczba1 / liczba2;
                    System.out.println("Wynik: " + wynik);
                }
                break;
            default:
                System.out.println("Nieprawidłowy symbol działania.");
                break;
        }

        System.out.println("Koniec zadania");


    }
}