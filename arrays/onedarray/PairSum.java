package arrays.onedarray;
//finding the target sum in the array using two pointer 
import java.util.Arrays;

public class PairSum {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int target=9;
        int start=0;
    Arrays.sort(arr);
      //  boolean found=false;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
if(sum==target){
    System.out.print(arr[start]+" "+arr[end]);

break;
}
else if(sum>target){
    end--;
}
else {
    start++;
}
        }
    }
}
