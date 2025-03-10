package hafta1;

import java.util.Scanner;

public class vki_hesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        double boy = scanner.nextDouble();

        double vki = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz "+ vki + "'dir.");
    }
}
