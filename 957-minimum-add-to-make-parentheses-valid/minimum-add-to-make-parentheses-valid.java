class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int counter = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty() && s.charAt(i)==')')
                    stack.push(s.charAt(i));
                else if(stack.peek()=='(' && s.charAt(i)== ')'){
                    stack.pop();
            }   else{
                    stack.push(s.charAt(i));
            }
        }
    }return stack.size();
}}