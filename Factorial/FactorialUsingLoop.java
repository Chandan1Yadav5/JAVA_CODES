//Explaination : This program calculates the factorial of a number using a loop.
//Factorial of 5 is 5×4×3×2×1 = 120.


package Factorial;
import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
}
