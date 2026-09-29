class Solution {
    public int firstUniqChar(String s) {
        int out = -1;
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }for(int i = 0; i<s.length(); i++){
            if (count[s.charAt(i)-'a']==1){
                out = i;
                break;
            }
        }return out;
    }
}