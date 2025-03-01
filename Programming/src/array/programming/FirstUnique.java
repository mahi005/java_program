package array.programming;

public class FirstUnique {
	 public static void main(String[] args) {
	        int arr[] = {12, 12, 45, 98, 15, 45, -1};
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
		                break;
	                }
	        }
	        }
	    }
}
