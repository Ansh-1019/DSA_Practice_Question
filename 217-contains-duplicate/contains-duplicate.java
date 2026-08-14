class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean out = false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length; i++){
            if(set.contains(nums[i])){
                out = true;
                break;
            }
            set.add(nums[i]);
        }return out;
    }
}