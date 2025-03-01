package array.programming;

import java.util.Arrays;

public class ZigzagMerging {
 public static void main(String[] args) {
	int a[]= {10,30,45};
	int b[] = {25,56,34,67};
	
	int c[] =zigZag(a,b);
	System.out.println(Arrays.toString(c));
}
 public static int[] zigZag(int a[],int b[]) {
	 int c[] = new int[a.length+b.length];
	 int in=0;
	 for(int i=0;i<=a.length|| i<b.length;i++) {
		 if(i<= a.length-1) {
			 c[in]=a[i];
			 in++;
		 }
		 if(i<=b.length-1) {
			 c[in]=b[i];
			 in++;
		 }
	 }
	 return c;
 }
}
