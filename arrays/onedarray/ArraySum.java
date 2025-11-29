package arrays.onedarray;
//sum and multiple of array using reccursion
public class ArraySum {
    public static int sum(int[] arr,int n){
if(n==0){
    return 1;
}
return arr[n]*sum(arr,n-1);
    }
    public static void main(String[] args) {
        int n=4;
        int[] arr={1,2,3,4,5};
        System.out.print(sum(arr,n));
    }
}
