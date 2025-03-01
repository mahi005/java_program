package Revision;

import java.util.Scanner;

public class LinearSearchArray {
 public static void main(String[] args) {
	int a[]= {23,3,56,44,2,14,6};
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the searching ");
	int n=sc.nextInt();
	
	int position=linearSearch(a,n);
	if(position== -1)
		System.out.println("Not Found");
	else
		 System.out.println("Found at index: " + position);  
}
 public static int linearSearch(int a[], int n) {
	 for(int i=0;i<=a.length-1;i++) {
		 if(a[i]==n) {
			 return i;
		 }
	 }
	 return -1;
 }
}
