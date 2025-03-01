package array.programming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPallindrome {
  public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner sc= new Scanner(System.in);
	int size= sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter "+size+" array elements");
	for(int i=0; i<=a.length-1;i++) {
		a[i]=sc.nextInt();
	}
	  int count=0;
	  for(int i=0;i<a.length-1;i++) {
          // System.out.println(Arrays.toString(a));
		  if(isPallindrome(a[i]))
			  count++;
	  }
	  System.out.println("no of pallindrome Element are "+count);
}

  public static boolean isPallindrome(int n) {
	  int rev=0;  
	  int temp=n;
	  while(n>0) {
		  int rem=n%10;
		  rev=rev*10+rem;
		  n=n/10;
	  }
	  if(temp==rev) 
		  return true;
	  
	  else
		  return false;
  }
}
