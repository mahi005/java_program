package practice.programming;

import java.util.Scanner;

public class MagicNumber {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	
	if(isMagicNumber(n))
		System.out.println("magic no");
	else
		System.out.println(" not");
	
	
	}
    static boolean isMagicNumber(int n) {
		
    	while(n>9) 
    	{
    		int sum = 0;
    		while(n>0) {
    		int rem = n%10;
    		sum=sum+rem;
    		n=n/10;
    	}	
    		n=sum;
    	 }
	  return n==1;
    }
   
}
