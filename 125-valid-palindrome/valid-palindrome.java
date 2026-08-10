class Solution {
    public boolean isPalindrome(String s) {
        boolean out = true;
        s=s.toLowerCase();
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0;i<result.length()/2;i++){
            if(result.charAt(i)!=result.charAt(result.length()-1-i)){
                out= false;
            }
        }return out;

    }
}