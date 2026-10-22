class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        if (n <= 1) return 0;

        // Case 1: Rotate the original array to sorted order
        int k = rotationsToSorted(nums);
        int ans = Integer.MAX_VALUE;

        if (k != -1) {
            ans = Math.min(k, n - k + 2);
        }

        // Case 2: Reverse, then rotate to sorted order
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }

        k = rotationsToSorted(reversed);

        if (k != -1) {
            ans = Math.min(ans, Math.min(k + 1, n - k + 1));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int rotationsToSorted(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;

            if (nums[next] != (nums[i] + 1) % n) {
                return -1;
            }
        }

        // Number of left rotations needed to put 0 first
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}