public class MaxSub {
    public static void main(String[] args){
        int[] arr={-2, 2, -3, 4, -1, 2, -5, 4};
       // int n=arr.length;
       int sum=0;
       int ans=Integer.MIN_VALUE;
        for(int i:arr){
         sum=Math.max(i,i+sum);
         ans=Math.max(sum,ans);

        }
        System.out.println(ans);
    }
}
