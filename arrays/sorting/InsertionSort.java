package arrays.onedarray.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,6,3,7,8,100};
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j++){
                if(arr[j]>arr[j-1]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
                else{
                    break;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k);
        }
    }
}
