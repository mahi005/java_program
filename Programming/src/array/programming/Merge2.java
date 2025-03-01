package array.programming;

import java.util.Arrays;

public class Merge2 {
  public static void main(String[] args) {
	int a[]= {10,6,3};
	int b[]= {4,7,8};
	System.out.println("after merging");
	int arr[]=merge(a,b);
	System.out.println(Arrays.toString(arr));
}
  
  private static int[] merge(int[]a,int[]b) {
	  int c[]=new int[a.length+b.length];
	  for(int i=0;i<=a.length-1;i++) {
		  c[i]=a[i];
	  }
	  for(int i=0;i<b.length-1;i++) {
		  c[a.length+i]=b[i];
	  }
	  return c;
  }
}
