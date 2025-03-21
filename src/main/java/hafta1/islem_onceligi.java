package hafta1;

import java.util.Scanner;

public class islem_onceligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.println("3. sayıyı giriniz: ");
        int c = scanner.nextInt();

        int islem = a+(b*c)-b;
        System.out.println("işlem sonucu: " + islem);
    }
}
