class Solution {
    public int strStr(String haystack, String needle) {
        boolean match;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            match = true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j) ){
                   match = false;
                   break;
            }
            }if(match==true){
                return i;
            }
        }return -1;
    }
}