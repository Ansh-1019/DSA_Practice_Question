class Solution {
    public boolean isPalindrome(int x) {
        boolean out = false;
        int nums = x;
        int reversed = 0;
        if(x<0){
            out= false;
        }else{
            while (nums != 0) {
            int digit = nums % 10;       
            reversed = reversed * 10 + digit;
            nums /= 10;                  
            }if(reversed == x){
                out = true;
            }       
        }return out;
    }
}