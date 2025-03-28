package hafta2;

import java.util.Scanner;

public class asal_sayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();

       int sonuc = asalSayi(sayi,2);
       if(sonuc==1) System.out.println("bu bir asal sayıdır.");
       else System.out.println("bu bir asal sayı değildir.");


    }
    private static int asalSayi(int sayi, int bolen){
        if (sayi <= 1) {
            return 0; // 1 ve daha küçük sayılar asal değildir.
        }
        if (bolen >= sayi) {
            return 1; // Tüm bölenler kontrol edildi, sayı asaldır.
        }
        if (sayi % bolen == 0) {
            return 0; // Tam bölünme varsa asal değildir.
        }
        return asalSayi(sayi, bolen+1);

    }
}
