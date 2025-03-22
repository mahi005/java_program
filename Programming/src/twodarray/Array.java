package twodarray;

public class Array {
  public static void main(String[] args) {
	int a[][]= {{10,20,30},{40,50,60},{70,80,90},{20,40,60}};
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<=a[i].length-1;j++) {
			System.out.println(a[i][j]);
		}
		System.out.println();
	}
}
}
//rows -based on 2d array length
//col- based on 1d array length

//WAP to print sum of diagonal element in 2d element