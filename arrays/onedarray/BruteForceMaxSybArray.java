package arrays.onedarray;
//using bruteofrce find max sum array 
public class BruteForceMaxSybArray {
    public static void main(String[] args) {
        int arr[]={1,-2,3,6-4,-5};
        int n=arr.length;
     
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for(int j=i;j<n;j++){
sum=sum+arr[j];
if(sum>max){
    max=sum;
}
            }
           
        }
        System.out.println("the maximum subarray is "+max);
    }
}
