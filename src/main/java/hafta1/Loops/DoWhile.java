package hafta1.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password ="1234";
        int count=0;
        System.out.println("Please enter your password");
        String input = scanner.nextLine();
        do {
            if(input.equals(password)) {
                System.out.println("Password is correct");
                break;
            }
            else {
                System.out.println("Password is not correct");
                count++;
            }

        }while(count<3);{}
    }
}
