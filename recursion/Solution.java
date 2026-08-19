package recursion;

import java.util.*;

public class Solution {
static boolean[] bool=new boolean[4];
    static void subsequences(int[] arr, int index, List<Integer> list) {

        // Print current subsequence
        System.out.println(list);

        // Try every possible next element
        for (int i = index; i < arr.length; i++) {

            // Pick
            list.add(arr[i]);
            bool[i]=true;
            // DFS
            subsequences(arr, i + 1, list);

            // Backtrack
            list.remove(list.size() - 1);
            bool[i]=false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4};

        subsequences(arr, 0, new ArrayList<>());
    }
}
