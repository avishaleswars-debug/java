package arrays.onedarray;
public class KsumSubarray {
    public static void main(String args[]){
        int end=0 ,start=0,count=0, sum=0;
        int arr[]={1,2,3,4,5,5,6,7};
        int k=7;
        while (end<arr.length) {
            sum+=arr[end];
            while (sum>k && end>=start) {
                sum-=arr[start];
                start++;
            }
            if(sum==k){
                count++;
            }
            end++;
        }
        System.out.print(count);
    }
}
