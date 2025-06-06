package CountVowels;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
        sc.close();
    }
}

