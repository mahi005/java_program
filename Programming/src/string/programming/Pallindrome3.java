package string.programming;

public class Pallindrome3 {
 public static void main(String[] args) {
	String s="gadag";
	if(isPallindrome(s)) {
		System.out.println("pallindrome");
	}else {
		System.out.println("not");
	}
}
 public static boolean isPallindrome(String s) {
	 int i=0,j=s.length()-1;
	 while(i<j) {
		 if(s.charAt(i)!=s.charAt(j)) 
			 return false;
		 
			 i++;
			 j--;
		 }
		 return true;
	 }
 }

