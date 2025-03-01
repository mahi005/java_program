package practice.programming;

import java.util.Scanner;

public class Dserium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(isDserium(n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    static boolean isDserium(int n){
        int cd = countDigit(n);
    	int sum = 0;
        int org = n;

        while (n>0) {
            int rem = n%10;
           int pow = (int)Math.pow(rem,cd);
           sum= sum +pow;
           n=n/10;
           //cd--;
        }
        return sum==org;
    }

    static int countDigit(int n){
        int count=0;
        while (n>0) {
            count++;
            n=n/10;
        }
        return count;
    }
}
