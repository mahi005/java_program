package string.programming;

public class Unique {
public static void main(String[] args) {
	String s="abcdambhld";
	String ss=" ";
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			String str=s.substring(i,j);
			System.out.println(str);
		}
	}
	
}
}
