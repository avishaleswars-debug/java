package recursion;
import java.util.*;
public class Subset {

    static int[] arr={1,5,11,5};
    static int target=3;
    static int count=0;
    static ArrayList<Integer> ans=new ArrayList<>();
    static void solve(int i,ArrayList<Integer> list,int sum){
        if(i==arr.length){
//System.err.println(list);
System.out.print(sum+"  ");
    System.err.println(list);

   // System.out.println(list);

return;
        }
        
        list.add(arr[i]);
        solve(i+1,list,sum+arr[i]);
        list.remove(list.size()-1);
        solve(i+1,list,sum );
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        solve(0,list,sum);
        System.out.println(count);
    }
}


