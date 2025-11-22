package recursion;

public class SumofArray {
   static int sumofarray(int a[],int n){
        if(n<0){
            return 0;
        }
        return a[n]+sumofarray(a,n-1);
    }
    public static void main(String[] rags){
        int arr[]={1,2,3,4,5,8};
        System.out.print(sumofarray(arr,5));
    }
}
