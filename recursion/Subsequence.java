package recursion;
import java.util.*;
public class Subsequence {
    static int[] arr={3,1,2};
    static void solve(int i,ArrayList<Integer> list){
        if(i==arr.length){
System.err.println(list);
return;
        }
        list.add(arr[i]);
        solve(i+1,list);
        list.remove(list.size()-1);
        solve(i+1,list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        solve(0,list);
    }
}
