package patternProgramming;

public class Programm19 {
 public static void main(String[] args) {
	 int n=7, st=1,sp=n/2;
	 for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print(" ");
		}
		int x=1;
		for(int k=1;k<=st;k++) {
			System.out.print(x + " ");
			if(k<=st/2) {
				x++;
			}else {
				x--;
			}
		}
		
		if(i<=n/2) {
			sp--;
			st=st+2;
		}else {
			sp++;
			st=st-2;
		}
		System.out.println();
	}
}
}
