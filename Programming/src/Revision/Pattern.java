package Revision;

public class Pattern {
 public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//		   // System.out.print(j);	
//			//System.out.print(i);
//			//if(i%2==0) {
//			//if(j%2==0) {
//			if(i%2==0||j%2==0||i%2!=0&&j%2!=0){
//				System.out.print(1+ " ");
//			}else
//				System.out.print(0+ " ");
//		}
//		System.out.println();
//	}
	 
	 for(int i=1;i<=5;i++) {
		 for(int j=i;j<=5;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
}
}
