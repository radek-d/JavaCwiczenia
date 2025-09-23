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

        scanner.close();
    }
}