package hafta1;

import java.util.Scanner;

public class artik_yil_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz: " );
        int yil = scanner.nextInt();

        if(yil%100!=0 && yil%4==0){
            System.out.println("Girilen yıl artık yıldır.");
        }if(yil%100==0 && yil%400==0){
            System.out.println("Girilen yıl artık yıldır.");
        }else{
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}
