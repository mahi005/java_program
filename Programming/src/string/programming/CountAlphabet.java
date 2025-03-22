//WAP TO COUNT HOW MANY APLHABETS,DIGITS AND SPECIAL CHARCTER PRESENT IN GIVEN STRING
package string.programming;

public class CountAlphabet {
public static void main(String[] args) {
	String s="abc@123";
	int ac=0,dc=0,sc=0;
	for(int i=0;i<=s.length()-1;i++) {
		char ch=s.charAt(i);
		if(ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z') {
			ac++;
		}
		else if(ch>='0' && ch<='9') {
			dc++;
		}
		else {
			sc++;
		}
	}
	System.out.println("AlphabetCount :" +ac);
	System.out.println("DigitCount :" +dc);
	System.out.println("SpecialCharacterCount :" +sc);
}
}
