public class Main {
    // 1. Silnia
    static int silniaIter(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
    static int silniaRek(int n) {
        if (n <= 1) return 1;
        return n * silniaRek(n - 1);
    }

    // 2. Fibonacci
    static int fibIter(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        int a = 1, b = 2, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    static int fibRek(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        return fibRek(n - 1) + fibRek(n - 2);
    }

    // 3.
    static int strpos(String text, char z) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == z) return i;
        }
        return -1;
    }

    // 4.
    static String flipCase(String text) {
        String wynik = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) wynik += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) wynik += Character.toUpperCase(c);
            else wynik += c;
        }
        return wynik;
    }

    // 5.
    static boolean startsWith(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    // 6.
    static int strToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0, znak = 1, wynik = 0;

        if (str.charAt(0) == '-') {
            znak = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                wynik = wynik * 10 + (c - '0');
            } else if (c == 'e' && i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                int exp = 0;
                i++;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    exp = exp * 10 + (str.charAt(i) - '0');
                    i++;
                }
                for (int j = 0; j < exp; j++) wynik *= 10;
                break;
            } else break;
            i++;
        }
        return wynik * znak;
    }

    // 7.
    static int strfind(String gdzie, String co) {
        if (co.equals("")) return 0;
        for (int i = 0; i <= gdzie.length() - co.length(); i++) {
            if (gdzie.substring(i, i + co.length()).equals(co)) return i;
        }
        return -1;
    }

    // 8.
    static int wordCount(String text) {
        if (text.trim().isEmpty()) return 0;
        String[] slowa = text.trim().split("\\s+");
        return slowa.length;
    }

    // 9. podzielNaSlowa
    static String[] podzielNaSlowa(String tekst) {
        if (tekst.trim().isEmpty()) return new String[0];
        return tekst.trim().split("\\s+");
    }

    // 10.
    static int strFindAndCount(String gdzie, String co) {
        if (co.equals("")) return 0;
        int count = 0;
        int index = 0;
        while ((index = strfind(gdzie, co)) != -1) {
            count++;
            gdzie = gdzie.substring(index + 1);
        }
        return count;
    }

    // 11.
    static String strcut(String str, int start, int ile) {
        if (start >= str.length()) return str;
        if (start + ile > str.length()) ile = str.length() - start;
        return str.substring(0, start) + str.substring(start + ile);
    }

    // 12.
    static void zad12() {
        String[] tab = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
        String fraza = "ma";

        int suma = 0;
        String polaczony = "";
        int wystapienia1 = 0; // w komórkach nieliczbowych
        int wystapienia2 = 0; // w połączonym tekście

        for (String s : tab) {
            int liczba = strToInt(s);
            if (liczba != 0 || s.startsWith("0")) {
                suma += liczba;
            } else {
                polaczony += s;
                wystapienia1 += strFindAndCount(s, fraza);
            }
        }

        wystapienia2 = strFindAndCount(polaczony, fraza);
        double stosunek = (double) wystapienia1 / wystapienia2;

        System.out.println("Pkt. 1: " + suma);
        System.out.println("Pkt. 2: " + polaczony);
        System.out.println("Pkt. 3: " + wystapienia1);
        System.out.println("Pkt. 4: " + wystapienia2);
        System.out.println("Pkt. 5: " + stosunek);
    }

    // 13.
    static String poprzestawiaj(String tekst, int[] kolejnosc) {
        char[] nowy = new char[tekst.length()];
        for (int i = 0; i < tekst.length(); i++) {
            nowy[kolejnosc[i]] = tekst.charAt(i);
        }
        return new String(nowy);
    }

    // 14.
    static boolean czyAnagram(String t1, String t2) {
        t1 = t1.toLowerCase().replaceAll("[^a-z]", "");
        t2 = t2.toLowerCase().replaceAll("[^a-z]", "");
        if (t1.length() != t2.length()) return false;

        int[] litery = new int[26];
        for (char c : t1.toCharArray()) litery[c - 'a']++;
        for (char c : t2.toCharArray()) litery[c - 'a']--;
        for (int x : litery) if (x != 0) return false;
        return true;
    }

    // 15.
    static int[] HTMLColor2RGB(String color) {
        int[] rgb = new int[3];
        rgb[0] = Integer.parseInt(color.substring(1, 3), 16);
        rgb[1] = Integer.parseInt(color.substring(3, 5), 16);
        rgb[2] = Integer.parseInt(color.substring(5, 7), 16);
        return rgb;
    }

    public static void main(String[] args) {
        System.out.println("Silnia(5) iter: " + silniaIter(5));
        System.out.println("Silnia(5) rek: " + silniaRek(5));
        System.out.println("Fib(5) iter: " + fibIter(5));
        System.out.println("Fib(5) rek: " + fibRek(5));
        System.out.println("strpos('Ala', 'l'): " + strpos("Ala", 'l'));
        System.out.println("flipCase('Ala'): " + flipCase("Ala"));
        System.out.println("startsWith('Alibaba', 'Ali'): " + startsWith("Alibaba", "Ali"));
        System.out.println("strToInt('-12e5'): " + strToInt("-12e5"));
        System.out.println("strfind('Ala ma kota', 'ma'): " + strfind("Ala ma kota", "ma"));
        System.out.println("wordCount('Ala ma kota'): " + wordCount("Ala ma kota"));
        System.out.println("strFindAndCount('mama ma kota', 'ma'): " + strFindAndCount("mama ma kota", "ma"));
        System.out.println("strcut('Ala ma kota', 4, 3): " + strcut("Ala ma kota", 4, 3));
        zad12();
        int[] kol = {0, 1, 4, 3, 2, 6, 5};
        System.out.println("poprzestawiaj('Egzamin', kol): " + poprzestawiaj("Egzamin", kol));
        System.out.println("czyAnagram('kolej', 'olejk'): " + czyAnagram("kolej", "olejk"));
        int[] rgb = HTMLColor2RGB("#FF0050");
        System.out.println("HTMLColor2RGB('#FF0050'): " + rgb[0] + "," + rgb[1] + "," + rgb[2]);
    }
}
