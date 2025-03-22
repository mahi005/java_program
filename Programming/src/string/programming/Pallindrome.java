package string.programming;

public class Pallindrome {
 public static void main(String[] args) {
	String s ="gadag";
	if(isPallindrome(s)) {
		System.out.println("pallindrome");
	}else {
		System.out.println("not");
	}
}
 public static boolean isPallindrome(String s) {
	 {
		 String rev="";
		 for(int i=s.length()-1;i>=0;i--) {
			 char ch = s.charAt(i);
			 rev=rev+ch;
		 }
		 if(s.equals(rev)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
 }
}
