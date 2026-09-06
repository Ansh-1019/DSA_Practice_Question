class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
        int answer = n;

        for (int i = 0; i < n; i++) {
            answer = answer ^ i ^ nums[i];
        }

        return answer;
    }
}