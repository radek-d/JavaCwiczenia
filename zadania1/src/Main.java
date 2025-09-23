import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad1
        double stopnieC, stopnieF;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsjusza: ");
        stopnieC=scanner.nextDouble();

        stopnieF= 1.8 * stopnieC + 32;
        System.out.println("Stopnie Fahrenheita " + stopnieF);

    }
}