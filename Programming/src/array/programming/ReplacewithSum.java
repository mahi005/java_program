package array.programming;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacewithSum {
public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("enter "+size+" array elements");
	for(int i=0;i<=a.length-1;i++) {
		a[i] =sc.nextInt();
	}
	 System.out.println("==================================");
	for(int i=0;i<a.length-1;i++) {
		a[i] =sumOfDigit(a[i]);
	}
	
	System.out.println("after replacing");
	System.out.println(Arrays.toString(a));
}
public static int sumOfDigit(int n) {
	int sum=0;
	while(n>0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}
}
