package practice.programming;

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int dec = sc.nextInt();
	   String n1=convertBinary(dec);
	   System.out.println(n1);
}
  static String convertBinary(int dec){
	  String bin=" ";
	  while(dec>0) {
		 int rem= dec%2;
		 bin = rem+bin;
		 dec=dec/2;
		 
	  }
	   return bin;
  }
}
