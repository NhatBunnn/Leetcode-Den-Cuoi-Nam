// https://leetcode.com/problems/valid-parentheses/?envType=problem-list-v2&envId=stack

// [20. Valid Parentheses]

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}