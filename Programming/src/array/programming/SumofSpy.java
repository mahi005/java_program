package array.programming;

import java.util.Scanner;

public class SumofSpy {
public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner sc= new Scanner(System.in);
	int size= sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter "+size+" array elements");
	for(int i=0; i<=a.length-1;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("===============================");
	int spysum =0;
	for(int i=0;i<a.length-1;i++) {

		  if(isSpy(a[i]))
		   spysum=spysum+a[i];		
}
	System.out.println("sum of all spy number is" +spysum);
}
public static boolean isSpy(int n) {
	int sum =0;
	int product=1;
	while(n>0) {
		int rem =n%10;
		sum=sum+rem;
		product=product*rem;
		n=n/10;
	}

	if(sum==product) 
		return true;
	else
		return false;
	//return sum==product;
}
}