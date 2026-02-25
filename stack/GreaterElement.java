import java.util.Stack;
public class GreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int[] arr={1,2,3,4,5};
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {

    while(!s.isEmpty()&&s.peek()>arr[i]){
        s.pop();
    }
    if(s.isEmpty())
    ans[i]=-1;
   
else
    ans[i]=s.peek();
    s.push(arr[i]);

        }
        for(int i:ans)System.out.print(i);
    }
}
