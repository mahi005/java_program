package practice.programming;

import java.util.Scanner;

public class PowerOfNum {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number for power value") ;
	int n = sc.nextInt();
	System.out.println("Enter number for power") ;
	int p = sc.nextInt();
	
	int pow = power(n,p);
	System.out.println(pow);
 }
  static int power(int n , int p) {
	  {
		  int pow = 1;
		  for(int i =1; i<=p;i++) {
			  pow = pow*n;
		  }
		  return(pow);
	  }
  }
}
