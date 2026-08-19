package recursion;

import java.util.*;

public class Solution {

    static void subsequences(int[] arr, int index, List<Integer> list) {

        // Print current subsequence
        System.out.println(list);

        // Try every possible next element
        for (int i = index; i < arr.length; i++) {

            // Pick
            list.add(arr[i]);

            // DFS
            subsequences(arr, i + 1, list);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        subsequences(arr, 0, new ArrayList<>());
    }
}
