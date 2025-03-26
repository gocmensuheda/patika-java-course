package hafta2;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        String sifre = scanner.nextLine();

        if (sifre.length() >= 8 &&                 // En az 8 karakter kontrolü
                !sifre.contains(" ") &&               // Space karakteri kontrolü
                Character.isUpperCase(sifre.charAt(0)) && // İlk harfin büyük harf olma kontrolü
                sifre.endsWith("?")) {                // Son karakterin '?' olma kontrolü
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}
