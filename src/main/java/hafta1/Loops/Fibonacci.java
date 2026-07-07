package hafta1.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many terms of the Fibonacci sequence would you like to see?: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] fibonacci = new int[number];

        // Initialize first two terms
        if (number >= 1) fibonacci[0] = 0;
        if (number >= 2) fibonacci[1] = 1;

        // Calculate remaining terms: F(n) = F(n-1) + F(n-2)
        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the sequence
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
