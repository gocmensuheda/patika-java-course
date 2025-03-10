package hafta1;

import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
        double elmaFiyatKg = 3.67;
        double armutFiyatKg = 2.14;
        double domatesFiyatKg = 1.11;
        double muzFiyatKg = 0.95;
        double patlicanFiyatKg = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("elma kg giriniz: ");
        double elmaKg = scanner.nextDouble();

        System.out.println("armut kg giriniz: ");
        double armutKg = scanner.nextDouble();

        System.out.println("domates kg giriniz: ");
        double domatesKg = scanner.nextDouble();

        System.out.println("muz kg giriniz: ");
        double muzKg = scanner.nextDouble();

        System.out.println("patlıcan kg giriniz: ");
        double patlicanKg = scanner.nextDouble();


        double toplamFiyat = elmaKg*elmaFiyatKg + armutKg*armutFiyatKg + domatesKg*domatesFiyatKg + muzKg*muzFiyatKg + patlicanKg*patlicanFiyatKg;

        System.out.println("Toplam Fiyat: " + toplamFiyat + "TL");


    }
}
