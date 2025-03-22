package hafta1;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam=0;
        int sayac=0;


        for (int i = 1; i < sayi; i++) {
            if(i%3==0 && i%4==0){

                toplam+=i;
                sayac++;//burda 3 ve 4 e bölünebilen sayıların sayısı tutulur. ortalama için gerekli.

            }

        }
        if(sayac!=0){
            int ort= toplam/sayac;
            System.out.println("ortalama: "+ ort);
        }else{
            System.out.println("3 ve 4 e bölünebilen bir sayı bulunamadı.");
        //örneğin 1 den 13 e kadar 3 ve 4 e bölünebilen yalnızca 12 sayısı vardır. dolayısıyla ortalama 12 olmalıdır.
        }


    }
}
