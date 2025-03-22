package array.programming;

import java.util.Arrays;

public class ZerosElement {
 public static void main(String[] args) {
	int a[] = {0,2,6,7,0,6};
	
	 removeZeroes(a);
	 System.out.println(Arrays.toString(a));
}
 public static void removeZeroes(int a[]) {
	 int n=0;
	 for(int i=1;i<=a.length-1;i++) {
		 if(a[i]!=0) {
			 a[n++]=a[i];
		 }
	 }
		 while(n<a.length) {
			a[n++]=0; 
		 }
	 
 }
}
