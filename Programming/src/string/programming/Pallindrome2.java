package string.programming;

public class Pallindrome2 {
public static void main(String[] args) {
	String s="gadag";
	String rev = new StringBuffer(s).reverse().toString();
	
	if(s.equals(rev))
		System.out.println("Pallindrom");
	else
	System.out.println("not");
   }
}
