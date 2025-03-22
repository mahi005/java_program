package string.programming;
//wap to count how many words are present in given string
public class CountTheNmberWords {  
  public static void main(String[] args) {
	  String s="Ram   .is Good";
	  int count=0;
	  char ch[]=s.toCharArray();
	  for(int i=0;i<=ch.length-1;i++) {
		  if(i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1]==' ') {
			  count++;
		  }
	  }
	  System.out.println(count);
}
}
