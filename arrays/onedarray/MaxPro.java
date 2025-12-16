public class MaxPro {
    
    public static void main(String[] args){
        int[] arr={ 2, 3, -8, 7, -1, 2, 3};
        int n=arr.length;
       int sum=0;
       int ans=Integer.MIN_VALUE;
       for(int k=0;k<n;k++){
      for(int i=k;i<n;i++){
        sum=0;
        for(int j=i;j<n;j++){
            sum+=arr[j];
        }
        if(sum>ans){
            ans=sum;
        }
      }
    }
        System.out.println(ans);
    }


}
