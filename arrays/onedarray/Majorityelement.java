import java.util.*;

class Majorityelement {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check which numbers appear more than n/3 times
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        Majorityelement sol = new Majorityelement();
        int[] arr = {3, 2, 3};

        List<Integer> ans = sol.majorityElement(arr);
        System.out.println(ans); // Output: [3]
    }
}
