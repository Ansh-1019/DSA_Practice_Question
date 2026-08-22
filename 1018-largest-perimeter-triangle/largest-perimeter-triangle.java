class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int out = 0;
        Arrays.sort(nums);
        for(int i = n-1 ; i>=2; i--){
            if(nums[i]<nums[i-2]+nums[i-1]){
                out = nums[i]+nums[i-2]+nums[i-1];
                break;
        }}return out;   
        }
        }
    
