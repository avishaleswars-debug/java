import java.util.Stack;

public class LC907 {
     public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int[] arr={3,1,2,4};
        int[] ans=new int[arr.length];
        int[] ans2=new int[arr.length];
        //previous smaller element
        for(int i=0;i<arr.length;i++)
        {
    while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
        s.pop();
    }
    if(s.isEmpty())
    ans[i]=-1;
   
else
    ans[i]=s.peek();
    s.push(i);

        }s.clear();
        for(int i=arr.length-1;i>=0;i--){
    while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
        s.pop();
    }
    if(s.isEmpty())
    ans2[i]=arr.length;
   
else
    ans2[i]=s.peek();
    s.push(i);
        }
        //contribution of each element in the final answer
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int left=i-ans[i];
            int right=ans2[i]-i;
            sum+=arr[i]*left*right;
        }
        System.out.println(sum);
    }
}

