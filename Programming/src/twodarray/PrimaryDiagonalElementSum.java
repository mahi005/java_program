package twodarray;

public class PrimaryDiagonalElementSum {
public static void main(String[] args) {
	int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
	int sum=0;
	int sum2=0;
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a[i].length-1;j++) {
			if(i==j) {
				sum=sum+a[i][j];
			}
			if(i+j==a.length-1) {
				sum2=sum2+a[i][j];
			}
		}
	}

	System.out.println(sum);
	System.out.println(sum2);
}
}
//WAP to transpose the matrix
