package array.programming;

public class PrimeElement {
 public static void main(String[] args) {
	int a[]= new int[6];
	a[0]=72;      
	a[1]=172;
	a[2]=10;
	a[4]=52;
	a[5]=12;

	for(int i=0;i<=a.length-1;i++) {
		if(isPrime (a[i]))
			System.out.println(a[i]);
	}
		System.out.println("prime number is not present in array");
	
}
 public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++) {
		  if(n%i==0)
			  return false;
		}
		return true;
	}
}
