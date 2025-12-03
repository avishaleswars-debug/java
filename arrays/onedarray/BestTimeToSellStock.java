public class BestTimeToSellStock{
    public static void main(String args[]){
        int[] arr={100,180,260,310,40,535,695};
        int n=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=arr[j]-arr[i];
                max=Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}