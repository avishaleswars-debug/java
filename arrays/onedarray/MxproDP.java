public class MxproDP {
    public static void main(String[] args) {
          // code here
          int arr[]={-1, -3, -10, 0, 6};
        int ans=arr[0];
        int ansm=arr[0];
        int pro=arr[0];
        for(int k=1;k<arr.length;k++){
            int i=arr[k];
            if(i<0){
                int t=ans;
                ans=ansm;
                ansm=t;
            }
            ans=Math.max(i,ans*i);
            ansm=Math.min(i,ansm*i);
            pro=Math.max(pro,ans);
        }
        System.out.print(pro);
    
    } 
      

}
