import java.util.HashMap;
import java.util.HashSet;

class Findbenchandstudent
    {
public static void main(String args[]){
    int[][] arr={{},{}};
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    for(int[] stud:arr){
        int st=arr[0];
        int ben=arr[1];
        if(!map.contains(ben)){
map.put(ben,new HashSet<>());
        }
        map.get(ben).add(st);
    }
    int max=0;
    for(HashSet<Integer> s:map.values()){
max=Math.max(max,s.size());
    }
    System.out.println(max);
}
}