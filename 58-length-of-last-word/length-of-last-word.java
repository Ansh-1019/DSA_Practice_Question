class Solution {
    public int lengthOfLastWord(String s) {
        String out = "";
        for (String word : s.split("\\s+")) {
            out = word;
    }return out.length();
}}