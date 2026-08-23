class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        
        int MaxArea = 0;
        for(int i =0; i< height.length; i++){
            int width = right - left;
            int fheight = Math.min(height[left], height[right]);
            int area = width * fheight;
            MaxArea = Math.max(area, MaxArea);
            if (height[left] < height[right]){
                left++;
            }else
                right--;
        }return MaxArea;
    }
}