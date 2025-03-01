package practice.programming;

import java.util.Scanner;

public class HappyNumber {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	if(isHappyNumber(n))
		System.out.println("happy no");
	else
		System.out.println(" not");
	
}
  static boolean  isHappyNumber(int n) {
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
