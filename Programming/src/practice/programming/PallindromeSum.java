package practice.programming;

import java.util.Scanner;

public class PallindromeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (isPalindrome(i)) {  // Fixed: No semicolon
                sum += i;  
            }
        }

        System.out.println("Sum of palindrome numbers: " + sum);
        sc.close();  // Close scanner to prevent memory leak
    }

    public static boolean isPalindrome(int n) {  // Fixed method name
        int rev = 0;
        int num = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev == num;  // Direct return
    }
}
