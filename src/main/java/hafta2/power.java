package hafta2;

import java.util.Scanner;

public class power {//üs alan program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban değerini giriniz: ");
        int taban = scanner.nextInt();
        System.out.println("üs değerini giriniz: ");
        int us = scanner.nextInt();

        int result = power(taban, us);

        System.out.println(result);
    }

    private static int power(int taban, int us) {
        //kendini çağırma noktasından çıkış kontrolü koydum.
        if(us==0) return 1;

        return taban* power(taban, us-1);

    }


}
