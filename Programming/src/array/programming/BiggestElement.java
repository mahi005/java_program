package array.programming;

public class BiggestElement {
	public static void main(String[] args) {
		int a[] = {10,34,6,71};
	     int big =a[0];
	     
	     for(int i=1;i<=a.length-1;i++) {
	    	 if(a[i]>big) {
	    		 big=a[i];
	    	 }	 
	     }
	     System.out.println(big);
	}
}
