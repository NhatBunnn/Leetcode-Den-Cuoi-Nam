class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                        // regular expression (regex)

        if(s.length() <= 1) return true;

        int left = 0;
        int right = s.length()-1;

        char[] chars = s.toCharArray();

        while(left <= right){
            if(chars[left] != chars[right]){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}