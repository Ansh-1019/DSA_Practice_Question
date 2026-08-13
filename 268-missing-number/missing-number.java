class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int out=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=i){
                out = i;
                break;
            }else{
                out = i+1;
            }
            
        }return out;
    }
}