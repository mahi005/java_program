package array.programming;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateValue {
 public static void main(String[] args) {
	int a[]= {10,20,30,10,20,40};
	HashSet<Integer> hs=new HashSet(); //it won't allow duplicate elements
	
	for(int i=0;i<=a.length-1;i++) {
		hs.add(a[i]);
	}
	//System.out.println(hs);
	int b[]=new int[hs.size()];//creating nre array with size of hs
//	for(int i:a) {
//		System.out.println(i);
//	}
	int in=0;
	for(int ele:hs)//copying one by one elements from hashset to array 
	{
		b[in]=ele;
		in++;
	}
	System.out.println("After removing duplicate value");
	System.out.println(Arrays.toString(b));
}
}
//for-each-loop
//syntax--------------
//for(arrayType varname :ArrayName){
//ro-eachloop-body
//}


//-------------------------------------------print array using for each------------------------------------------
//int p[]= {1,3,2,4};
//for(int v:p) {
//	System.out.println(v);
//}

//-------------------------------------------print sum of array element using for each------------------------------------------
//int p[]= {1,3,2,4};
//sum=0;
//for(int ele:p) {
// sum=sum+ele;
//system.out.println(sum)0
//}

