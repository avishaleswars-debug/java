package arrays.onedarray;
//sum of array fron start to end input 1,2,3,4,5,6 output 1 3 6 10 15 21
public class Prefix {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
       
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
