

package array.programming;

public class ArraySorting {
 public static void main(String[] args) {
	 int[] arr ={14,13,15,18,17};
     System.out.println("---------------before sorting---------------------");
     for(int i =0;i<arr.length;i++){
       System.out.println(arr[i]);
     } 
     for(int i =0;i<arr.length;i++){
       for(int j =i+1;j<arr.length;j++){
             if(arr[i]> arr[j]){
                 int t = arr[i];
                 arr[i]= arr[j];
                 arr[j] = t;
             }
       }
     }
     System.out.println("---------------Ascending order--------------------");
     for(int i =0;i<arr.length;i++){
       System.out.println(arr[i]);
     }

}
}
