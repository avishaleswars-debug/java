package recursion;

public class MergeSort {
    static void mergesort(int[] arr,int l,int r){
        int mid=l+r/2;
        if(l>=r){
            return;
        }
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r - l + 1];
         int i=l;
         int j=mid+1;
         int k=0;
         while(i<=mid&&j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
         }
         while(i<=mid){
            temp[k++]=arr[i++];
         }
         while(j<=r){
            temp[k++]=arr[j++];
         }
         for (i = l; i <= r; i++) {
            arr[i] = temp[i - l];
        }
    }
    public static void main(String[] args) {
        int[] arr={9,38,29,0};
        mergesort(arr,0,arr.length-1);
    }
}
