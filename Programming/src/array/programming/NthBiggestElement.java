package array.programming;

import java.util.Arrays;
//without repeating values inside arrays--------------------------------------
public class NthBiggestElement {
 public static void main(String[] args) {
	int a[]= {40,10,30,20};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	int n=1;
	System.out.println(a[a.length-n]);//biggest Element
	System.out.println(a[n-1]);//smallest Element
}
}
