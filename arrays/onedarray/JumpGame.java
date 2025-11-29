public class JumpGame {
    public static int jump(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;

        int jumps = 0;         // number of jumps made
        int currentEnd = 0;    // end of range we can reach with current number of jumps
        int farthest = 0;      // farthest index we can reach from indexes within current range

        for (int i = 0; i < nums.length - 1; i++) {
            // update farthest reach from position i
            farthest = Math.max(farthest, i + nums[i]);

            // if we've reached the end of the range for current jump,
            // we must increase jump count and extend the range to farthest
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // small optimization: if currentEnd already reaches or passes last index, break
                if (currentEnd >= nums.length - 1) break;
            }
        }

        return jumps;
    }

    // quick test
    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 1, 4}; // example from LeetCode
        System.out.println(jump(nums)); // expected output: 2
    }
}
