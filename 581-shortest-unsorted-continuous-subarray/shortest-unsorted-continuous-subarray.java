class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        while(left<nums.length && nums[left] == sorted[left]){
            left++;
        }if(left == nums.length){
            return 0;
        }while(right<nums.length && nums[right] == sorted[right]){
            right--;
        }return right - left+1;
    }
}