package hafta1;

import java.util.Scanner;

public class tip_donusumleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tam sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ondalıklı sayı giriniz: ");
        double sayi2 = scanner.nextDouble();

        double ondalikliSayi = sayi1;
        int tamSayi = (int) sayi2;

        System.out.println(ondalikliSayi);
        System.out.println(tamSayi);
    }
}
