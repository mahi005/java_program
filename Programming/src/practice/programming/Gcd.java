package practice.programming;

public class Gcd {
	public static void main(String[] args) {
		 int n=12;
		   int m= 36;
		   int gcd = 0;
		   for(int i=1;i<n && i<m; i++) {
			   if(n%i==0 && m%i ==0)
				   gcd=i;
		   }
		     System.out.println(gcd);
		}

	}
  