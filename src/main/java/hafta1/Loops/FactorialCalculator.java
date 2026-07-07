package hafta1.Loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int factorial=1;

        for (int i = 1; i <= number ; i++) {

            factorial= factorial*i;
        }

        System.out.println("The factorial of the number:"+ factorial);
    }
}
