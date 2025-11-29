package arrays.onedarray;
public class Reverse {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        int temp=0;
       while(start<end){
temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
       }
       for(int i:arr){
        System.out.print(i);
       }
       
    }
}
