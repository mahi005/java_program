package array.programming;

public class FirstTwoUniqueElement {
 public static void main(String[] args) {
	 int arr[] = {10,20,30,20,40,40,50,-1};
	 int uniqueCount=0;
     boolean arr2[] = new boolean[arr.length];
     for(int i=0; i<arr.length; i++){
         if(arr2[i]==false){
             int count = 1;
             for(int j=i+1; j<arr.length; j++){
                 if(arr[i]==arr[j]){
                     count++;
                     arr2[j] = true;
                 }
             }
             if(count==1) {
	                System.out.println(arr[i]);
	                uniqueCount++;
	                if(uniqueCount==2) {
		                break;
	                }

             }
     }
     }
}
}
