package hafta1;

import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen km cinsinden gideceğiniz mesafeyi giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2 ");
        int tip = scanner.nextInt();

        double normalTutar = mesafe * 0.10;
        double yasIndirimOrani = 0; //yaş indirimi kontrolü.
        if (yas<12){
            yasIndirimOrani= 0.50;
        }else if(yas<24){
            yasIndirimOrani= 0.10;
        }else if(yas>65){
            yasIndirimOrani=0.30;
        }
        double yasIndirimi = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;

        double tipIndirimOrani = 0; // yolculuk tipine göre indirim yapılacak mı yapılmayacak mı kontrolü.

        switch(tip){
            case 1:
                tipIndirimOrani = 0;
                break;
            case 2:
                tipIndirimOrani = 0.20;
                break;
        }
        double tipIndirimi = indirimliTutar * tipIndirimOrani;
        double tipIndirimliTutar = indirimliTutar - tipIndirimi;

        System.out.println("Toplam Ödenecek tutar: "+ tipIndirimliTutar);






    }
}
