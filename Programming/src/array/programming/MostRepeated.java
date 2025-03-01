package array.programming;

public class MostRepeated {
	 public static void main(String[] args) {
	        int arr[] = {10,20,30,10,10,20};
	        int maxcount=0, max=0;
	        boolean b[] = new boolean[arr.length];
	        for(int i=0; i<arr.length; i++){
	            if(b[i]==false){
	                int count = 1;
	                for(int j=i+1; j<arr.length; j++){
	                    if(arr[i]==arr[j]){
	                        count++;
	                        b[j] = true;
	                    }
	                }
	                if(count>maxcount) {
	                	maxcount=count;
	                	max=arr[i];
	                }
	        }
	        }
            System.out.println(max);
	    }    
}
