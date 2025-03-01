//strong number === sum of factorial of the input no's every digit is 
//                   equal to the same input no. 
package practice.programming;

import java.util.Scanner;

public class StrongNumber {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  number");
	int n = sc.nextInt();
	 boolean res=isStrongNumber(n);
	 System.out.println(res);
   }
   
   static boolean isStrongNumber(int n) {
	    int sum = 0;
	    while(n>0)
	    {
	    	int rem = n%10;
	    	int f = factorial(rem);
	          sum = sum+f;
	    	n=n/10;
	    	if(sum==n)
	    		return true;
	    	else
	    		return false;
	    		
	    }
		return false;
   }
	    static int factorial(int n) {
	    	int fact =1;
	    	for(int i=n;i>=1;i--) {
	    		fact=fact*i;
	    	}
	    	return fact;
	    }
   }

