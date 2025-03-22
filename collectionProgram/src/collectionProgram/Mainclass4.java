package collectionProgram;
class Pen{
	
}
class Book{
	
}
public class Mainclass4 {
 public static void main(String[] args) {
	Object[] arr= new Object[5];
	arr[0]= new Pen();
	arr[1]= new Pen();
	arr[2]= new Book();
	arr[3]= new Book();
	arr[4]= "core java";
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
