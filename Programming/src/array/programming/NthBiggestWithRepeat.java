package array.programming;

import java.util.Arrays;
import java.util.HashSet;

public class NthBiggestWithRepeat {
 public static void main(String[] args) {
	int a[]= {10,20,30,10,20,40};
	int n=2;
	int b[]= removeDuplicates(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	System.out.println(b[n-1]); //nth smallest elements
	System.out.println(a[b.length-n]);//nth biggest Element
}
 public static int[] removeDuplicates(int a[]){
	 HashSet<Integer> hs=new HashSet(); //it won't allow duplicate elements
		
		for(int i=0;i<=a.length-1;i++) {
			hs.add(a[i]);
		}
		int b[]=new int[hs.size()];
		int in=0;
		for(int ele:hs)
		{
			b[in]=ele;
			in++;
		}
		return b;
 }
}
