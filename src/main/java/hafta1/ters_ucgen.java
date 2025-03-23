package hafta1;

import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();
        for (int i = basamak; i >0 ; i--) {

            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
