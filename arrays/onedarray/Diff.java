package arrays.onedarray;

class Diff {

    public int[] swap(int first, int second) {
        int t = first;
        first = second;
        second = t;
        return new int[]{first, second};
    }

    public int scoreDifference(int[] nums) {

        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {
                int[] res = swap(first, second);
                first = res[0];
                second = res[1];
            }

            if ((i + 1) % 6 == 0) {
                int[] res = swap(first, second);
                first = res[0];
                second = res[1];
            }

            first += nums[i];
        }

        return first - second;
    }

    public static void main(String[] args) {

        Diff obj = new Diff();

        int[] nums = {2,4,2,1,2,1};

        int result = obj.scoreDifference(nums);

        System.out.println("Score Difference: " + result);
    }
}